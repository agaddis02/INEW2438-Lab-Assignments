package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddCourseHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Add Course Button Clicked");
	}	
}
