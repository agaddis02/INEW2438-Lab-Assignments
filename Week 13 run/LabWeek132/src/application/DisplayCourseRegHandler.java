package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class DisplayCourseRegHandler implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Display Course Button Clicked");
	}	
}
