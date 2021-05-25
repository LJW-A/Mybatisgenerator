package cn.xdl.ydma.entitycity;

import java.io.Serializable;

public class HouseDetail implements Serializable {
    private Integer housedetailid;

    private String description;

    private String layoutdesc;

    private String traffic;

    private String roundservice;

    private Integer rentway;

    private String address;

    private Integer subwayid;

    private String subwayname;

    private Integer subwaystationid;

    private String subwaystationname;

    private Integer houseid;

    private static final long serialVersionUID = 1L;

    public Integer getHousedetailid() {
        return housedetailid;
    }

    public void setHousedetailid(Integer housedetailid) {
        this.housedetailid = housedetailid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLayoutdesc() {
        return layoutdesc;
    }

    public void setLayoutdesc(String layoutdesc) {
        this.layoutdesc = layoutdesc == null ? null : layoutdesc.trim();
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getRoundservice() {
        return roundservice;
    }

    public void setRoundservice(String roundservice) {
        this.roundservice = roundservice == null ? null : roundservice.trim();
    }

    public Integer getRentway() {
        return rentway;
    }

    public void setRentway(Integer rentway) {
        this.rentway = rentway;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

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

    public Integer getSubwaystationid() {
        return subwaystationid;
    }

    public void setSubwaystationid(Integer subwaystationid) {
        this.subwaystationid = subwaystationid;
    }

    public String getSubwaystationname() {
        return subwaystationname;
    }

    public void setSubwaystationname(String subwaystationname) {
        this.subwaystationname = subwaystationname == null ? null : subwaystationname.trim();
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }
}