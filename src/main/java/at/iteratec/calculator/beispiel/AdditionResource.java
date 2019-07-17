package at.iteratec.calculator.beispiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AdditionResource {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private LoggingService loggingService;

    @Value("${radix}")
    private int radix;

    @GetMapping("/api/add")
    public String add(@RequestParam String o1, @RequestParam String o2) {
        int v1 = Integer.parseInt(o1, radix);
        int v2 = Integer.parseInt(o2, radix);
        String result = Integer.toString(v1 + v2, radix);
        loggingService.log("John Doe", o1 + " + " + o2 + " = " + result);

        return result;
    }
}