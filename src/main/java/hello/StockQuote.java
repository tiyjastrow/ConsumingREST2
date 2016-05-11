package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by johnjastrow on 5/5/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockQuote {
    String Status;
    String Name;
    String Symbol;
    String LastPrice;
    String Change;
    String ChangePercent;
    String Timestamp;
    String MSDate;
    String MarketCap;
    String Volume;
    String ChangeYTD;
    String ChangePercentYTD;
    String High;
    String Low;
    String Open;

    public StockQuote() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLastPrice() {
        return LastPrice;
    }

    public void setLastPrice(String lastPrice) {
        LastPrice = lastPrice;
    }

    public String getChange() {
        return Change;
    }

    public void setChange(String change) {
        Change = change;
    }

    public String getChangePercent() {
        return ChangePercent;
    }

    public void setChangePercent(String changePercent) {
        ChangePercent = changePercent;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    public String getMSDate() {
        return MSDate;
    }

    public void setMSDate(String MSDate) {
        this.MSDate = MSDate;
    }

    public String getMarketCap() {
        return MarketCap;
    }

    public void setMarketCap(String marketCap) {
        MarketCap = marketCap;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public String getChangeYTD() {
        return ChangeYTD;
    }

    public void setChangeYTD(String changeYTD) {
        ChangeYTD = changeYTD;
    }

    public String getChangePercentYTD() {
        return ChangePercentYTD;
    }

    public void setChangePercentYTD(String changePercentYTD) {
        ChangePercentYTD = changePercentYTD;
    }

    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }

    public String getLow() {
        return Low;
    }

    public void setLow(String low) {
        Low = low;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    @Override
    public String toString() {
        String upDown = " Up: ";
        if (getChange().startsWith("-")) upDown = " Dn: ";
        return String.format("LastPrice = %s %s%s", getLastPrice(), upDown, getChange());
    }
}
