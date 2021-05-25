package cn.xdl.ydma.entity;

import java.io.Serializable;

public class QuestionWithBLOBs extends Question implements Serializable {
    private String body;

    private String analysis;

    private static final long serialVersionUID = 1L;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}