/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author jared
 */
public class main extends Application {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Prueba");
        
        // Root node
        Group root = new Group();
        
        // Create node label
        Label label = new Label("Hola weyes");
        Line line = new Line();
        
        // Add label at node root
        root.getChildren().add(label);
        // Main node: Scene
        Scene scene = new Scene(root, 300, 300);
        
        scene.setFill(Color.TRANSPARENT);
        
        // Add Scene at stage and show UI: setVisible
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
