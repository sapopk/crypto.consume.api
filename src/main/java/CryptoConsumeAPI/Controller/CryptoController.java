package CryptoConsumeAPI.Controller;

import CryptoConsumeAPI.Entity.Crypto;
import CryptoConsumeAPI.Entity.CryptoApiResponse;
import CryptoConsumeAPI.Service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/crypto")
public class CryptoController {

    private final CryptoService cryptoService;

    @Autowired
    public CryptoController(CryptoService service) {
        this.cryptoService = service;
    }

    @GetMapping("/data")
    public Mono<CryptoApiResponse> getApiData() {
        return cryptoService.getApiData();
    }

    @GetMapping("/list")
    public Mono<List<Crypto>> getAllCryptoData() {
        return cryptoService.getCryptoDataList();
    }

    @GetMapping("/data/name/{name}")
    public Mono<Crypto> getCryptoByName(@PathVariable String name) {
        return cryptoService.getCryptoByName(name);
    }

    @GetMapping("/data/symbol/{symbol}")
    public Mono<Crypto> getCryptoBySymbol(@PathVariable String symbol) {
        return cryptoService.getCryptoBySymbol(symbol);
    }

    @GetMapping("/table")
    public Mono<List<Map<String, Object>>> getAllCryptoList() {
        return cryptoService.getCryptoTable();
    }

    @GetMapping("/table/search/name/{name}")
    public Mono<List<Map<String, Object>>> searchCryptoListByName(@PathVariable String name) {
        return cryptoService.getCryptoTableByName(name);
    }

    @GetMapping("/table/search/symbol/{symbol}")
    public Mono<List<Map<String, Object>>> searchCryptoListBySymbol(@PathVariable String symbol) {
        return cryptoService.getCryptoTableBySymbol(symbol);
    }

    @GetMapping("/table/search/{input}")
    public Mono<List<Map<String, Object>>> searchCryptoListByNameOrSymbol(@PathVariable String input) {
        return cryptoService.getCryptoTableByNameOrSymbol(input);
    }
}
