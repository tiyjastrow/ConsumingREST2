package hello;

/**
 * "countryIso2" : "US",
 "stateAbbr" : "AZ",
 "postal" : "85613",
 "continent" : "North America",
 "state" : "Arizona",
 "longitude" : "-110.3607",
 "latitude" : "31.5273",
 "ds" : "GL",
 "city" : "Fort Huachuaca",
 "country" : "United States",
 "ip" : "6.131.144.10"
 */
public class Detail {
    String countryAbbr;
    String stateAbbr;
    String postal;
    String continent;
    String state;
    String longitude;
    String latitude;
    String ds;
    String city;
    String country;
    String ip;

    public Detail() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryAbbr() {
        return countryAbbr;
    }

    public void setCountryAbbr(String countryAbbr) {
        this.countryAbbr = countryAbbr;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }
}
