package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class Subway implements Serializable {
    private Integer subwayid;

    private String subwayname;

    private String cityenname;

    private static final long serialVersionUID = 1L;

    public Integer getSubwayid() {
        return subwayid;
    }

    public void setSubwayid(Integer subwayid) {
        this.subwayid = subwayid;
    }

    public String getSubwayname() {
        return subwayname;
    }

    public void setSubwayname(String subwayname) {
        this.subwayname = subwayname == null ? null : subwayname.trim();
    }

    public String getCityenname() {
        return cityenname;
    }

    public void setCityenname(String cityenname) {
        this.cityenname = cityenname == null ? null : cityenname.trim();
    }
}