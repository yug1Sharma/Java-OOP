import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class Practical_52 extends Application
{
    public void start(Stage stage)
    {
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        Random r = new Random();

        for (int i = 1; i <= 5; i++)
        {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble()));
            t.setOpacity(0.3 + (r.nextDouble() * 0.7));
            root.getChildren().add(t);
        }

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Practical_52");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        launch(args);
    }
}