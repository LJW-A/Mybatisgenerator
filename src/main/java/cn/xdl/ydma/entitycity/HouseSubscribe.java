package cn.xdl.ydma.entitycity;

import java.io.Serializable;
import java.util.Date;

public class HouseSubscribe implements Serializable {
    private Integer housesubscribeid;

    private Integer houseid;

    private Integer userid;

    private String desc;

    private Integer status;

    private Date createtime;

    private Date lastupdatetime;

    private Date ordertime;

    private String telephone;

    private Integer adminid;

    private static final long serialVersionUID = 1L;

    public Integer getHousesubscribeid() {
        return housesubscribeid;
    }

    public void setHousesubscribeid(Integer housesubscribeid) {
        this.housesubscribeid = housesubscribeid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}