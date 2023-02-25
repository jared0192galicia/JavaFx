/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
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
    public void start(Stage primaryStage) throws InterruptedException {
        
        // Create buttons for frame form
        Button button1 = new Button("boton 1");
        Button button2 = new Button("boton 2");
        Button button3 = new Button("boton 3");
        Button button4 = new Button("boton 4");
        Button button5 = new Button("boton 5");
        
        BorderPane root = new BorderPane();
        
        // Add buttons to layout
        root.setCenter(button1);
        button1.setCursor(Cursor.CROSSHAIR);
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        BorderPane.setMargin(button1, new Insets(5, 5, 5, 5));
        
        root.setBottom(button2);
        button2.setCursor(Cursor.DISAPPEAR);
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        BorderPane.setMargin(button1, new Insets(5, 5, 5, 5));
        
        root.setLeft(button3);
        button3.setCursor(Cursor.OPEN_HAND);
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setOnMouseClicked((t) -> {
            newWindow window = new newWindow();
            System.out.println("Create instance");
        });
        BorderPane.setMargin(button1, new Insets(5, 5, 5, 5));
        
        root.setRight(button4);
        button4.setCursor(Cursor.WAIT);
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        BorderPane.setMargin(button1, new Insets(5, 5, 5, 5));
        
        root.setTop(button5);
        button5.setCursor(Cursor.CLOSED_HAND);
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        BorderPane.setMargin(button1, new Insets(5, 5, 5, 5));
        
        Scene scene = new Scene(root, 600, 300);
        
        scene.setFill(Color.AQUA);
        
        // Add Scene at stage and show UI: setVisible
        primaryStage.setScene(scene);
        primaryStage.setTitle("Prueba");
        primaryStage.show();
        
        root.setOpacity(0.9);
        // Main node: Scene
        
    }
}
