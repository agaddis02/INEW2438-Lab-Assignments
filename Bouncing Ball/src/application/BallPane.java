package application;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
	//declare properties
	public final double radius = 20;
	private double x = radius, y=radius;
	private double dx = 30, dy=30;
	private Circle circle = new Circle(x, y, radius);
	private Timeline animation;
	//default constructor
	public BallPane() {
		setBallColor(Color.GREEN);		
		getChildren().add(circle); //add circle on pane
		
		//create an animation
		animation = new Timeline(
		new KeyFrame(Duration.millis(500), e -> moveBall()));
		animation.play();			
	}
	
	// Method - change ball color
	private void setBallColor(Color color) {
		circle.setFill(color); //set the color
	}
	
	// Method - Play
	public void play() {
		animation.play();
	}
	
	// Method - Pause
	public void pause() {
		animation.pause();
	}
	
	// Method - Increase speed
	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 20);		
	}
	
	// Method - Decrease speed
	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0? animation.getRate() - 10: 0);
	}
	
	//Method - return current rate
	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}
	
	protected void moveBall() {
		setBallColor(Color.GREEN);
		//check boundaries
		if ( x < radius || x > getWidth() - radius) {
			setBallColor(Color.RED);
			dx *= -1; //change ball move direction
		} 
		if ( y < radius || y > getHeight() - radius) {
			dy *= -1; //change ball move direction 
			setBallColor(Color.RED);
		}
		 //Adjust ball position
		x += dx;
		y += dy;
		circle.setCenterX(x);  //center horizontal
		circle.setCenterY(y);  //center vertical
	}	
}
