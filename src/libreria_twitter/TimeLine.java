/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_twitter;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Samuel
 */
public class TimeLine {
    public void lineaTemporal() throws TwitterException{
    // The factory instance is re-useable and thread safe.
    Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Mostrar linea del tiempo personal.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                               status.getText());
        }
    }
}
