import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    private StringBuilder currentInput = new StringBuilder("0");
    private double result = 0;
    private String operator = "";
    private Text inputDisplay = new Text("0");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        GridPane grid = createLayout();
        setupButtons(grid);

        Scene scene = new Scene(grid, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createLayout() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.add(inputDisplay, 0, 0, 4, 1);
        return grid;
    }

    private void setupButtons(GridPane grid) {
        String[][] buttonLabels = {
                {"c"},
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0","=", "+"}
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            for (int j = 0; j < buttonLabels[i].length; j++) {
                addButton(grid, buttonLabels[i][j], j, i + 1);
            }
        }
    }

    private void addButton(GridPane grid, String label, int col, int row) {
        Button button = new Button(label);
        button.setOnAction(e -> handleButtonClick(label));
        grid.add(button, col, row);
    }

    private void handleButtonClick(String label) {
        if (label.matches("[0-9]")) {
            handleNumberClick(label);
        } else {
            handleOperationClick(label);
        }
        updateDisplay();
    }

    private void handleNumberClick(String number) {
        if (currentInput.toString().equals("0")) {
            currentInput = new StringBuilder(number);
        } else {
            currentInput.append(number);
        }
    }

    private void handleOperationClick(String operation) {
        if (!currentInput.toString().isEmpty()) {
            if (operation.equals("C")) {
                clear();
            } else if (operation.equals("=")) {
                calculate();
            } else {
                operator = operation;
                result = Double.parseDouble(currentInput.toString());
                currentInput = new StringBuilder("0");
            }
        }
    }

    private void calculate() {
        if (!currentInput.toString().isEmpty()) {
            double secondNumber = Double.parseDouble(currentInput.toString());
            switch (operator) {
                case "+":
                    result += secondNumber;
                    break;
                case "-":
                    result -= secondNumber;
                    break;
                case "*":
                    result *= secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result /= secondNumber;
                    } else {
                        currentInput = new StringBuilder("Error");
                        return;
                    }
                    break;
            }
            currentInput = new StringBuilder(Double.toString(result));
            operator = "";
        }
    }

    private void clear() {
        currentInput = new StringBuilder("0");
        result = 0;
        operator = "";
    }

    private void updateDisplay() {
        inputDisplay.setText(currentInput.toString());
    }
}
