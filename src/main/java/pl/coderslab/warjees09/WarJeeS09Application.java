package pl.coderslab.warjees09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.coderslab.warjees09.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class WarJeeS09Application {

    public static void main(String[] args) {
        SpringApplication.run(WarJeeS09Application.class, args);
    }

}
