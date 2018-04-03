/**
 * 
 * **
 * 
 * Urolepermission.java
 * 
 */
package com.frico.website.model.system;

/**
 * <p>
 * 表 : u_role_permission的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public class Urolepermission {
    /** 字段:rid，角色id */
    private Integer rid;

    /** 字段:pid，权限id */
    private Integer pid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}