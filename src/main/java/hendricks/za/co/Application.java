package hendricks.za.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Java main class responsible for enabling Spring Boot on startup
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
