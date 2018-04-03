/**
 * 
 * **
 * 
 * Uuserrole.java
 * 
 */
package com.frico.website.model.system;

/**
 * <p>
 * 表 : u_user_role的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public class Uuserrole {
    /** 字段:uid，用户id */
    private Integer uid;

    /** 字段:rid，角色id */
    private Integer rid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}