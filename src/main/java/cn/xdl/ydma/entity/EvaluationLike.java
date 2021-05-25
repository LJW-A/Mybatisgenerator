package cn.xdl.ydma.entity;

import java.io.Serializable;
import java.util.Date;

public class EvaluationLike implements Serializable {
    private Integer id;

    private Integer evaluationId;

    private Integer userId;

    private Date likeTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(Date likeTime) {
        this.likeTime = likeTime;
    }
}