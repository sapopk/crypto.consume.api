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

    @GetMapping("/search/name/{name}")
    public Mono<Crypto> getCryptoByName(@PathVariable String name) {
        return cryptoService.getCryptoByName(name);
    }

    @GetMapping("/search/symbol/{symbol}")
    public  Mono<Crypto> getCryptoBySymbol(@PathVariable String symbol) {
        return cryptoService.getCryptoBySymbol(symbol);
    }
}
