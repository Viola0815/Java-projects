package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.ByteArrayInputStream;
import java.io.StringReader;

public class XmlJsonParser {

    public static void main(String[] args) {
        String xmlData = "<BookShelf>" +
                            "<Book>" +
                                "<title>Book1</title>" +
                                "<publishedYear>2021</publishedYear>" +
                                "<numberOfPages>200</numberOfPages>" +
                                "<authors>" +
                                    "<author>Author1</author>" +
                                "</authors>" +
                            "</Book>" +
                            "<Book>" +
                                "<title>Book2</title>" +
                                "<publishedYear>2022</publishedYear>" +
                                "<numberOfPages>250</numberOfPages>" +
                                "<authors>" +
                                    "<author>Author2</author>" +
                                    "<author>Author3</author>" +
                                "</authors>" +
                            "</Book>" +
                            "<Book>" +
                                "<title>Book3</title>" +
                                "<publishedYear>2023</publishedYear>" +
                                "<numberOfPages>300</numberOfPages>" +
                                "<authors>" +
                                    "<author>Author4</author>" +
                                    "<author>Author5</author>" +
                                "</authors>" +
                            "</Book>" +
                        "</BookShelf>";

        String jsonData = "{" +
                            "\"BookShelf\": {" +
                                "\"Book\": [" +
                                    "{" +
                                        "\"title\": \"Book1\"," +
                                        "\"publishedYear\": 2021," +
                                        "\"numberOfPages\": 200," +
                                        "\"authors\": [\"Author1\"]" +
                                    "}," +
                                    "{" +
                                        "\"title\": \"Book2\"," +
                                        "\"publishedYear\": 2022," +
                                        "\"numberOfPages\": 250," +
                                        "\"authors\": [\"Author2\", \"Author3\"]" +
                                    "}," +
                                    "{" +
                                        "\"title\": \"Book3\"," +
                                        "\"publishedYear\": 2023," +
                                        "\"numberOfPages\": 300," +
                                        "\"authors\": [\"Author4\", \"Author5\"]" +
                                    "}" +
                                "]" +
                            "}" +
                        "}";

        parseAndPrintXml(xmlData);

        parseAndPrintJson(jsonData);

        addBookToJson(jsonData);

        parseAndPrintJson(jsonData);
    }

    private static void parseAndPrintXml(String xmlData) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
             ByteArrayInputStream inputStream = new ByteArrayInputStream(xmlData.getBytes("UTF-8"));
        
        Document document = builder.parse(new InputSource(inputStream));

            NodeList bookList = document.getElementsByTagName("Book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Element bookElement = (Element) bookList.item(i);
                String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                String publishedYear = bookElement.getElementsByTagName("publishedYear").item(0).getTextContent();
                String numberOfPages = bookElement.getElementsByTagName("numberOfPages").item(0).getTextContent();
                NodeList authors = bookElement.getElementsByTagName("author");

                System.out.println("XML Book Entry:");
                System.out.println("Title: " + title);
                System.out.println("Published Year: " + publishedYear);
                System.out.println("Number of Pages: " + numberOfPages);

                if (authors.getLength() > 0) {
                    System.out.print("Authors: ");
                    for (int j = 0; j < authors.getLength(); j++) {
                        System.out.print(authors.item(j).getTextContent() + " ");
                    }
                    System.out.println();
                }

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseAndPrintJson(String jsonData) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();

        JsonArray bookArray = jsonObject.getAsJsonObject("BookShelf").getAsJsonArray("Book");
        for (int i = 0; i < bookArray.size(); i++) {
            JsonObject bookObject = bookArray.get(i).getAsJsonObject();

            String title = bookObject.get("title").getAsString();
            int publishedYear = bookObject.get("publishedYear").getAsInt();
            int numberOfPages = bookObject.get("numberOfPages").getAsInt();
            JsonArray authors = bookObject.getAsJsonArray("authors");

            System.out.println("JSON Book Entry:");
            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);

            if (authors.size() > 0) {
                System.out.print("Authors: ");
                for (int j = 0; j < authors.size(); j++) {
                    System.out.print(authors.get(j).getAsString() + " ");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    private static void addBookToJson(String jsonData) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);

        JsonObject newBook = new JsonObject();
        newBook.addProperty("title", "NewBook");
        newBook.addProperty("publishedYear", 2024);
        newBook.addProperty("numberOfPages", 350);

        JsonArray newAuthors = new JsonArray();
        newAuthors.add("Author6");
        newAuthors.add("Author7");

        newBook.add("authors", newAuthors);

        jsonObject.getAsJsonObject("BookShelf").getAsJsonArray("Book").add(newBook);

        String updatedJsonData = gson.toJson(jsonObject);

        System.out.println("Updated JSON after adding a book:");
        System.out.println(updatedJsonData);
        System.out.println();
    }
}
