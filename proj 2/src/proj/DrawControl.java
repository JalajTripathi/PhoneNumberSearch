/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Senorita
 */
public class DrawControl implements Initializable{
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        RemControl rc=new RemControl();
//  deleter.setOnAction(e -> rc.deleterow(n));
    }
    @FXML
    private JFXButton deleter;
RemControl rc=new RemControl();
 
    @FXML
    void DeleteRow(ActionEvent event)
    {
        rc.deleterow();
    }
}
