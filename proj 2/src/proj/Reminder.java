/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import javafx.beans.property.SimpleStringProperty;



/**
 *
 * @author Senorita
 */
public class Reminder {
    private SimpleStringProperty reminder,date1,time1,remtime;

    public Reminder(String reminder, String date1, String time1, String remtime) {
        this.reminder =new SimpleStringProperty (reminder);
        this.date1 = new SimpleStringProperty(date1);
        this.time1 = new SimpleStringProperty(time1);
        this.remtime = new SimpleStringProperty(remtime);
    }

   

    public String getReminder() {
        return reminder.get();
    }

    public void setReminder(String reminder) {
        this.reminder.set(reminder);
    }

    public String getDate1() {
        return date1.get();
    }

    public void setDate1(String date1) {
        this.date1.set(date1);
    }

    public String getTime1() {
        return time1.get();
    }

    public void setTime1(String time1) {
        this.time1.set(time1);
    }

    public String getRemtime() {
        return remtime.get();
    }

    public void setRemtime(String remtime) {
        this.remtime.set(remtime);
    }

  


   

    
    
}
