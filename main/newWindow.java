/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jared
 */
public class newWindow extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        
        Label labelTitle = new Label("Login");
        Label labelUser = new Label("User");
        Label labelPass = new Label("Password");
        
        TextField textUser = new TextField();
        PasswordField textPass = new PasswordField();
        
        VBox root = new VBox();
        
        root.getChildren().addAll(labelTitle, labelUser, textUser, labelPass, textPass);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
