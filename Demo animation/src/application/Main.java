package application;
	
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Create a pane
			Pane pane = new Pane();
			
			//Create a rectangle
			Rectangle rectangle = new Rectangle (0,0,25,50);
			rectangle.setFill(Color.ORANGE);
			
			//Create a circle
			Circle circle = new Circle(125, 100, 50);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			
			Text source = new Text();
			source.setX(400);
			source.setY(100);
			source.setText("Richland Thunderducks");
			source.setFont(Font.font ("Verdana", 20));
			source.setFill(Color.BLACK);
			
			Text target = new Text();
			target.setX(50);
			target.setY(100);
			target.setText("Richland Thunderducks");
			target.setFont(Font.font ("Verdana", 20));
			target.setFill(Color.WHITE);
			
			source.setOnDragDetected(new EventHandler <MouseEvent>() {
	            public void handle(MouseEvent event) {
	                /* drag was detected, start drag-and-drop gesture*/
	                System.out.println("onDragDetected");
	                
	                /* allow any transfer mode */
	                Dragboard db = source.startDragAndDrop(TransferMode.ANY);
	                
	                /* put a string on dragboard */
	                ClipboardContent content = new ClipboardContent();
	                content.putString(source.getText());
	                db.setContent(content);
	                
	                event.consume();
	            }
	        });

	        target.setOnDragOver(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* data is dragged over the target */
	                System.out.println("onDragOver");
	                
	                /* accept it only if it is  not dragged from the same node 
	                 * and if it has a string data */
	                if (event.getGestureSource() != target &&
	                        event.getDragboard().hasString()) {
	                    /* allow for both copying and moving, whatever user chooses */
	                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
	                }
	                
	                event.consume();
	            }
	        });

	        target.setOnDragEntered(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* the drag-and-drop gesture entered the target */
	                System.out.println("onDragEntered");
	                /* show to the user that it is an actual gesture target */
	                if (event.getGestureSource() != target &&
	                        event.getDragboard().hasString()) {
	                    target.setFill(Color.GREEN);
	                }
	                
	                event.consume();
	            }
	        });

	        target.setOnDragExited(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* mouse moved away, remove the graphical cues */
	                target.setFill(Color.BLACK);
	                
	                event.consume();
	            }
	        });
	        
	        target.setOnDragDropped(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* data dropped */
	                System.out.println("onDragDropped");
	                /* if there is a string data on dragboard, read it and use it */
	                Dragboard db = event.getDragboard();
	                boolean success = false;
	                if (db.hasString()) {
	                    target.setText(db.getString());
	                    success = true;
	                }
	                /* let the source know whether the string was successfully 
	                 * transferred and used */
	                event.setDropCompleted(success);
	                
	                event.consume();
	            }
	        });

	        source.setOnDragDone(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* the drag-and-drop gesture ended */
	                System.out.println("onDragDone");
	                /* if the data was successfully moved, clear it */
	                if (event.getTransferMode() == TransferMode.MOVE) {
	                    source.setText("");
	                }
	                
	                event.consume();
	            }
	        });
	        
	        
			//Add circle and rectangle to the pane
			pane.getChildren().add(circle);
			pane.getChildren().add(rectangle);
			pane.getChildren().add(source);
			pane.getChildren().add(target);
			
			//Create a path transition
			PathTransition pt = new PathTransition();
			pt.setDuration(Duration.millis(4000));
			pt.setPath(circle);
			pt.setNode(rectangle);
			pt.setOrientation(
					PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.setAutoReverse(true);
			pt.play(); //starts the animation
			
			circle.setOnMousePressed(e -> pt.pause());
			circle.setOnMouseReleased(e -> pt.play());

//			text.setOnDragOver(e -> text.setFill(Color.RED));
			
			//Create scene and place in the stage
			Scene scene = new Scene(pane,600,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Demo Animation");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
