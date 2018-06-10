package com.bos.domain;

/**
 * 取派员实体类
 * @author Simon
 */
public class Staff {
    private String id;
    private String name;
    private String telephone;
    /**
     * 是否持有PDA 1：有；0：无
     */
    private String haspda = "0";
    /**
     * 删除标识位 1：已删除；0：未删除
     */
    private String deltag = "0";
    private String station;
    private String standard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHaspda() {
        return haspda;
    }

    public void setHaspda(String haspda) {
        this.haspda = haspda;
    }

    public String getDeltag() {
        return deltag;
    }

    public void setDeltag(String deltag) {
        this.deltag = deltag;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
