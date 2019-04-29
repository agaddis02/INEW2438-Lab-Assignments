package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	//Declarations
	private static TextField tfFirstName = new TextField();
	private static TextField tfLastName = new TextField();
	private static TextField tfAnnualInterestRate = new TextField();
	private static TextField tfNumberOfYears = new TextField();
	private static TextField tfLoanAmount = new TextField();
	private static TextField tfMonthlyPayment = new TextField();
	private static TextField tfTotalPayment = new TextField();
	private static Button btCalculate = new Button("Calculate");
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane gridPane = new GridPane();
			gridPane = createGridPane(gridPane);
			
			//Process Events
			btCalculate.setOnAction(e -> calculateLoanPayment());
			
			Scene scene = new Scene(gridPane,400,250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Richland Loan Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Method to add UI controls to gridPane
	public static  GridPane createGridPane (GridPane gridPane) {
		//Set controls to UI
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("First Name"), 0, 0);
		gridPane.add(tfFirstName, 1,0);
		gridPane.add(new Label("Last Name"), 0, 1);
		gridPane.add(tfLastName, 1,1);
		gridPane.add(new Label("Annual Interest Rate"), 0, 2);
		gridPane.add(tfAnnualInterestRate, 1, 2);
		gridPane.add(new Label("Number of Years"), 0, 3);
		gridPane.add(tfNumberOfYears, 1,3);
		gridPane.add(new Label("Loan Amount"), 0, 4);
		gridPane.add(tfLoanAmount, 1,4);
		gridPane.add(new Label("Monthly Payment"), 0, 5);
		gridPane.add(tfMonthlyPayment, 1,5);
		gridPane.add(new Label("Total Payment"), 0, 6);
		gridPane.add(tfTotalPayment, 1,6);
		gridPane.add(btCalculate, 1, 7);
		
		//Set Properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BASELINE_RIGHT);
		tfLoanAmount.setAlignment(Pos.BASELINE_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		return gridPane;
	}
	
	//Method -Calculate Loan Payment
	public static void calculateLoanPayment() {
		//get values from text fields
		double interest = 
				Double.parseDouble(tfAnnualInterestRate.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmount =
				Double.parseDouble(tfLoanAmount.getText());
		
		//crate a loan object
		 Loan loan = new Loan(interest, year, loanAmount);
		 
		 //Display monthly payment and total payment
		 tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
		 tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
