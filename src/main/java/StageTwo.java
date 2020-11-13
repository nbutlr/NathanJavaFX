import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

class StageTwo {

    private static Pane parent;

    StageTwo(Pane theParent) {

        Stage stage = new Stage();
        parent = theParent;
        parent.setDisable(true);
        start(stage);

    }

    private void start(Stage stage) {

        Pane root = new Pane();
        Scene scene = new Scene(root, 200, 290);
        VBox boxOfButtons = new VBox(10);

        Button[] myButtons = new Button[5];

        myButtons[0] = new Button("Button number one");
        myButtons[0].setPrefSize(200, 50);
        myButtons[0].setOnAction((ActionEvent ae) -> doSomething(1));

        myButtons[1] = new Button("Button number two");
        myButtons[1].setPrefSize(200, 50);
        myButtons[1].setOnAction((ActionEvent ae) -> doSomething(2));

        myButtons[2] = new Button("Button number three");
        myButtons[2].setPrefSize(200, 50);
        myButtons[2].setOnAction((ActionEvent ae) -> doSomething(3));

        myButtons[3] = new Button("Button number four");
        myButtons[3].setPrefSize(200, 50);
        myButtons[3].setOnAction((ActionEvent ae) -> doSomething(4));

        myButtons[4] = new Button("Button number five");
        myButtons[4].setPrefSize(200, 50);
        myButtons[4].setOnAction((ActionEvent ae) -> doSomething(5));

        boxOfButtons.getChildren().addAll(myButtons);

        root.getChildren().add(boxOfButtons);
        stage.setTitle("b u t t o n s");
        stage.setScene(scene);
        stage.setOnCloseRequest((WindowEvent we) -> closeStage(stage));
        stage.show();

    }

    private void doSomething(int test) {
        System.out.println("Wow its button "+test+" :o");
    }

    private void closeStage(Stage stage) {

        parent.setDisable(false);
        stage.close();

    }

}