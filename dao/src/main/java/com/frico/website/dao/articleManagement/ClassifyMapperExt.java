/**
 * 
 * **
 * 
 * ClassifyMapperExt.java
 * 
 */
package com.frico.website.dao.articleManagement;

import com.frico.website.model.articleManagement.Classify;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * ClassifyMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2018年03月26日
 */
@Resource
public interface ClassifyMapperExt extends ClassifyMapper {

    public List<Classify> findAll(Classify classify);
}