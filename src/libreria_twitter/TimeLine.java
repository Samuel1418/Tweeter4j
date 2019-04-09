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
    List<Status> timeLineList = AutorizarTweeter.autorizacion().getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (int i = 0; i <=500; i++) {
            String aux = timeLineList.get(i).getText();
            System.out.println("-------Twit Nº"+(i+1)+"--------");
            System.out.println(aux);
        }

}
}
