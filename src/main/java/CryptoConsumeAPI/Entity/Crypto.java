package CryptoConsumeAPI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;

public class Crypto {

    @JsonProperty("id")
    private int coinID;

    @JsonProperty("name")
    private String coinName;

    @JsonProperty("symbol")
    private String coinSymbol;

    @JsonProperty("slug")
    private String coinSlug;

    @JsonProperty("num_market_pairs")
    private int numMarketPairs;

    @JsonProperty("date_added")
    private String dateAdded;

    @JsonProperty("tags")
    private List<String> coinTags;

    @JsonProperty("max_supply")
    private BigDecimal maxSupply;

    @JsonProperty("circulating_supply")
    private BigDecimal coinCirculatingSupply;

    @JsonProperty("total_supply")
    private BigDecimal coinTotalSupply;

    @JsonProperty("infinite_supply")
    private boolean coinInfiniteSupply;

    @JsonProperty("platform")
    private Object platform;

    @JsonProperty("cmc_rank")
    private int coinRank;

    @JsonProperty("self_reported_circulating_supply")
    private BigDecimal selfReportedCirculatingSupply;

    @JsonProperty("self_reported_market_cap")
    private BigDecimal selfReportedMarketCap;

    @JsonProperty("tvl_ratio")
    private Object coinTvlRatio;

    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("quote")
    private Quote quote;

    //Overload Constructor
    public Crypto() {}

    //Constructor
    public Crypto(
            int coinID,
            String coinName,
            String coinSymbol,
            String coinSlug,
            int numMarketPairs,
            String dateAdded,
            List<String> coinTags,
            BigDecimal maxSupply,
            BigDecimal coinCirculatingSupply,
            BigDecimal coinTotalSupply,
            boolean coinInfiniteSupply,
            Object platform,
            int coinRank,
            BigDecimal selfReportedCirculatingSupply, BigDecimal selfReportedMarketCap, Object coinTvlRatio, String lastUpdated, Quote quote) {

        this.coinID = coinID;
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.coinSlug = coinSlug;
        this.numMarketPairs = numMarketPairs;
        this.dateAdded = dateAdded;
        this.coinTags = coinTags;
        this.maxSupply = maxSupply;
        this.coinCirculatingSupply = coinCirculatingSupply;
        this.coinTotalSupply = coinTotalSupply;
        this.coinInfiniteSupply = coinInfiniteSupply;
        this.platform = platform;
        this.coinRank = coinRank;
        this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
        this.selfReportedMarketCap = selfReportedMarketCap;
        this.coinTvlRatio = coinTvlRatio;
        this.lastUpdated = lastUpdated;
        this.quote = quote;
    }

    // Getters Method

    public int getCoinID() {
        return coinID;
    }

    public String getCoinName() {
        return coinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public String getCoinSlug() {
        return coinSlug;
    }

    public int getNumMarketPairs() {
        return numMarketPairs;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public List<String> getCoinTags() {
        return coinTags;
    }

    public BigDecimal getMaxSupply() {
        return maxSupply;
    }

    public BigDecimal getCoinCirculatingSupply() {
        return coinCirculatingSupply;
    }

    public BigDecimal getCoinTotalSupply() {
        return coinTotalSupply;
    }

    public boolean isCoinInfiniteSupply() {
        return coinInfiniteSupply;
    }

    public Object getPlatform() {
        return platform;
    }

    public int getCoinRank() {
        return coinRank;
    }

    public BigDecimal getSelfReportedCirculatingSupply() {
        return selfReportedCirculatingSupply;
    }

    public BigDecimal getSelfReportedMarketCap() {
        return selfReportedMarketCap;
    }

    public Object getCoinTvlRatio() {
        return coinTvlRatio;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public Quote getQuote() {
        return quote;
    }

    // Setters Methods

    public void setCoinID(int coinID) {
        this.coinID = coinID;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public void setCoinSlug(String coinSlug) {
        this.coinSlug = coinSlug;
    }

    public void setNumMarketPairs(int numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setCoinTags(List<String> coinTags) {
        this.coinTags = coinTags;
    }

    public void setMaxSupply(BigDecimal maxSupply) {
        this.maxSupply = maxSupply;
    }

    public void setCoinCirculatingSupply(BigDecimal coinCirculatingSupply) {
        this.coinCirculatingSupply = coinCirculatingSupply;
    }

    public void setCoinTotalSupply(BigDecimal coinTotalSupply) {
        this.coinTotalSupply = coinTotalSupply;
    }

    public void setCoinInfiniteSupply(boolean coinInfiniteSupply) {
        this.coinInfiniteSupply = coinInfiniteSupply;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public void setCoinRank(int coinRank) {
        this.coinRank = coinRank;
    }

    public void setSelfReportedCirculatingSupply(BigDecimal selfReportedCirculatingSupply) {
        this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
    }

    public void setSelfReportedMarketCap(BigDecimal selfReportedMarketCap) {
        this.selfReportedMarketCap = selfReportedMarketCap;
    }

    public void setCoinTvlRatio(Object coinTvlRatio) {
        this.coinTvlRatio = coinTvlRatio;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}