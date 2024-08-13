package CryptoConsumeAPI.Service;

import CryptoConsumeAPI.Entity.Crypto;
import CryptoConsumeAPI.Entity.CryptoApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public Mono<Crypto> getCryptoByName(String name) {
        return getCryptoDataList()
                .flatMapMany(Flux::fromIterable)
                .filter(crypto -> crypto.getCoinName().equalsIgnoreCase(name))
                .next();
    }

    public Mono<Crypto> getCryptoBySymbol(String symbol) {
        return getCryptoDataList()
                .flatMapMany(Flux::fromIterable)
                .filter(crypto -> crypto.getCoinSymbol().equalsIgnoreCase(symbol))
                .next();
    }

    public Mono<List<Map<String, Object>>> getCryptoList() {
        return webClient.get()
                .uri(apiUrl)
                .header(apiHeader, apiKey)
                .retrieve()
                .bodyToMono(CryptoApiResponse.class)
                .map(CryptoApiResponse::getData)
                .flatMapMany(Flux::fromIterable)
                .map(this::getCryptoMap)
                .collectList();
    }

    private Map<String, Object> getCryptoMap(Crypto crypto) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rank", crypto.getCoinRank());
        map.put("name", crypto.getCoinName());
        map.put("symbol", crypto.getCoinSymbol());
        map.put("price", crypto.getQuote().getUsd().getPrice());
        map.put("volume_24", crypto.getQuote().getUsd().getVolume24h());
        map.put("market_cap", crypto.getQuote().getUsd().getMarketCap());
        map.put("percent_change_1h", crypto.getQuote().getUsd().getPercentChange1h());
        map.put("percent_change_24h", crypto.getQuote().getUsd().getPercentChange24h());
        map.put("percent_change_7d", crypto.getQuote().getUsd().getPercentChange7d());
        map.put("percent_change_30d", crypto.getQuote().getUsd().getPercentChange30d());
        map.put("percent_change_60d", crypto.getQuote().getUsd().getPercentChange60d());
        map.put("percent_change_90d", crypto.getQuote().getUsd().getPercentChange90d());
        return map;
    }
}
