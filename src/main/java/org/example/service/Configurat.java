package org.example.service;


//@Configuration
public class Configurat {

    //@Bean
    public DeveloperService developerService() {
        DeveloperService service = new DeveloperService();
        return service;
    }
}
