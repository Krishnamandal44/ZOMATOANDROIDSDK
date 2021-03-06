package com.sample.sayan.zomato_android_sdk.sayan_zomato_sdk.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sample.sayan.zomato_android_sdk.sayan_zomato_sdk.models.LocationSuggestion;
import com.sample.sayan.zomato_android_sdk.sayan_zomato_sdk.models.ZomatoLocationSuggestion;

import java.util.List;

/**
 * Created by Admin on 09-12-2017.
 */

public class ZomatoLocationsResponse {

    @SerializedName("location_suggestions")
    @Expose
    private List<ZomatoLocationSuggestion> locationSuggestions = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("has_more")
    @Expose
    private Integer hasMore;
    @SerializedName("has_total")
    @Expose
    private Integer hasTotal;

    public List<ZomatoLocationSuggestion> getLocationSuggestions() {
        return locationSuggestions;
    }

    public void setLocationSuggestions(List<ZomatoLocationSuggestion> locationSuggestions) {
        this.locationSuggestions = locationSuggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getHasTotal() {
        return hasTotal;
    }

    public void setHasTotal(Integer hasTotal) {
        this.hasTotal = hasTotal;
    }
}
