package com.cmpe275.OpenHome.DataObjects;
import com.cmpe275.OpenHome.enums.PropertyType;
import com.cmpe275.OpenHome.enums.SharingType;
import com.cmpe275.OpenHome.enums.WifiType;

import java.sql.Date;
import java.sql.Timestamp;

public class PostingForm  {

    private String cityName;
    private Integer zipcode;
    private SharingType sharingType;
    private PropertyType propertyType;
    private String description;
    private WifiType wifi;
    private Timestamp startDate;
    private Timestamp endDate;
    private String dayAvailibility;



    private Integer fromPrice;
    private Integer toPrice;

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public SharingType getSharingType() {
        return sharingType;
    }

    public void setSharingType(SharingType sharingType) {
        this.sharingType = sharingType;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WifiType getWifi() {
        return wifi;
    }

    public void setWifi(WifiType wifi) {
        this.wifi = wifi;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(Integer fromPrice) {
        this.fromPrice = fromPrice;
    }

    public Integer getToPrice() {
        return toPrice;
    }

    public void setToPrice(Integer toPrice) {
        this.toPrice = toPrice;
    }

    public String getDayAvailibility() {
        return dayAvailibility;
    }

    public void setDayAvailibility(String dayAvailibility) {
        this.dayAvailibility = dayAvailibility;
    }
}
