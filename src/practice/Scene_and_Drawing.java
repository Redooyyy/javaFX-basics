package practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Reo
 */
public class Scene_and_Drawing extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
         Group root = new Group();
         //polimorphic behavior(Root,height,width,color) //root is required others are optional
         Scene scene = new Scene(root,600,600,Color.SEAGREEN);
         
         
         //Text object
         Text text = new Text();
         //set a text to scene
         text.setText("Hello World"); //also can pass to the constructor
         //also can define where would this text should be
         text.setY(50);
         text.setX(50);
         //set font (Polymorphishm name of font is required, font size is optional)
         text.setFont(Font.font("Roboto",50));
         //set text color
         text.setFill(Color.BLACK);
        
         
         //Lines (it tooks start and end position to appear)
         Line line = new Line();
         //start position(X,Y)
         line.setStartX(200);
         line.setStartY(200);
         //end position(X,Y)
         line.setEndX(500);
         line.setEndY(200);
         //stroke of line
         line.setStrokeWidth(5);
         //stroke color
         line.setStroke(Color.RED);
         //stroke opacity
         line.setOpacity(0.8);
         //rotate line
         line.setRotate(45);
         
         
         
         //Rectangles
         Rectangle rectangle = new Rectangle();
         //set position
         rectangle.setX(100);
         rectangle.setY(100);
         //set height and width
         rectangle.setWidth(200);
         rectangle.setHeight(100);
         //set color
         rectangle.setFill(Color.WHITE);
         //set stroke and stroke color
         rectangle.setStrokeWidth(5);
         rectangle.setStroke(Color.BLACK);
         
         
         //Triangles
         Polygon triangle = new Polygon();
         //cordinates
         triangle.getPoints().setAll(
                 200.0,200.0,  //x1,y1
                 300.0,300.0,  //x2,y2
                 200.0,300.0   //x3,y3
         );
         triangle.setFill(Color.BROWN);
         
         
         
         //Circle
         Circle circle = new Circle();
         //center of circle
         circle.setCenterX(450);
         circle.setCenterY(450);
         //circle redius
         circle.setRadius(100);
         //set color
         circle.setFill(Color.ORANGE);
         
         
         
         //without adding as a children of root, nothing will appear on screen
         root.getChildren().add(text);
         root.getChildren().add(line);
         root.getChildren().add(rectangle);
         root.getChildren().add(triangle);
         root.getChildren().add(circle);
         
         stage.setScene(scene);
         stage.show();
    
    }
    
}
