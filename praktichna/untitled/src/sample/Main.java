package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label labelx= new Label("Введіть x");
        TextField textFieldx = new TextField();
        Label labely= new Label("Введіть y");
        TextField textFieldy = new TextField();
        Label labelz= new Label("Введіть z");
        TextField textFieldz = new TextField();

        Button button = new Button("Розрахувати");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Розрахунок");
                alert.setHeaderText(null);

                try {
                    int x = Integer.parseInt(textFieldx.getText());
                    int y = Integer.parseInt(textFieldy.getText());
                    int z = Integer.parseInt(textFieldz.getText());
                    if(x==y && y!=z) alert.setContentText("1");
                    else if (x==z && x!=y) alert.setContentText("1");
                    else if(y==z&& y!=x) alert.setContentText("1");
                    else alert.setContentText("0");
                } catch (NumberFormatException e) {
                    alert.setContentText("Поле не заповнене!");
                }
                alert.show();
            }});

        Group group = new Group(button);
        FlowPane root = new FlowPane(10,10,labelx,textFieldx,labely,textFieldy,labelz,textFieldz,group);




        Scene scene = new Scene(root,230,200);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
