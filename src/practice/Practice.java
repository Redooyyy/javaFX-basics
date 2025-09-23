package practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Reo
 */
public class Practice extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        Scene scene = new Scene(root,Color.PURPLE);
        primaryStage.setTitle("Hello World");
        
        
        //set height and width
        primaryStage.setHeight(420.0);
        primaryStage.setWidth(420.0);
        //set stage full screen
        primaryStage.setFullScreen(true);  //here it'll execute from full screen then after exiting full screen, it'll come to 420x420.
        //custom key for exiting full screen(by default is 'Esc' key)
        primaryStage.setFullScreenExitHint("Press q for exit"); //gives the hind
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); //exit by pressing q
        
        
        //disable window resizable
        primaryStage.setResizable(false);
        
        //stage appearance in computer when execute (by deafult it is in the middle) it takes X,Y cordinate values
        primaryStage.setY(50);
        primaryStage.setX(50);
        
        
        //add icon image
        //Image icon = new Image("file path");
        //primaryStage.getIcons().add(icon);
        
        
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
