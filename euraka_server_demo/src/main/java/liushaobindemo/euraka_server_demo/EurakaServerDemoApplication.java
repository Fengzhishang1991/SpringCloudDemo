package liushaobindemo.euraka_server_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurakaServerDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurakaServerDemoApplication.class, args);
        //test git
    }

}
