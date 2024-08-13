package CryptoConsumeAPI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class USD {

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("volume_24h")
    private BigDecimal volume24h;

    @JsonProperty("volume_change_24h")
    private double volumeChange24h;

    @JsonProperty("percent_change_1h")
    private double percentChange1h;

    @JsonProperty("percent_change_24h")
    private double percentChange24h;

    @JsonProperty("percent_change_7d")
    private double percentChange7d;

    @JsonProperty("percent_change_30d")
    private double percentChange30d;

    @JsonProperty("percent_change_60d")
    private double percentChange60d;

    @JsonProperty("percent_change_90d")
    private double percentChange90d;

    @JsonProperty("market_cap")
    private BigDecimal marketCap;

    @JsonProperty("market_cap_dominance")
    private double marketCapDominance;

    @JsonProperty("fully_diluted_market_cap")
    private BigDecimal fullyDilutedMarketCap;

    @JsonProperty("tvl")
    private Object tvl;

    @JsonProperty("last_updated")
    private String lastUpdated;

    //Overload Constructor
    public USD() {}

    //Constructor
    public USD(
            BigDecimal price,
            BigDecimal volume24h,
            double volumeChange24h,
            double percentChange1h,
            double percentChange24h,
            double percentChange7d,
            double percentChange30d,
            double percentChange60d,
            double percentChange90d, BigDecimal marketCap, double marketCapDominance, BigDecimal fullyDilutedMarketCap, Object tvl, String lastUpdated) {

        this.price = price;
        this.volume24h = volume24h;
        this.volumeChange24h = volumeChange24h;
        this.percentChange1h = percentChange1h;
        this.percentChange24h = percentChange24h;
        this.percentChange7d = percentChange7d;
        this.percentChange30d = percentChange30d;
        this.percentChange60d = percentChange60d;
        this.percentChange90d = percentChange90d;
        this.marketCap = marketCap;
        this.marketCapDominance = marketCapDominance;
        this.fullyDilutedMarketCap = fullyDilutedMarketCap;
        this.tvl = tvl;
        this.lastUpdated = lastUpdated;
    }

    // Getters Methods

    public String getLastUpdated() {
        return lastUpdated;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVolume24h() {
        return volume24h;
    }

    public double getVolumeChange24h() {
        return volumeChange24h;
    }

    public double getPercentChange1h() {
        return percentChange1h;
    }

    public double getPercentChange24h() {
        return percentChange24h;
    }

    public double getPercentChange7d() {
        return percentChange7d;
    }

    public double getPercentChange30d() {
        return percentChange30d;
    }

    public double getPercentChange60d() {
        return percentChange60d;
    }

    public double getPercentChange90d() {
        return percentChange90d;
    }

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public double getMarketCapDominance() {
        return marketCapDominance;
    }

    public BigDecimal getFullyDilutedMarketCap() {
        return fullyDilutedMarketCap;
    }

    public Object getTvl() {
        return tvl;
    }

    // Setters Methods

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setVolume24h(BigDecimal volume24h) {
        this.volume24h = volume24h;
    }

    public void setVolumeChange24h(double volumeChange24h) {
        this.volumeChange24h = volumeChange24h;
    }

    public void setPercentChange1h(double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public void setPercentChange24h(double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public void setPercentChange7d(double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public void setPercentChange30d(double percentChange30d) {
        this.percentChange30d = percentChange30d;
    }

    public void setPercentChange60d(double percentChange60d) {
        this.percentChange60d = percentChange60d;
    }

    public void setPercentChange90d(double percentChange90d) {
        this.percentChange90d = percentChange90d;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public void setMarketCapDominance(double marketCapDominance) {
        this.marketCapDominance = marketCapDominance;
    }

    public void setFullyDilutedMarketCap(BigDecimal fullyDilutedMarketCap) {
        this.fullyDilutedMarketCap = fullyDilutedMarketCap;
    }

    public void setTvl(Object tvl) {
        this.tvl = tvl;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
