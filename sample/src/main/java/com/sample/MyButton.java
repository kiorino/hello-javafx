package com.sample;
import javafx.scene.layout.*;
import javafx.scene.control.Button;

class MyButton {
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
}
