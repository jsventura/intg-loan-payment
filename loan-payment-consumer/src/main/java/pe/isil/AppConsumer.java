package pe.isil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConsumer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppConsumer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Aqui va el procedimiento");
    }
}
