package liushaobindemo.consul_client_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientDemoApplication.class, args);
    }

}
