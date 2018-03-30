package com.frico.website.common.model;

import com.frico.website.common.Enum.DeleteEnum;
import com.frico.website.common.UserUtil;
import com.frico.website.common.exception.MyException;

import java.io.Serializable;
import java.util.Date;

public abstract class DataEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum=1;//默认页码

    private int pageSize=10;//页数

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
