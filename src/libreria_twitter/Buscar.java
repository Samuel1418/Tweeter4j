/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_twitter;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
/**
 *
 * @author Samuel
 */
public class Buscar {
    public void busqueda()throws TwitterException{
    Twitter twitter = TwitterFactory.getSingleton();
    /*
    *
    * @param buscar used to enter what you want to search
    *
    */
    String buscar=JOptionPane.showInputDialog(null,"Que busca?");
    Query query = new Query(buscar);
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
}
}
}