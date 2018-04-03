/**
 * 
 * **
 * 
 * Uuser.java
 * 
 */
package com.frico.website.model.system;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 表 : u_user的 Model 类
 * 
 * @author 	xrb
 * @date 	2018年03月29日
 */
public class Uuser {
    /** 字段:id */
    private Integer id;

    /** 字段:nickname，用户昵称 */
    private String nickname;

    /** 字段:moblie，登录账号(前台为手机号, 后台设置账号) */
    private String moblie;

    /** 字段:password，登录密码 */
    private String password;

    /** 字段:create_time，创建时间 */
    private Date createTime;

    /** 字段:last_login_time，最后登录时间 */
    private Date lastLoginTime;

    /** 字段:status，1 账号有效   0 禁止登录 */
    private Long status;

    /** 字段:is_delete，是否删除 */
    private String isDelete;

    private List<String> roleStrlist;
    private List<String> perminsStrlist;


    /******************************/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie == null ? null : moblie.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }


    @Override
    public
    String toString() {
        return "Uuser{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", moblie='" + moblie + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", lastLoginTime=" + lastLoginTime +
                ", status=" + status +
                ", isDelete=" + isDelete +
                '}';
    }

    public List <String> getRoleStrlist() {
        return roleStrlist;
    }

    public void setRoleStrlist(List <String> roleStrlist) {
        this.roleStrlist = roleStrlist;
    }

    public List <String> getPerminsStrlist() {
        return perminsStrlist;
    }

    public void setPerminsStrlist(List <String> perminsStrlist) {
        this.perminsStrlist = perminsStrlist;
    }
}
















