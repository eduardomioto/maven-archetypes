package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.ge.hc.cloud.app.ce.App;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class App {

	 /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args ) {
        SpringApplication.run( App.class, args );
    }
}
