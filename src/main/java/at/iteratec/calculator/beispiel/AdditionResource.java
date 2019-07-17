package at.iteratec.calculator.beispiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionResource {
    @Autowired
    private LoggingService loggingService;

    @GetMapping("/api/add")
    public String add(@RequestParam int o1, @RequestParam int o2) {
        String result = String.valueOf(o1 + o2);
        loggingService.log("John Doe", o1 + " + " + o2 + " = " + result);

        return result;
    }
}