package com.frico.website.web.systemManagement;

import com.frico.website.common.Enum.DeleteEnum;
import com.frico.website.common.Result;
import com.frico.website.model.system.Uuser;
import com.frico.website.service.systemManagement.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/30
 * Time: 14:50
 * 后台用户(小编)
 */

@RestController
@RequestMapping("bc/user")
public class UserController {

    @Autowired
    private UuserService uuserService;


    /**
     * 添加用户
     * @param uuser
     * @return
     */
    @RequestMapping("insert")
    public Result insert(@RequestBody Uuser uuser) {
        uuserService.insert(uuser);
        return Result.success();
    }

    /**
     * 修改后台用户
     * @param uuser
     * @return
     */
    @RequestMapping("update")
    public Result update(@RequestBody Uuser uuser) {
        uuserService.insert(uuser);
        return Result.success();
    }

    /**
     * 查询全部的小编
     * @return
     */
    @RequestMapping("findAll")
    public Result<List<Uuser>> findAll(@RequestBody Uuser uuser) {

        List<Uuser> list = uuserService.findAll(uuser);

        return Result.success(list);
    }

    /**
     * 加入回收站,逻辑删除
     * @param ids
     * @return
     */
    @RequestMapping("delete")
    public Result delete(@RequestBody Integer[] ids) {
        if(ids != null && ids.length > 1) {
            for(Integer id : ids) {
                Uuser uuser = new Uuser();
                uuser.setId(id);
                uuser.setIsDelete(DeleteEnum.DELETED.getCode());
                uuserService.update(uuser);
            }
            return Result.success();
        }
        return Result.ret("11", "主键不能为空");
    }


    @RequestMapping("restore")
    public Result restore(@RequestBody Integer[] ids) {
        if(ids != null && ids.length > 1) {
            for(Integer id : ids) {
                Uuser uuser = new Uuser();
                uuser.setId(id);
                uuser.setIsDelete(DeleteEnum.NOT_DELETE.getCode());
                uuserService.update(uuser);
            }
            return Result.success();
        }
        return Result.ret("11", "主键不能为空");
    }


    /**
     * 永久性删除
     * @param ids
     * @return
     */
    @RequestMapping("permanentDelete")
    public Result permanentDelete(@RequestBody Integer[] ids) {

        uuserService.delete(ids);
        return Result.success();
    }
}
