/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_twitter;

import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Samuel
 */
public class Tweetear {
    public void publicarTweet() throws TwitterException{
        /*
        *Autorizamos al metodo a crear el tweet y metemos en la ventana lo que queramos publicar
        */
        Status tweetEscrito = AutorizarTweeter.autorizacion().updateStatus(JOptionPane.showInputDialog("Twit"));
}
}
