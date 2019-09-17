
package labfxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TEC
 */
public class LabFXDemo extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    StackPane sPane=new StackPane();
    sPane.setMinSize(500,300);
    Button btn =new Button();
    btn.setText("Click me");
    sPane.getChildren().add(btn);
    Scene scene=new Scene(sPane);
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }
    
    
}
