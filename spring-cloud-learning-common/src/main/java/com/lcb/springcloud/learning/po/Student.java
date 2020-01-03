package com.lcb.springcloud.learning.po;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    private String address;
    private Date birthDay;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer sex, String address, Date birthDay, Date createTime, String createUser, Date updateTime, String updateUser) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.birthDay = birthDay;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", address='").append(address).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser='").append(updateUser).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
