import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Practical_55 extends Application
{
    public void start(Stage stage)
    {
        double scale = 3;

        VBox projects = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midterm = createBar("Midterm Exams — 30%", 30 * scale, Color.GREEN);
        VBox finalExam = createBar("Final Exam — 40%", 40 * scale, Color.ORANGE);

        HBox root = new HBox(20, projects, quizzes, midterm, finalExam);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Practical_55");
        stage.setScene(scene);
        stage.show();
    }

    VBox createBar(String text, double height, Color color)
    {
        Rectangle rect = new Rectangle(60, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        launch(args);
    }
}