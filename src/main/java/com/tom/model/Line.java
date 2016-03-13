package com.tom.model;

public class Line {
    private Integer id;

    private String name;

    private String start;

    private String end;

    private Double firstprice;

    private Double nextprice;

    private Double shipmentweight;

    private Double shipmentprice;

    private String note;

    private Double tariffratio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Double getFirstprice() {
        return firstprice;
    }

    public void setFirstprice(Double firstprice) {
        this.firstprice = firstprice;
    }

    public Double getNextprice() {
        return nextprice;
    }

    public void setNextprice(Double nextprice) {
        this.nextprice = nextprice;
    }

    public Double getShipmentweight() {
        return shipmentweight;
    }

    public void setShipmentweight(Double shipmentweight) {
        this.shipmentweight = shipmentweight;
    }

    public Double getShipmentprice() {
        return shipmentprice;
    }

    public void setShipmentprice(Double shipmentprice) {
        this.shipmentprice = shipmentprice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Double getTariffratio() {
        return tariffratio;
    }

    public void setTariffratio(Double tariffratio) {
        this.tariffratio = tariffratio;
    }
}