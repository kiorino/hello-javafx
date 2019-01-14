package com.sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 
public class App extends Application {
    Label label;
    Button button;
    TextField textField;
 
    @Override
    public void start(Stage stage) throws Exception {
        label = new Label("入力された文字:");
        textField = new TextField();
        button = new Button("OK");
        //buttonクリック時のアクション
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String typed_msg = "入力された文字:" + textField.getText();
                label.setText(typed_msg);
            }
        });
 
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(textField);
        borderPane.setCenter(label);
        borderPane.setBottom(button);
        Scene scene = new Scene(borderPane, 240, 120);
        stage.setScene(scene);
        stage.setTitle("TestApp");
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}
