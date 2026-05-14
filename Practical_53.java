import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

public class Practical_53 extends Application
{
    double dx = 2;
    boolean running = false;

    public void start(Stage stage)
    {
        Pane pane = new Pane();

        Circle ball = new Circle(20);
        ball.setCenterX(50);
        ball.setCenterY(100);

        pane.getChildren().add(ball);

        Button startBtn = new Button("Start");
        Button stopBtn = new Button("Stop");

        Slider speedSlider = new Slider(1, 10, 2);

        HBox controls = new HBox(10, startBtn, stopBtn, speedSlider);
        controls.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(controls);

        AnimationTimer timer = new AnimationTimer()
        {
            public void handle(long now)
            {
                if (!running) return;

                ball.setCenterX(ball.getCenterX() + dx * speedSlider.getValue());

                if (ball.getCenterX() <= ball.getRadius() ||
                    ball.getCenterX() >= pane.getWidth() - ball.getRadius())
                {
                    dx = -dx;
                }
            }
        };

        startBtn.setOnAction(e -> running = true);
        stopBtn.setOnAction(e -> running = false);

        timer.start();

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Practical_53");
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