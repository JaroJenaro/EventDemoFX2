package de.iav.eventdemofx2.KeyPresedDemo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class KeyPressedDemoController {

    @FXML
    public Circle sh_circleBlue;
    @FXML
    public AnchorPane ap_scene;

    @FXML
    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        scene.setOnKeyPressed(this::onKeyPressedDemo);
        sh_circleBlue.setLayoutY(ap_scene.getHeight() + sh_circleBlue.radiusProperty().floatValue());
        sh_circleBlue.setLayoutX(ap_scene.getWidth() + sh_circleBlue.radiusProperty().floatValue()
        );


    }
    @FXML
    public void onKeyPressedDemo(KeyEvent keyEvent) {

        System.out.println("keyEvent: " + keyEvent.getCode()   );
        switch (keyEvent.getCode()) {
            case W :
            case UP:
                sh_circleBlue.setLayoutY(sh_circleBlue.getLayoutY()-10);
                System.out.println(sh_circleBlue.getLayoutY() + "  " + ap_scene.getHeight());
                circleAtBorder(keyEvent.getCode());
                break;
            case A:
            case LEFT:
                sh_circleBlue.setLayoutX(sh_circleBlue.getLayoutX() - 10);
                System.out.println(sh_circleBlue.getLayoutX() + "  " + ap_scene.getWidth());
                circleAtBorder(keyEvent.getCode());
            break;
            case S :
            case DOWN:
                sh_circleBlue.setLayoutY(sh_circleBlue.getLayoutY() + 10);
                System.out.println(sh_circleBlue.getLayoutY() + "  " + ap_scene.getHeight());
                circleAtBorder(keyEvent.getCode());
                break;
            case D :
            case RIGHT:
                sh_circleBlue.setLayoutX(sh_circleBlue.getLayoutX() +10);
                System.out.println(sh_circleBlue.getLayoutX()  + " " + ap_scene.getWidth());
                circleAtBorder(keyEvent.getCode());
            break;
            default :
                System.out.println(keyEvent.getText() + keyEvent.getCode());
            break;
        }
    }

    private void circleAtBorder(KeyCode keyCode) {
        double leftBound = 0 + sh_circleBlue.radiusProperty().floatValue();
        double rightBound = ap_scene.getWidth() - sh_circleBlue.radiusProperty().floatValue();
        double topBound = 0 + sh_circleBlue.radiusProperty().floatValue();
        double bottomBound = ap_scene.getHeight() - sh_circleBlue.radiusProperty().floatValue();

        if(sh_circleBlue.getLayoutX() >= rightBound){
            sh_circleBlue.setLayoutX(rightBound);
            System.out.println(keyCode);
        }

        if(sh_circleBlue.getLayoutX() <= leftBound ){
            sh_circleBlue.setLayoutX(leftBound);
            System.out.println(keyCode);
        }

        if(sh_circleBlue.getLayoutY() <= topBound){
            sh_circleBlue.setLayoutY(topBound);
            System.out.println(keyCode);
        }

        if(sh_circleBlue.getLayoutY() >= bottomBound ){
            sh_circleBlue.setLayoutY(bottomBound);
            System.out.println(keyCode);
        }

       // https://www.youtube.com/watch?v=HP9vU0JCChg
    }

    private double circleGetRandPosition(KeyCode keyCode) {
        switch (keyCode) {
            case W : return sh_circleBlue.getCenterY() - sh_circleBlue.radiusProperty().floatValue();
            case A : return sh_circleBlue.getCenterX() - sh_circleBlue.radiusProperty().floatValue();
            case S : return sh_circleBlue.getCenterY() + sh_circleBlue.radiusProperty().floatValue();
            case D : return sh_circleBlue.getCenterX() + sh_circleBlue.radiusProperty().floatValue();
            default : return 0;
        }
    }
}


