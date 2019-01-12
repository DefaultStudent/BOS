package com.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Stock {
    private int id;
    private String date;
    private int instorageid;
    private int outstorageid;
    private String remark;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "instorageid", nullable = false)
    public int getInstorageid() {
        return instorageid;
    }

    public void setInstorageid(int instorageid) {
        this.instorageid = instorageid;
    }

    @Basic
    @Column(name = "outstorageid", nullable = false)
    public int getOutstorageid() {
        return outstorageid;
    }

    public void setOutstorageid(int outstorageid) {
        this.outstorageid = outstorageid;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id &&
                instorageid == stock.instorageid &&
                outstorageid == stock.outstorageid &&
                Objects.equals(date, stock.date) &&
                Objects.equals(remark, stock.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, instorageid, outstorageid, remark);
    }
}
