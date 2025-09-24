/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package EventHandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Reo
 */
public class FXMLController {
    
    @FXML
    private Circle mycircle;
    private double x,y;
    
   public void up(ActionEvent e){
       System.out.println("UP");
       mycircle.setCenterY(y-=3);
   }
   public void down(ActionEvent e){
       System.out.println("Down");
       mycircle.setCenterY(y+=3);
   }
   public void left(ActionEvent e){
       System.out.println("Left");
       mycircle.setCenterX(x-=3);
   }
   public void right(ActionEvent e){
       mycircle.setCenterX(x+=3);
       System.out.println("Right");}
}
