package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;


public class Controller implements Initializable{

    @FXML
    public Text counter;

    public int numCounter = 1;

    TimerTask task = new TimerTask() {
        //task.run();
        @Override
        public void run() {
            //What goes here?
            numCounter++;
            String counterString = String.valueOf(numCounter);
            counter.setText("Timer: " + counterString);
        }

    };

    Timer timer = new Timer();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timer.schedule(task, 1000L, 1000L); //what task? How long do I wait for the first one? how often should I repeat?
    }


}







