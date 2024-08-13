package CryptoConsumeAPI.Service;

import CryptoConsumeAPI.Entity.Crypto;
import CryptoConsumeAPI.Entity.CryptoApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CryptoService {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.header}")
    private String apiHeader;

    private final WebClient webClient;

    @Autowired
    public CryptoService(WebClient.Builder client) {
        this.webClient = client.build();
    }

    // Fetch API Data
    public Mono<CryptoApiResponse> getApiData() {
        return webClient
                .get()
                .uri(apiUrl)
                .header(apiHeader, apiKey)
                .retrieve()
                .bodyToMono(CryptoApiResponse.class);
    }

    public Mono<List<Crypto>> getCryptoDataList() {
        return webClient.get()
                .uri(apiUrl)
                .header(apiHeader, apiKey)
                .retrieve()
                .bodyToMono(CryptoApiResponse.class)
                .map(CryptoApiResponse::getData);
    }
}
