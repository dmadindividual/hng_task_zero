package topg.hng_task_one.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HngController {

    @GetMapping
    public Map<String, String> getDetails() {
        Map<String, String> response = new LinkedHashMap<>();

        // Format current date-time in the desired format (no nanoseconds)
        String formattedDate = DateTimeFormatter.ISO_DATE_TIME
                .withZone(ZoneOffset.UTC)
                .format(Instant.now().truncatedTo(java.time.temporal.ChronoUnit.SECONDS));

        response.put("email", "ayomidefalade@gmail.com");
        response.put("current_datetime", formattedDate);
        response.put("github_url", "https://github.com/dmadindividual/hng_task_zero");

        return response;
    }
}