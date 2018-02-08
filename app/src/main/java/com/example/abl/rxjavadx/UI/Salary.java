package com.example.abl.rxjavadx.UI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ABL on 08.02.2018.
 */

public class Salary {

    @SerializedName("to")
    @Expose
    private Object to;
    @SerializedName("gross")
    @Expose
    private Boolean gross;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Object getTo() {
        return to;
    }

    public void setTo(Object to) {
        this.to = to;
    }

    public Boolean getGross() {
        return gross;
    }

    public void setGross(Boolean gross) {
        this.gross = gross;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
