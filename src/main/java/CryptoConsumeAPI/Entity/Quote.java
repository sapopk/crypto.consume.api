package CryptoConsumeAPI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty("USD")
    private USD usd;

    // Overload Constructor
    public Quote() {}

    // Constructor
    public Quote(USD usd) {
        this.usd = usd;
    }

    // Getters Method
    public USD getUsd() {
        return usd;
    }

    // Setters Methods
    public void setUsd(USD usd) {
        this.usd = usd;
    }
}
