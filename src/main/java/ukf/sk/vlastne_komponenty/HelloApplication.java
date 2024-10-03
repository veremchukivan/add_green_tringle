package ukf.sk.vlastne_komponenty;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        VBox root1=new VBox();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root1, 350, 250);
        stage.setScene(scene);
        stage.show();

//        Rectangle rect=new Rectangle(10,10,60,40);
//        rect.setFill(Color.TRANSPARENT);
//        Line line1 =new Line(10,10,70,50);
//        Line line2=new Line(10,50,70,10);
//        line1.setStroke(Color.RED);
//        line2.setStroke(Color.RED);
//        rect.setStroke(Color.RED);
//
//        root.getChildren().addAll(line1,line2,rect);


        Button btn=new Button("Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PostZnacka pst=new PostZnacka(30,40,Color.GREEN);
                root1.getChildren().add(pst);
            }
        });
        root1.getChildren().add(btn);


    }

    public static void main(String[] args) {
        launch();
    }
}
