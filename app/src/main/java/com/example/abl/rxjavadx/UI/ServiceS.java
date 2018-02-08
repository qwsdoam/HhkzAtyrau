package com.example.abl.rxjavadx.UI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ABL on 08.02.2018.
 */

public class ServiceS {

    @SerializedName("clusters")
    @Expose
    private Object clusters;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("arguments")
    @Expose
    private Object arguments;
    @SerializedName("found")
    @Expose
    private Integer found;
    @SerializedName("alternate_url")
    @Expose
    private String alternateUrl;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("page")
    @Expose
    private Integer page;

    public Object getClusters() {
        return clusters;
    }

    public void setClusters(Object clusters) {
        this.clusters = clusters;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Object getArguments() {
        return arguments;
    }

    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public String getAlternateUrl() {
        return alternateUrl;
    }

    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }


}