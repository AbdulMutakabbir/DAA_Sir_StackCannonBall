package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfigurePyramidControler implements Initializable {

	public static String nameVal="";
	public static int heightVal = 0;
	public static int allignVal = 0;
	
	@FXML
	public TextField name,height;
	@FXML
	public Button cancel;
	@FXML
	public ComboBox<String> justification;
	ObservableList<String> list = FXCollections.observableArrayList("Left Justified","Right Justified","Center Justified");

	
	public static String getNameVal() {
		return nameVal;
	}

	public static void setNameVal(String nameVal) {
		ConfigurePyramidControler.nameVal = nameVal;
	}

	public static int getHeightVal() {
		return heightVal;
	}

	public static void setHeightVal(int heightVal) {
		ConfigurePyramidControler.heightVal = heightVal;
	}

	public static int getAllignVal() {
		return allignVal;
	}

	public static void setAllignVal(int allignVal) {
		ConfigurePyramidControler.allignVal = allignVal;
	}

		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		justification.setItems(list);
	}
	
	public void onOk(ActionEvent event) {
		setHeightVal(Integer.parseInt(height.getText()));
		setNameVal(name.getText());
		switch(justification.getValue()) {
		case "Left Justified":
			setAllignVal(1);
			break;
		case "Right Justified":
			setAllignVal(2);
			break;
		case "Center Justified":
			setAllignVal(3);
			break;
		}
		Stage stage = (Stage) cancel.getScene().getWindow();
	    stage.close();
	}
	
	public void onCancle(ActionEvent event) {
		Stage stage = (Stage) cancel.getScene().getWindow();
	    stage.close();
	}
}
