package com.bos.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Area {
    private String id;
    private String name;
    private String mtype;
    private String mcount;

    @Id
    @Column(name = "id", nullable = false, length = 11)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 11)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "mtype", nullable = true, length = 50)
    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    @Basic
    @Column(name = "mcount", nullable = true, length = 50)
    public String getMcount() {
        return mcount;
    }

    public void setMcount(String mcount) {
        this.mcount = mcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(id, area.id) &&
                Objects.equals(name, area.name) &&
                Objects.equals(mtype, area.mtype) &&
                Objects.equals(mcount, area.mcount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, mtype, mcount);
    }
}
