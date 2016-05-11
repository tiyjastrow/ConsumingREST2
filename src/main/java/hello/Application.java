package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    /*
    {
  "RestResponse" : {
    "result" : {
      "countryIso2" : "US",
      "stateAbbr" : "AZ",
      "postal" : "85613",
      "continent" : "North America",
      "state" : "Arizona",
      "longitude" : "-110.3607",
      "latitude" : "31.5273",
      "ds" : "GL",
      "city" : "Fort Huachuaca",
      "country" : "United States",
      "ip" : "6.131.144.10"
    }
  }
}
     */
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        StateInfo stateInfo = restTemplate.getForObject("http://geo.groupkt.com/ip/6.131.144.10/json", StateInfo.class);
        log.info("\n\n VIEW State Info = " + stateInfo.toString() + "\n\n");
    }
}