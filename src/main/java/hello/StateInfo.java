package hello;

public class StateInfo {
    private RestResponse restResponse;

    public StateInfo(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    public StateInfo() {
    }

    public RestResponse getRestResponse() { return restResponse; }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

}