package com.example.demo.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel()
public class Student {
    @ApiModelProperty(value = "学生ID",required = true)
    private  int stuID;
    @ApiModelProperty(value = "学生姓名")
    private  String stuName;
    @ApiModelProperty(value = "学生分数")
    private int score;

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setScore(int score) {
        this.score = score;
    }



    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public int getScore() {
        return score;
    }
}
