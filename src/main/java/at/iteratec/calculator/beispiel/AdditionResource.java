package at.iteratec.calculator.beispiel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionResource {
    @GetMapping("/api/add")
    public String add(@RequestParam int o1, @RequestParam int o2) {
        return String.valueOf(o1 + o2);
    }
}