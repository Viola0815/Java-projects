import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {
    public static void main(String[] args) {
        String subject;

        System.out.println("Email Test:");
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        subject = "viola0815666@gmail.com";
        testRegexPattern(emailPattern, subject);
        subject = "00123***";
        testRegexPattern(emailPattern, subject);
        System.out.println("------------------");

        System.out.println("Date Test:");
        String datePattern = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
        subject = "2023-10-30";
        testRegexPattern(datePattern, subject);
        subject = "10/30/2023";
        testRegexPattern(datePattern, subject);
        System.out.println("------------------");

        System.out.println("Phone Number Test:");
        String phonePattern = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        subject = "929-666-0998";
        testRegexPattern(phonePattern, subject);
        subject = "0000-****-888888";
        testRegexPattern(phonePattern, subject);
        System.out.println("------------------");

        System.out.println("Student ID Test:");
        String studentIDPattern = "^[0-9]{9}$";
        subject="002626334";
        testRegexPattern(studentIDPattern, subject);
        subject="abc0202123";
        testRegexPattern(studentIDPattern, subject);
        System.out.println("------------------");

        System.out.println("Zip Code Test:");
        String zipCodePattern = "^[0-9]{5}(-[0-9]{4})?$";
        subject = "95131";
        testRegexPattern(zipCodePattern, subject);
        subject = "95131-4331";
        testRegexPattern(zipCodePattern, subject);
        subject = "12-12-336-622";
        testRegexPattern(zipCodePattern, subject);
        System.out.println("------------------");
    }

    public static void testRegexPattern(String regex, String subject) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(subject);

        if (matcher.matches()) {
            System.out.println(" valid: " + subject);
        } else {
            System.out.println(" invalid: " + subject);
        }
    }
}
