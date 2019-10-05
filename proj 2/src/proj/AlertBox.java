/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
 static Stage window;
    public static boolean display(String title, String message) {
         AlertBox ab=new AlertBox();
        window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Go Back To Login");
        closeButton.setOnAction(e -> ab.backl());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return true;
    }
    
    public void backl()
    {
        window.hide();
        try{
            FXMLLoader loader=new FXMLLoader(getClass().getResource("Login.fxml"));  
        Parent root1=(Parent) loader.load();
        Stage s=new Stage();
        s.initStyle(StageStyle.DECORATED);
        s.setTitle("LOGIN");
        s.setScene(new Scene(root1));
        s.show();
        
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
    }

}