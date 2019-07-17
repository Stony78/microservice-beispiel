package at.iteratec.calculator.beispiel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingServiceFallback implements LoggingService {
    private Logger logger = LoggerFactory.getLogger(LoggingServiceFallback.class);

    @Override
    public void log(String name, String expression) {
        logger.error("Logging fehlgeschlagen für " + name + ": " + expression);
    }
}
