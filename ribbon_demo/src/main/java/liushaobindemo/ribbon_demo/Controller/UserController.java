package liushaobindemo.ribbon_demo.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallback")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://service-hi/hi?name=aa", String.class).getBody();
    }
    public String fallback(){return  "错了";}
}
