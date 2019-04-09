/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_twitter;
import java.util.List;
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
       public void buscarTwit() throws TwitterException {
           /*
           *Podemos buscar uno de los ultimos mensajes
           *Pudiendo elegir una cantidad que limite los resultados de la busqueda
           */
           
        String mensaje=JOptionPane.showInputDialog("Mensaje a buscar");
        int cantidadTwits=Integer.parseInt(JOptionPane.showInputDialog("Numero maximo de twits que quieres ver"));
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query(mensaje);
            QueryResult result;
                result = AutorizarTweeter.autorizacion().search(query);
                List<Status> twit = result.getTweets();
                for (int i = 0; i < cantidadTwits; i++) {
                    System.out.println("@"+ twit.get(i).getUser().getScreenName()+"\nTwits-> "+ twit.get(i).getText());
                }
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Error en la busqueda de twits" + te.getErrorMessage());
            System.exit(-1);
        }
}
}