package CryptoConsumeAPI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CryptoApiResponse {

    @JsonProperty("status")
    private Status status;

    @JsonProperty("data")
    private List<Crypto> data;

    //Overload Constructor
    public CryptoApiResponse() {}

    //Constructor
    public CryptoApiResponse(Status status, List<Crypto> data) {
        this.status = status;
        this.data = data;
    }

    // Getters Method

    public Status getStatus() {
        return status;
    }

    public List<Crypto> getData() {
        return data;
    }

    // Setters Method

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setData(List<Crypto> data) {
        this.data = data;
    }
}
