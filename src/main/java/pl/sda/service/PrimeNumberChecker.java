package pl.sda.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class PrimeNumberChecker {

    private static final Logger LOGGER = LogManager.getLogger(PrimeNumberChecker.class);

    public boolean check(Integer number) {

        try {
            if (1 == 1) throw new NullPointerException();
        } catch (Exception ex) {
            LOGGER.error("Błąd ", ex);
        }

        return true;
    }
}
