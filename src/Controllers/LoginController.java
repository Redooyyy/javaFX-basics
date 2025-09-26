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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Reo
 */
public class LoginController {
    @FXML //must
    TextField usrname;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void onAction(ActionEvent e) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Controllers/home.fxml"));
        root = loader.load();
        homeController homecontrol = loader.getController(); //important (must remember)
        String name = usrname.getText();
        homecontrol.passName(name);
        //type casting (event source -> node ->Stage).getScene.getWindow;
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
