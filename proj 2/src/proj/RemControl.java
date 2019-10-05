/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Senorita
 */
public class RemControl implements Initializable {
    
     @FXML  
  private AnchorPane a1;
  
     @FXML
     private JFXDrawer drawer;
     
     
    @FXML
     private TableView<Reminder> tabl;
    @FXML
     private TableColumn<Reminder, String> colu;
    @FXML
     private TableColumn<Reminder, String> datee;
    @FXML     
     private TableColumn<Reminder, String> timee;
    @FXML       
     private TableColumn<Reminder, String> remt;
  
     static Reminder clickedRow,cr;
     

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         try {
             VBox vb=FXMLLoader.load(getClass().getResource("DrawerFXML.fxml"));
              drawer.setSidePane(vb);
              drawer.open();
               a1.getStyleClass().add("gradien");
//              tab=new TableView<>();
//              col=new TableColumn<>("Reminder");
//              timee=new TableColumn<>("Time");
//              datee=new TableColumn<>("Date");
//              remt=new TableColumn<>("Remind Time");
//              col.setMinWidth(100);
//               timee.setMinWidth(100);
//                datee.setMinWidth(100);
//                 remt.setMinWidth(100);
        
//         tab.setItems(getRems());
//            tab.getColumns().addAll(col,datee,timee,remt);
//            a2.getChildren().addAll(tab);
     final ObservableList<Reminder> data=FXCollections.observableArrayList( 
             new Reminder("Fly","10:55","10-05-31","12:26"),
        new Reminder("Wattat","09:00","48-12-15","15:15"),
        new Reminder("twat","41:23","12-02-13","12:03"));
//     
                 colu.setCellValueFactory(new PropertyValueFactory<Reminder, String>("reminder"));
                datee.setCellValueFactory(new PropertyValueFactory<Reminder, String>("date1"));
               timee.setCellValueFactory(new PropertyValueFactory<Reminder, String>("time1"));
               remt.setCellValueFactory(new PropertyValueFactory<Reminder, String>("remtime"));
     tabl.setItems(data);
      tabl.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

     tabl.setRowFactory(tv -> {
    TableRow<Reminder> row = new TableRow<>();
    row.setOnMouseClicked(event -> {
        if (! row.isEmpty() && event.getButton()==MouseButton.PRIMARY 
             && event.getClickCount() == 1) {

             clickedRow = row.getItem();
        cr=clickedRow;
        }
    });
    return row ;
});

       
        
         } catch (IOException ex) {
             Logger.getLogger(RemControl.class.getName()).log(Level.SEVERE, null, ex);
         }
        
       
    }
    public void deleterow()
    {
       
//        ObservableList<Reminder> selectrows,allrems;
//        allrems=tabl.getItems();
//        selectrows=tabl.getSelectionModel().getSelectedItems();
//        selectrows.forEach(allrems::remove);
//         int index = tabl.getSelectionModel().getSelectedIndex();
//        Reminder r = tabl.getItems().get(index); 
//        tabl.getItems().remove(r);
   
        tabl.getItems().remove(cr);
       
        
    }
    private void printRow(Reminder item) {
        System.err.println(item);
//        tabl.getItems().remove(item);
}
 
}
