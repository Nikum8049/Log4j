
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; //log4j.logger j karvu
import org.testng.annotations.Test;

public class MyTest {

    // log4j configuration website par javu and copy karvu configuration & logger
    //https://logging.apache.org/log4j/2.3.x/manual/configuration.html
    //additivity=false

    private static final Logger log = LogManager.getLogger(MyTest.class);

    @Test public static void main(String[] args) {
        //System.out.println("Hellp....log");

        log.info("This is information message");
        log.debug("This is debug message");
        log.error("This is error message");



    }
}
