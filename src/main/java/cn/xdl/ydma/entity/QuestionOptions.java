package cn.xdl.ydma.entity;

import java.io.Serializable;

public class QuestionOptions implements Serializable {
    private Integer optionId;

    private Integer questionId;

    private String optionName;

    private static final long serialVersionUID = 1L;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }
}