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
        final Label label = new Label("入力された文字:");
        final TextField textField = new TextField();
        // //buttonクリック時のアクション
        // OkButton.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e) {
        //         String typed_msg = "入力された文字:" + textField.getText();
        //         label.setText(typed_msg);
        //     }
        // });

		AnchorPane pane = new AnchorPane();
		pane.getChildren().addAll(textField, label);
		pane.setTopAnchor(textField, 10.);
		pane.setLeftAnchor(textField, 10.);
		pane.setTopAnchor(label, 50.);
		pane.setLeftAnchor(label, 10.);
		int num = 0;
		MyButton button1 = new MyButton(pane, "button" + String.valueOf(num++), 100., 10.);
		button1.SetEvent();
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("アプリケーション");
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}
