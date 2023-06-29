package de.iav.eventdemofx2.KeyPresedDemo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class KeyPressedDemoController {

    @FXML
    public Circle sh_circleBlue;

    @FXML
    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        scene.setOnKeyPressed(this::onKeyPressedDemo);
    }
    @FXML
    public void onKeyPressedDemo(KeyEvent keyEvent) {
        System.out.println("keyEvent: " + keyEvent.getCode());
    }
}



