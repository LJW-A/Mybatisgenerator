package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class City implements Serializable {
    private Integer cityid;

    private String belongto;

    private String enname;

    private String cnname;

    private String level;

    private Double baiduMapLng;

    private Double baiduMapLat;

    private static final long serialVersionUID = 1L;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto == null ? null : belongto.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Double getBaiduMapLng() {
        return baiduMapLng;
    }

    public void setBaiduMapLng(Double baiduMapLng) {
        this.baiduMapLng = baiduMapLng;
    }

    public Double getBaiduMapLat() {
        return baiduMapLat;
    }

    public void setBaiduMapLat(Double baiduMapLat) {
        this.baiduMapLat = baiduMapLat;
    }
}