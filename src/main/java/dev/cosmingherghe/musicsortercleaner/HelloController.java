package dev.cosmingherghe.musicsortercleaner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e) {
        myCircle.setCenterY(y--);
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(y++);
    }
    public void left(ActionEvent e) {
        myCircle.setCenterX(x--);
    }
    public void right(ActionEvent e) {
        myCircle.setCenterX(x++);
    }
}