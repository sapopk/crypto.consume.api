package CryptoConsumeAPI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("error_code")
    private int errorCode;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("elapsed")
    private int elapsed;

    @JsonProperty("credit_count")
    private int creditCount;

    @JsonProperty("notice")
    private String notice;

    @JsonProperty("total_count")
    private int totalCount;

    // Overload Constructor
    public Status() {}

    // Constructor
    public Status(String timestamp, int errorCode, String errorMessage, int elapsed, int creditCount, String notice, int totalCount) {
        this.timestamp = timestamp;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.elapsed = elapsed;
        this.creditCount = creditCount;
        this.notice = notice;
        this.totalCount = totalCount;
    }

    // Getters Method

    public String getTimestamp() {
        return timestamp;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getElapsed() {
        return elapsed;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public String getNotice() {
        return notice;
    }

    public int getTotalCount() {
        return totalCount;
    }

    // Setters Method

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}