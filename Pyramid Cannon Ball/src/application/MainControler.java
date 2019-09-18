package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;

public class MainControler implements Initializable{

	GraphicsContext context;
	private int h=750,w=750;
	public int height,radius,width,order;
	public String color;
	@FXML
	public Canvas canvas;
	
	public void exit(ActionEvent event)
	{
		Platform.exit();
		System.exit(0);
	}

	public void run() {
		if(order==1) {
		for(int i =0;i<height;i++) {
			for(int j= 0;j<height;j++) {
				if(j<=i) {
					context.strokeOval(radius+(j*radius)+5, radius+(i*radius)+5, radius, radius);
					switch(color) {
					case "AQUA":
						context.setFill(Color.AQUA);
						break;
					case "BLACK":
						context.setFill(Color.BLACK);
						break;
					case "BLUE":
						context.setFill(Color.BLUE);
						break;
					case "CORAL":
						context.setFill(Color.CORAL);
						break;
					case "GREEN":
						context.setFill(Color.GREEN);
						break;
					case "GRAY":
						context.setFill(Color.GRAY);
						break;
					case "RED":
						context.setFill(Color.RED);
						break;
					case "WHITE":
						context.setFill(Color.WHITE);
						break;
					case "YEllOW":
						context.setFill(Color.YELLOW);
						break;
					}
					context.fillOval(radius+(j*radius)+5, radius+(i*radius)+5, radius, radius);
				}
			}
		}
		}
		if(order==2) {
			for(int i =0;i<height;i++) {
				for(int j= 0;j<height;j++) {
					if(j<=i) {
						context.strokeOval(radius+((height-j-1)*radius)+5, radius+(i*radius)+5, radius, radius);
						switch(color) {
						case "AQUA":
							context.setFill(Color.AQUA);
							break;
						case "BLACK":
							context.setFill(Color.BLACK);
							break;
						case "BLUE":
							context.setFill(Color.BLUE);
							break;
						case "CORAL":
							context.setFill(Color.CORAL);
							break;
						case "GREEN":
							context.setFill(Color.GREEN);
							break;
						case "GRAY":
							context.setFill(Color.GRAY);
							break;
						case "RED":
							context.setFill(Color.RED);
							break;
						case "WHITE":
							context.setFill(Color.WHITE);
							break;
						case "YEllOW":
							context.setFill(Color.YELLOW);
							break;
						}
						context.fillOval(radius+((height-j-1)*radius)+5, radius+(i*radius)+5, radius, radius);
					}
				}
			}
			}
		if(order==3) {
			for(int i =0;i<height;i++) {
				for(int j= 0;j<height;j++) {
					if(j<=i) {
						context.strokeOval(radius+((height-j-1)*radius)+5, radius+(i*radius)+5, radius, radius);
						context.strokeOval(radius+(j*radius)+5+((height-1)*radius), radius+(i*radius)+5, radius, radius);
						switch(color) {
						case "AQUA":
							context.setFill(Color.AQUA);
							break;
						case "BLACK":
							context.setFill(Color.BLACK);
							break;
						case "BLUE":
							context.setFill(Color.BLUE);
							break;
						case "CORAL":
							context.setFill(Color.CORAL);
							break;
						case "GREEN":
							context.setFill(Color.GREEN);
							break;
						case "GRAY":
							context.setFill(Color.GRAY);
							break;
						case "RED":
							context.setFill(Color.RED);
							break;
						case "WHITE":
							context.setFill(Color.WHITE);
							break;
						case "YEllOW":
							context.setFill(Color.YELLOW);
							break;
						}
						context.fillOval(radius+((height-j-1)*radius)+5, radius+(i*radius)+5, radius, radius);
						context.fillOval(radius+(j*radius)+5+((height-1)*radius), radius+(i*radius)+5, radius, radius);
					}
				}
			}
			}
	}
	
	public void configPyramid()
	{
		ConfigurePyramid dialog= new ConfigurePyramid();
		dialog.display();
		height = ConfigurePyramidControler.heightVal;
		order = ConfigurePyramidControler.allignVal;
		run();
	}
	
	public void configCannonBall()
	{
		ConfigureCannonBall dialog = new ConfigureCannonBall();
		dialog.display();
		radius = ConfigureCannonBallControler.radiusVal;
		width = ConfigureCannonBallControler.widthVal;
		color = ConfigureCannonBallControler.colorVal;
		run();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		context = canvas.getGraphicsContext2D();
	}
}
