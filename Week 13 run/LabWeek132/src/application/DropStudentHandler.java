package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class DropStudentHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Drop Student Button Clicked");
	}	
}
