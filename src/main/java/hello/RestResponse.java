package hello;

public class RestResponse {
    private RestResult restResult;

    public RestResponse(RestResult restResult) {
        this.restResult = restResult;
    }

    public RestResponse() {
    }

    public RestResult getRestResult() {
        return restResult;
    }

    public void setRestResult(RestResult restResult) {
        this.restResult = restResult;
    }
}