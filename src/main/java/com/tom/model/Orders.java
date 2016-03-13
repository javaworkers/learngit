package com.tom.model;

public class Orders {
    private Integer id;

    private String storagenumber;

    private String tracknumber;

    private Double weight;

    private String url;

    private Double price;

    private Integer accountid;

    private Integer storageid;

    private String state;

    private String iscreatepage;

    private Integer lineid;

    private String goodsnote;

    private Double tariff;

    private Double offerprice;

    private Double freight;

    private String goodsbrand;

    private String goodsmodel;

    private Integer goodscount;

    private Double goodsprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoragenumber() {
        return storagenumber;
    }

    public void setStoragenumber(String storagenumber) {
        this.storagenumber = storagenumber == null ? null : storagenumber.trim();
    }

    public String getTracknumber() {
        return tracknumber;
    }

    public void setTracknumber(String tracknumber) {
        this.tracknumber = tracknumber == null ? null : tracknumber.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIscreatepage() {
        return iscreatepage;
    }

    public void setIscreatepage(String iscreatepage) {
        this.iscreatepage = iscreatepage == null ? null : iscreatepage.trim();
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getGoodsnote() {
        return goodsnote;
    }

    public void setGoodsnote(String goodsnote) {
        this.goodsnote = goodsnote == null ? null : goodsnote.trim();
    }

    public Double getTariff() {
        return tariff;
    }

    public void setTariff(Double tariff) {
        this.tariff = tariff;
    }

    public Double getOfferprice() {
        return offerprice;
    }

    public void setOfferprice(Double offerprice) {
        this.offerprice = offerprice;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getGoodsbrand() {
        return goodsbrand;
    }

    public void setGoodsbrand(String goodsbrand) {
        this.goodsbrand = goodsbrand == null ? null : goodsbrand.trim();
    }

    public String getGoodsmodel() {
        return goodsmodel;
    }

    public void setGoodsmodel(String goodsmodel) {
        this.goodsmodel = goodsmodel == null ? null : goodsmodel.trim();
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }
}