package com.sample;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.awt.Point;
import java.awt.event.MouseEvent;

class MyButton{
	Button button;
	String title;
	double top;
	double left;
	MyButton(){}
	MyButton(AnchorPane pane, String buttonTitle, double buttonTop, double buttonLeft){
		this.button = new Button(buttonTitle);
		this.top = buttonTop;
		this.left = buttonLeft;
		pane.getChildren().addAll(this.button);
		pane.setTopAnchor(this.button, buttonTop);
		pane.setLeftAnchor(this.button, buttonLeft);
	}
	public void SetEvent(){
		this.button.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				System.out.println("clicked");
			}
		});
	}
		
}
