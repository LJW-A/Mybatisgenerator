package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class HousePicture implements Serializable {
    private Integer housepictureid;

    private Integer houseid;

    private String cdnprefix;

    private Integer width;

    private Integer height;

    private String location;

    private String path;

    private static final long serialVersionUID = 1L;

    public Integer getHousepictureid() {
        return housepictureid;
    }

    public void setHousepictureid(Integer housepictureid) {
        this.housepictureid = housepictureid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getCdnprefix() {
        return cdnprefix;
    }

    public void setCdnprefix(String cdnprefix) {
        this.cdnprefix = cdnprefix == null ? null : cdnprefix.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}