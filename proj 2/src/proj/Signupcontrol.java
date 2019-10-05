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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Senorita
 */
public class Signupcontrol implements Initializable{
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    @FXML
    private AnchorPane an;
    @FXML
    void backtol(ActionEvent eve) throws IOException
    {
       boolean res=AlertBox.display("Stop right there", "This is the MEESSSSAGE");
       if(res)
       {  Stage stage = (Stage) an.getScene().getWindow();
           stage.hide();
        
    }
    }
    
}
