package CryptoConsumeAPI.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class apiValues implements CommandLineRunner {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.key}")
    private String apiKey;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("API_URL: " + apiUrl);
        System.out.println("API_KEY: " + apiKey);
    }
}
