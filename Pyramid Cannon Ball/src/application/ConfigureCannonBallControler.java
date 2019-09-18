package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfigureCannonBallControler implements Initializable {

	public static String colorVal= "BLUE";
	public static int widthVal= 0;
	public static int radiusVal= 0;
	
	@FXML
	public TextField width,radius;
	@FXML
	public Button cancel;
	@FXML
	public ComboBox<String> color;
	ObservableList<String> list = FXCollections.observableArrayList("AQUA","BLACK","BLUE","CORAL","GREEN","GRAY","RED","WHITE","YELLOW");	
	
	
	

	public static String getColorVal() {
		return colorVal;
	}

	public static void setColorVal(String colorVal) {
		ConfigureCannonBallControler.colorVal = colorVal;
	}

	public static int getWidthVal() {
		return widthVal;
	}

	public static void setWidthVal(int widthVal) {
		ConfigureCannonBallControler.widthVal = widthVal;
	}

	public static int getRadiusVal() {
		return radiusVal;
	}

	public static void setRadiusVal(int radiusVal) {
		ConfigureCannonBallControler.radiusVal = radiusVal;
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		color.setItems(list);
	}

	public void onOk(ActionEvent event) {
		setWidthVal(Integer.parseInt(width.getText()));
		setRadiusVal(Integer.parseInt(radius.getText()));
		setColorVal(color.getValue());

		Stage stage = (Stage) cancel.getScene().getWindow();
	    stage.close();
	}
	
	public void onCancle(ActionEvent event) {
		Stage stage = (Stage) cancel.getScene().getWindow();
	    stage.close();
	}
}
