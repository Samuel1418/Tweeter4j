/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_twitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author Samuel
 */
public class Libreria_Twitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
         int opcion=0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"******TWEETER******\nQue desea hacer?\n1º Ver su TimeLine\n2ºPublicar Tweet\n3ºBusqueda manual/nPara salir pulse 0"));
           switch(opcion){
                case 1:TimeLine time=new TimeLine();
                       time.lineaTemporal();
                       break;
                case 2:Tweetear send=new Tweetear();
                       send.publicarTweet();
                       break;
                case 3:Buscar search=new Buscar();
                       search.busqueda();
                       break;             
           } 
}while(opcion!=0);
        
}
        
    }
    