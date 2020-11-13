import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setStyle( " -fx-background-color: lime;" +
                "-fx-font-size: 16;" +
                "-fx-font-family: 'Arial Black';" +
                "-fx-padding: 10;" +
                "-fx-text-fill: purple");
        btn.setOnAction(event -> System.out.println("Hello World!"));
        root.getChildren().add(btn);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

