package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddStudentHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Add Student Button Clicked");
	}	
}
