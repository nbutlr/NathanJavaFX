import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        scene.getStylesheets().add("/src/stylesheet.css");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.getStyleClass().add("funky_button");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        root.getChildren().add(btn);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

