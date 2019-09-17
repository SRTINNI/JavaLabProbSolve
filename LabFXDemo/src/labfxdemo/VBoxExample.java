
package labfxdemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class VBoxExample extends Application{
    
     public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
        
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    
    VBox vbox = new VBox();
    vbox.setMinSize(500, 300);
    vbox.setAlignment(Pos.CENTER);
    vbox.setSpacing(20);
    
    Button btn = new Button("Click me");
    
    TextField tf = new TextField();
    tf.setMaxWidth(175);
    
    vbox.getChildren().addAll(tf,btn);
    Scene scene = new Scene(vbox);
    primaryStage.setScene(scene);
    primaryStage.show();
    
    
    
    
    
    }
    
    
}
