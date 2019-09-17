/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfxdemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author SRTINNI
 */
public class FXTRy extends Application{

    public static void main(String []args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    BorderPane hBox =new BorderPane();
    hBox.setMinSize(250, 300);
    //hBox.setAlignment(Pos.CENTER);
   // hBox.setSpacing(20);
    TextField tf =new TextField();
    tf.setMinSize(5, 8);
    Button btn =new Button();
    btn.setMinSize(20, 30);
    btn.setText("Click Here");
    hBox.getChildren().addAll(tf,btn);
    Scene s =new Scene(hBox);
    stage.setScene(s);
    stage.show();
    
    
    }
   
    
}
