package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class HouseTag implements Serializable {
    private Integer housetagid;

    private Integer houseid;

    private String tagname;

    private static final long serialVersionUID = 1L;

    public Integer getHousetagid() {
        return housetagid;
    }

    public void setHousetagid(Integer housetagid) {
        this.housetagid = housetagid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}