package delayer;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "delays")
    public Function<Long, String> delay() {
        return value -> {
            try {
                Thread.sleep(value);
                return "Delayed: " + value;
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception.getMessage());
            }
        };
    }

}
