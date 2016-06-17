package hello;

import com.sun.org.apache.xpath.internal.operations.Quo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        String url = "";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("aftership-api-key", "2db0fedb-614b-478e-80c2-82e5b67cf7f2");
        HttpEntity<String> request = new HttpEntity<String>(headers);

        url = "http://gturnquist-quoters.cfapps.io/api/random";
        ResponseEntity<Quote> respQuote = restTemplate.exchange(url, HttpMethod.GET, request, Quote.class);
        Quote quote = respQuote.getBody();
        log.info("\n\nQUOTE: " + quote.getValue().getQuote() + "\n\n");

        url = "https://api.aftership.com/v4/trackings/dhl/9712871770";

        ResponseEntity<AfterShip> respAfterShip = restTemplate.exchange(url, HttpMethod.GET, request, AfterShip.class);
        AfterShip afterShip = respAfterShip.getBody();

        Meta meta = afterShip.getMeta();
        Tracking tracking = afterShip.getData().getTracking();

//        AfterShip afterShip = restTemplate.getForObject("http://localhost:4567/trackpack", AfterShip.class);
        log.info("\n\nAfterShip: CODE = " + meta.getCode() +
                "\nID = " + tracking.getId() +
                "\nSlug = " + tracking.getSlug() +
                "\nTitle = " + tracking.getTitle() +
                "\nCreated = " + tracking.getCreated_at().substring(0, 10) + "\n");

//        StateInfo stateInfo = restTemplate.getForObject("http://localhost:4567/stateinfo", StateInfo.class);
//        System.out.println("\n\n" + stateInfo.getRestResponse().getRestResult().getCity());
//        if (! stateInfo.toString().isEmpty()) {
//            System.out.println("stateInfo = " + stateInfo.toString());
//            System.out.println("stateInfo.getRestResponse() = " + stateInfo.getRestResponse().toString());
//            System.out.println("stateInfo.getRestResponse().getRestResult() = " + stateInfo.getRestResponse().getRestResult().toString());
//            String result = stateInfo.getRestResponse().getRestResult().toString();
//            log.info("\n\n VIEW State Info = " + result + "\n\n");
//        }else{
//            System.out.println("stateInfo was NULL!");
//        }
    }
}