/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Reo
 */
public class homeController {
    @FXML //must
    Label hello;
    private Parent root;
    private Stage stage;
    private Scene scene;
    
    public void logout(ActionEvent e) throws IOException{
         root = FXMLLoader.load(getClass().getResource("/Controllers/login.fxml"));
        //type casting (event source -> node ->Stage).getScene.getWindow;
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void passName(String name){
     hello.setText("Hello : "+ name);
    }
}
