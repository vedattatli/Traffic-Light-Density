package com.erciyes.edu.tr.trafficlightdensity;

import com.erciyes.edu.tr.trafficlightdensity.intersection_gui.UserInterfaceController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class TrafficSimApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(UserInterfaceController.class.getResource("src/main/resources/main.fxml"));
        Parent rootNode = loader.load();

        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.setTitle("Traffic Light Density");
        stage.show();
    }

}
