package cn.xdl.ydma.entitycity;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {

    private Integer houseid;

    private String title;

    private Integer price;

    private Float area;

    private Integer room;

    private Integer floor;

    private Integer totalfloor;

    private Integer watchtimes;

    private Integer buildyear;

    private Integer status;

    private Date createtime;

    private Date lastupdatetime;

    private String cityenname;

    private String regionenname;

    private String cover;

    private Integer direction;

    private Integer distancetosubway;

    private Integer parlour;

    private String district;

    private Integer adminid;

    private Integer bathroom;

    private String street;

    private String housecode;

    private static final long serialVersionUID = 1L;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getTotalfloor() {
        return totalfloor;
    }

    public void setTotalfloor(Integer totalfloor) {
        this.totalfloor = totalfloor;
    }

    public Integer getWatchtimes() {
        return watchtimes;
    }

    public void setWatchtimes(Integer watchtimes) {
        this.watchtimes = watchtimes;
    }

    public Integer getBuildyear() {
        return buildyear;
    }

    public void setBuildyear(Integer buildyear) {
        this.buildyear = buildyear;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getCityenname() {
        return cityenname;
    }

    public void setCityenname(String cityenname) {
        this.cityenname = cityenname == null ? null : cityenname.trim();
    }

    public String getRegionenname() {
        return regionenname;
    }

    public void setRegionenname(String regionenname) {
        this.regionenname = regionenname == null ? null : regionenname.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getDistancetosubway() {
        return distancetosubway;
    }

    public void setDistancetosubway(Integer distancetosubway) {
        this.distancetosubway = distancetosubway;
    }

    public Integer getParlour() {
        return parlour;
    }

    public void setParlour(Integer parlour) {
        this.parlour = parlour;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode == null ? null : housecode.trim();
    }
}