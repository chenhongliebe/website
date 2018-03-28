package com.frico.website.web.classifyManagement;

import com.frico.website.common.Enum.DeleteEnum;
import com.frico.website.common.Result;
import com.frico.website.model.articleManagement.Classify;
import com.frico.website.service.classifyManagement.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/28
 * Time: 11:17
 * Java gives me life and I have to work hard.
 */

@RestController
@RequestMapping("bc/classify")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    /**
     * 添加分类
     * @param classify
     * @return
     */
    @RequestMapping("insert")
    public Result insert(@RequestBody Classify classify) {

        classifyService.insert(classify);
        return Result.success();
    }

    /**
     * 编辑分类
     * @param classify
     * @return
     */
    @RequestMapping("update")
    public Result update(@RequestBody Classify classify) {

        classifyService.update(classify);
        return Result.success();
    }

    /**
     * 查询全部的分类
     * @param classify
     * @return
     */
    @RequestMapping("findAll")
    public Result<List<Classify>> findAll(@RequestBody Classify classify) {

        List<Classify> list = classifyService.findAll(classify);

        return Result.success(list);
    }


    /**
     * 逻辑删除,加入回收站
     * @param ids
     * @return
     */
    @RequestMapping("delete")
    public Result delete(@RequestBody Integer[] ids) {
        if(ids != null && ids.length > 1){
            for (Integer id : ids){
                Classify classify = new Classify();
                classify.setId(id);
                classify.setIsDelete(DeleteEnum.DELETED.getCode());
                classifyService.update(classify);
            }
            return Result.success();
        }
        return Result.ret( "11" ,  "主键不能为空");
    }

    /**
     * 从回收站恢复删除分类
     * @param ids
     * @return
     */
    @RequestMapping("restore")
    public Result restore(@RequestBody Integer[] ids) {
        if(ids != null && ids.length > 1){
            for(Integer id : ids){
                Classify classify = new Classify();
                classify.setId(id);
                classify.setIsDelete(DeleteEnum.NOT_DELETE.getCode());
                classifyService.update(classify);
            }
            return Result.success();
        }
        return Result.ret("11","主键不能为空");
    }

    /**
     * 永久性删除
     * @param ids
     * @return
     */
    @RequestMapping("permanentDelete")
    public Result permanentDelete(@RequestBody Integer[] ids) {

        classifyService.delete(ids);
        return Result.success();
    }

}























