/**
 * 
 * **
 * 
 * Upermission.java
 * 
 */
package com.frico.website.model.system;

import java.io.Serializable;

/**
 * <p>
 * 表 : u_permission的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public class Upermission implements Serializable{

    private static final long serialVersionUID = 3615479614939574812L;
    /** 字段:id */
    private Integer id;

    /** 字段:url，URL地址 */
    private String url;

    /** 字段:name，url描述 */
    private String name;



    /***********************************/

    @Override
    public String toString() {
        return "Upermission{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}