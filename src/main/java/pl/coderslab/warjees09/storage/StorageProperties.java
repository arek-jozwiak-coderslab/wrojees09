package pl.coderslab.warjees09.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location = System.getProperty("user.home") +  System.getProperty("file.separator")
            + "wrojees09" ;

    }
