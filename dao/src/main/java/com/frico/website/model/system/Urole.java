/**
 * 
 * **
 * 
 * Urole.java
 * 
 */
package com.frico.website.model.system;

/**
 * <p>
 * 表 : u_role的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public class Urole {
    /** 字段:id */
    private Integer id;

    /** 字段:name，角色名称 */
    private String name;

    /** 字段:type，角色类型 */
    private String type;

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
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}