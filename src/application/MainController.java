package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	Model model = new Model();
	
	private double currentNum;
	private String operator;
	
	public void handle() {
		String oldText = display.getText();
		currentNum = Double.parseDouble(oldText);
		
				
	}
	
	@FXML
	private TextField display;
	
	
	@FXML
	public void handleDigitAction(ActionEvent event) {
		
		String digit = ((Button) event.getSource()).getText();
		String oldDigit = display.getText();
		String newDigit = oldDigit + digit;
		display.setText(newDigit);
		
		
	}
	
	@FXML
	public void handleDotOperation(ActionEvent event) {
		String dotString = ((Button) event.getSource()).getText();
		String oldDot = display.getText();
		String newDigit = oldDot + dotString;
		display.setText(newDigit);
	}
	
	@FXML
	public void handleAddAction(ActionEvent event) {
		handle();
		operator = ((Button) event.getSource()).getText();
		display.setText("");
	}
		
	
	@FXML
	public void handleSubAction(ActionEvent event) {
		
		handle();
		operator = ((Button) event.getSource()).getText();
		display.setText("");
		
	}
	
	@FXML
	public void handledivideAction(ActionEvent event) {
		handle();
		operator = ((Button) event.getSource()).getText();
		display.setText("");
		
	}
	
	@FXML
	public void handleMulAction(ActionEvent event) {
		handle();
		operator = ((Button) event.getSource()).getText();
		display.setText("");
		
	}
	
	@FXML
	public void handleEqualAction(ActionEvent event) {
		String oldText = display.getText();
		double newNum = Double.parseDouble(oldText);
		//currentNum = currentNum+newNum;
		currentNum = model.calculate(currentNum, newNum, operator);
		display.setText("" + currentNum);
		
		
		
		
	}
	
	public void handleAcAction(ActionEvent event) {
		currentNum =0;
		display.setText("");
		
		
	}

}
