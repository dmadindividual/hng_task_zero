package topg.hng_task_one.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HngController {

    @GetMapping
    public Map<String, String> getDetails() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "ayomidefalade@gmail.com"); 
        response.put("current_datetime", DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
        response.put("github_url", "https://github.com/dmadindividual/hng_task_zero.git");
        return response;
    }
}
