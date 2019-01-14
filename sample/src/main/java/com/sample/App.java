package com.sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 
public class App extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("入力された文字:");
        TextField textField = new TextField();
        Button OkButton = new Button("OK");
        Button NgButton = new Button("NG");
        // //buttonクリック時のアクション
        // OkButton.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e) {
        //         String typed_msg = "入力された文字:" + textField.getText();
        //         label.setText(typed_msg);
        //     }
        // });
		// button2 = new Buttom("NG");
        //buttonクリック時のアクション
        // button2.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e) {
        //         String typed_msg = "NG入力された文字:" + textField.getText();
        //         label.setText(typed_msg);
        //     }
        //});
 

        // BorderPane borderPane = new BorderPane();
        // borderPane.setTop(textField);
        // borderPane.setCenter(label);
        // borderPane.setBottom(OkButton);
        // borderPane.setLeft(NgButton);
		AnchorPane pane = new AnchorPane();
		int num = 0;
		MyButton button1 = new MyButton(pane, "button" + String.valueOf(num++), 10., 10.);
		MyButton button2 = new MyButton(pane, "button" + String.valueOf(num++), 20., 20.);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("アプリケーション");
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}
