import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest3 {

    // log4j configuration website par javu and copy karvu configuration & logger
    //https://logging.apache.org/log4j/2.3.x/manual/configuration.html
    //additivity=false

    private static final Logger log = LogManager.getLogger(MyTest3.class);
    public static void main(String[] args) {
        //System.out.println("Hellp....log");
//resource folder ma log.xml file banavi koi pan name file ne api sakai che
        log.info("This is information message");
        log.debug("This is debug message");
        log.error("This is error message");



    }
}
