package libreria_twitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase Autorizar donde estara el metodo que permita establecer conexion con mi cuenta
 * @author Samuel
 */
public class AutorizarTweeter {
/**
 * Contiene las keys y los tokens para hacer la conexion y poder acceder a mi cuenta de twitter
 */
    public static Twitter autorizacion() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("***********************")
                .setOAuthConsumerSecret("*********************************************")
                .setOAuthAccessToken("*************************************************")
                .setOAuthAccessTokenSecret("*********************************************");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }
}
