package com.erciyes.edu.tr.trafficlightdensity;
import com.erciyes.edu.tr.trafficlightdensity.intersection_gui.UserInterfaceController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TrafficSimApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(UserInterfaceController.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320,240);
        stage.setScene(scene);
        stage.setTitle("Traffic Light Density");
        stage.show();
    }
}
