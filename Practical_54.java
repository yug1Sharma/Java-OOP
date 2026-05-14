import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Practical_54 extends Application
{
    public void start(Stage stage)
    {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(e ->
        {
            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            int roll, age;

            try
            {
                roll = Integer.parseInt(rollText);
                age = Integer.parseInt(ageText);
            }
            catch (Exception ex)
            {
                showAlert("Error", "Roll No and Age must be integers");
                return;
            }

            if (!email.contains("@") || !email.contains("."))
            {
                showAlert("Error", "Invalid Email format");
                return;
            }

            FileChooser fc = new FileChooser();
            fc.setTitle("Save Data");
            File file = fc.showSaveDialog(stage);

            if (file != null)
            {
                try
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(roll + " " + name + " " + age + " " + email);
                    bw.newLine();
                    bw.close();
                }
                catch (IOException ex)
                {
                    showAlert("Error", "File write failed");
                    return;
                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Registration Successful");
            alert.setContentText("Roll: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
            alert.showAndWait();
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Practical_54");
        stage.setScene(scene);
        stage.show();
    }

    void showAlert(String title, String msg)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        launch(args);
    }
}