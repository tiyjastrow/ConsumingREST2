package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
  {
  "meta": {
    "code": 200
  },
  "data": {
    "tracking": {
      "id": "5759b9a6751426340d193a44",
      "created_at": "2016-06-09T18:47:02+00:00",
      "tracking_number": "9712871770",
      "slug": "dhl",
      "active": true
      }
    }
  }
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class AfterShip {

    private Meta meta;
    private Data data;

    public AfterShip() {
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
