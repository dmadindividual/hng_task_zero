package topg.hng_task_one.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.time.ZoneOffset;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HngController {

    @GetMapping
    public Map<String, String> getDetails() {
        Map<String, String> response = new HashMap<>();
     
       
        response.put("github_url", "https://github.com/dmadindividual/hng_task_zero");
 response.put("current_datetime", DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneOffset.UTC).format(Instant.now()));
           response.put("email", "ayomidefalade@gmail.com"); 
        return response;
    }
}
