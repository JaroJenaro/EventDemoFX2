package de.iav.eventdemofx2.KeyPresedDemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class KeyPressedDemoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KeyPressedDemoApplication.class
                .getResource("/de/iav/eventdemofx2/KeyPressedDemo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        KeyPressedDemoController keyPressedDemoController = fxmlLoader.getController();
        keyPressedDemoController.initialize(scene);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}