package hello;

/**
 * Created by johnjastrow on 6/10/16.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tracking {
    private String id;
    private String created_at;
    private String tracking_number;
    private String slug;
    private Boolean active;
    private List android;
    private Object custom_fields;
    private Object customer_name;
    private Integer delivery_time;
    private Object destination_country_iso3;
    private List emails;
    private Object expected_delivery;
    private List ios;
    private Object note;
    private Object order_id;
    private Object order_id_path;
    private Object origin_country_iso3;
    private Integer shipment_package_count;
    private Object shipment_pickup_date;
    private Object shipment_delivery_date;
    private Object shipment_type;
    private Object shipment_weight;
    private Object shipment_weight_unit;
    private Object signed_by;
    private List smses;
    private String source;
    private String tag;
    private String title;
    private Integer tracked_count;
    private String unique_token;
    private List checkpoints;
    private Object tracking_account_number;
    private Object tracking_destination_country;
    private Object tracking_key;
    private Object tracking_postal_code;
    private Object tracking_ship_date;

    public Tracking() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List getAndroid() {
        return android;
    }

    public void setAndroid(List android) {
        this.android = android;
    }

    public Object getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(Object custom_fields) {
        this.custom_fields = custom_fields;
    }

    public Object getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(Object customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Integer delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Object getDestination_country_iso3() {
        return destination_country_iso3;
    }

    public void setDestination_country_iso3(Object destination_country_iso3) {
        this.destination_country_iso3 = destination_country_iso3;
    }

    public List getEmails() {
        return emails;
    }

    public void setEmails(List emails) {
        this.emails = emails;
    }

    public Object getExpected_delivery() {
        return expected_delivery;
    }

    public void setExpected_delivery(Object expected_delivery) {
        this.expected_delivery = expected_delivery;
    }

    public List getIos() {
        return ios;
    }

    public void setIos(List ios) {
        this.ios = ios;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public Object getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Object order_id) {
        this.order_id = order_id;
    }

    public Object getOrder_id_path() {
        return order_id_path;
    }

    public void setOrder_id_path(Object order_id_path) {
        this.order_id_path = order_id_path;
    }

    public Object getOrigin_country_iso3() {
        return origin_country_iso3;
    }

    public void setOrigin_country_iso3(Object origin_country_iso3) {
        this.origin_country_iso3 = origin_country_iso3;
    }

    public Integer getShipment_package_count() {
        return shipment_package_count;
    }

    public void setShipment_package_count(Integer shipment_package_count) {
        this.shipment_package_count = shipment_package_count;
    }

    public Object getShipment_pickup_date() {
        return shipment_pickup_date;
    }

    public void setShipment_pickup_date(Object shipment_pickup_date) {
        this.shipment_pickup_date = shipment_pickup_date;
    }

    public Object getShipment_delivery_date() {
        return shipment_delivery_date;
    }

    public void setShipment_delivery_date(Object shipment_delivery_date) {
        this.shipment_delivery_date = shipment_delivery_date;
    }

    public Object getShipment_type() {
        return shipment_type;
    }

    public void setShipment_type(Object shipment_type) {
        this.shipment_type = shipment_type;
    }

    public Object getShipment_weight() {
        return shipment_weight;
    }

    public void setShipment_weight(Object shipment_weight) {
        this.shipment_weight = shipment_weight;
    }

    public Object getShipment_weight_unit() {
        return shipment_weight_unit;
    }

    public void setShipment_weight_unit(Object shipment_weight_unit) {
        this.shipment_weight_unit = shipment_weight_unit;
    }

    public Object getSigned_by() {
        return signed_by;
    }

    public void setSigned_by(Object signed_by) {
        this.signed_by = signed_by;
    }

    public List getSmses() {
        return smses;
    }

    public void setSmses(List smses) {
        this.smses = smses;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTracked_count() {
        return tracked_count;
    }

    public void setTracked_count(Integer tracked_count) {
        this.tracked_count = tracked_count;
    }

    public String getUnique_token() {
        return unique_token;
    }

    public void setUnique_token(String unique_token) {
        this.unique_token = unique_token;
    }

    public List getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(List checkpoints) {
        this.checkpoints = checkpoints;
    }

    public Object getTracking_account_number() {
        return tracking_account_number;
    }

    public void setTracking_account_number(Object tracking_account_number) {
        this.tracking_account_number = tracking_account_number;
    }

    public Object getTracking_destination_country() {
        return tracking_destination_country;
    }

    public void setTracking_destination_country(Object tracking_destination_country) {
        this.tracking_destination_country = tracking_destination_country;
    }

    public Object getTracking_key() {
        return tracking_key;
    }

    public void setTracking_key(Object tracking_key) {
        this.tracking_key = tracking_key;
    }

    public Object getTracking_postal_code() {
        return tracking_postal_code;
    }

    public void setTracking_postal_code(Object tracking_postal_code) {
        this.tracking_postal_code = tracking_postal_code;
    }

    public Object getTracking_ship_date() {
        return tracking_ship_date;
    }

    public void setTracking_ship_date(Object tracking_ship_date) {
        this.tracking_ship_date = tracking_ship_date;
    }
}
