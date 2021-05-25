package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class SubwayStation implements Serializable {
    private Integer subwaystationid;

    private Integer subwayid;

    private String subwaystationname;

    private static final long serialVersionUID = 1L;

    public Integer getSubwaystationid() {
        return subwaystationid;
    }

    public void setSubwaystationid(Integer subwaystationid) {
        this.subwaystationid = subwaystationid;
    }

    public Integer getSubwayid() {
        return subwayid;
    }

    public void setSubwayid(Integer subwayid) {
        this.subwayid = subwayid;
    }

    public String getSubwaystationname() {
        return subwaystationname;
    }

    public void setSubwaystationname(String subwaystationname) {
        this.subwaystationname = subwaystationname == null ? null : subwaystationname.trim();
    }
}