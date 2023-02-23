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
        
        // Create node label
        Label label = new Label("Hola weyes");
        Line line = new Line();
        
        // Root node
        Group root = new Group(line);
        
        line.setStartX(100);
        line.setStartY(150);
        line.setEndX(500);
        line.setEndY(150);
        line.setFill(Color.BLACK);
        // Add label at node root
        //root.getChildren().add(label);
        // Main node: Scene
        Scene scene = new Scene(root, 600, 300);
        
        scene.setFill(Color.AQUA);
        
        // Add Scene at stage and show UI: setVisible
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
