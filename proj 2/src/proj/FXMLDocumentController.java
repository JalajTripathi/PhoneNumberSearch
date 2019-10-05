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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Senorita
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private AnchorPane ac;
    @FXML
    void OpenRems(ActionEvent event) throws IOException
    {
        Stage stage = (Stage) ac.getScene().getWindow();
        stage.hide();
        try{
            FXMLLoader loader=new FXMLLoader(getClass().getResource("RemFXML.fxml"));  
        Parent root1=(Parent) loader.load();
        Stage s=new Stage();
        s.initStyle(StageStyle.DECORATED);
        Scene scene1=new Scene(root1);
        s.setTitle("Home");
        s.setScene(scene1);
        String css=Proj.class.getResource("styles.css").toExternalForm();
scene1.getStylesheets().add(css);
        s.show();
        
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
    
        
    }
            
    
}
