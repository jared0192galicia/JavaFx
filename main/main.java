/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
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
        Path path = new Path();
        
        MoveTo moveTo = new MoveTo(108, 71);
        
        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126, 232);
        LineTo line3 = new LineTo(232, 52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(108, 71);
        
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);
        
        // Root node
        Group root = new Group(path);
        
        
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
