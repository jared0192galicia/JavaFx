/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class main extends Application {
    
    String user;
    String pass;
    
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        
        // Create buttons for frame form
        Button btn = new Button("Acceder");
        
        Label labelTitle = new Label("Login");
        Label labelUser = new Label("User");
        Label labelPass = new Label("Password");
        
        TextField textUser = new TextField();
        PasswordField textPass = new PasswordField();
        
        labelTitle.setFont(new Font(30));
        labelUser.setFont(new Font(20));
        labelPass.setFont(new Font(20));
        
        textUser.setMaxWidth(210);
        textPass.setMaxWidth(210);
        
        VBox root = new VBox();
        VBox.setMargin(labelTitle, new Insets(5,0,0,0));
        VBox.setMargin(labelUser, new Insets(10,0,0,0));
        VBox.setMargin(labelPass, new Insets(10,0,0,0));
        VBox.setMargin(textUser, new Insets(10,0,0,0));
        VBox.setMargin(textPass, new Insets(10,0,0,0));
        VBox.setMargin(btn, new Insets(10,0,0,0));
        root.setAlignment(Pos.CENTER);
        
        btn.setOnMouseClicked((MouseEvent t) -> {
            String aUser = textUser.getText();
            String aPass = textPass.getText();
            
            if (!aPass.equals("") && !aUser.equals("")) {
                if (aPass.equals(pass) && aUser.equals(user)) {
                    JOptionPane.showMessageDialog(null, "Entraste");
                } else {
                    JOptionPane.showMessageDialog(null, "datos no validos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes llenar todo wey");
            }
        });
        
        root.getChildren().addAll(labelTitle, labelUser, textUser, labelPass, textPass, btn);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    @Override
    public void init() {
        user = "juancho";
        pass = "12345678";
    }
}
