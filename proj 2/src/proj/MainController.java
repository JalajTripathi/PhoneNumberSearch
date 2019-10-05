/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Senorita
 */
public class MainController implements Initializable {
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    @FXML
     private AnchorPane a1;
    @FXML
    void SigningUp(ActionEvent event) throws IOException
    {
        Stage stage = (Stage) a1.getScene().getWindow();
        stage.hide();
        try{
            FXMLLoader loader=new FXMLLoader(getClass().getResource("Signup.fxml"));  
        Parent root1=(Parent) loader.load();
        Stage s=new Stage();
        s.initStyle(StageStyle.DECORATED);
        s.setTitle("Sign UP");
        s.setScene(new Scene(root1));
        s.show();
        
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
    }
        @FXML
        void OpenHome(ActionEvent eve) throws IOException
    {
        Stage stage = (Stage) a1.getScene().getWindow();
        stage.hide();
        try{
            FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));  
        Parent root1=(Parent) loader.load();
        Stage s=new Stage();
        s.initStyle(StageStyle.DECORATED);
        s.setTitle("Home");
        s.setScene(new Scene(root1));
        s.show();
        
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
        
    }
    
   
    
}
