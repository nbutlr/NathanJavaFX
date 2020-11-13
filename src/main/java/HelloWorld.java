import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import java.util.Optional;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        root.setStyle("-fx-background-color: darkviolet;");
        Button btn = new Button();
        btn.setText("Create new stage");
        btn.setStyle( " -fx-background-color: violet;" +
                "-fx-font-size: 16;" +
                "-fx-font-family: 'Comic Sans MS';" +
                "-fx-padding: 10;" +
                "-fx-text-fill: lavender");
        btn.setOnAction((ActionEvent ae) -> openNewStage(root));
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(HelloWorld::exitPrompt);
        primaryStage.show();

    }
    private static void openNewStage(Pane parent) {
        System.out.println("Hello world!");
        StageTwo newStage = new StageTwo(parent);
    }
    private static void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to exit?");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        } else {
            we.consume();
        }

    }

}



