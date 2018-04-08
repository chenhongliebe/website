package com.frico.website.web.adminManagement;

import com.frico.website.common.Result;
import com.frico.website.dao.system.UroleMapperExt;
import com.frico.website.model.system.Uuser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * User: xrb
 * Date: 2018/3/30
 * Time: 16:35
 * 用shiro进行登录验证
 * 用户登录权限认证管理控制器
 */

@RestController
@RequestMapping("bc")
public class AdminController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private UroleMapperExt uroleMapperExt;

    //跳转到登录表单页面
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login"; //返回login.jsp页面
    }

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("this is frame");
        return "common/frame";
    }


    @RequestMapping("/index")
    public String list(Model model) {
        System.out.println("this is index");
        return "index";
    }


    /**
     * 登录验证
     * @param uuser
     * @return
     */
    @RequestMapping(value = "ajaxLogin", method = RequestMethod.POST)
    public String index(Uuser uuser){
        if(uuser.getMoblie() != null && uuser.getPassword() != null) {
            UsernamePasswordToken token = new UsernamePasswordToken(uuser.getMoblie(), uuser.getPassword(), "login");
            Subject currentUser = SecurityUtils.getSubject();
            logger.info("对用户[" + uuser.getMoblie() + "]进行登录验证..." + "\n" + "验证开始...");
            try{
                currentUser.login(token);
                //验证是否登录成功
                if(currentUser.isAuthenticated()) {

                    logger.info("对用户[" + uuser.getMoblie() + "]登录认证通过" ); //这里后面根据需求可以加认证通过后的一些系统参数的初始化操作
                    System.out.println("对用户[" + uuser.getMoblie() + "]登录认证通过");
                    return "redirect:/";
                } else {
                    token.clear();
                    System.out.println("对用户[" + uuser.getMoblie() + "]登录认证失败,请重新登录");
                    return "redirect:/login";
                }
            } catch ( UnknownAccountException uae ) {

                logger.info("对用户[" + uuser.getMoblie() + "]进行登录认证..." + "\n" + "验证失败-username wasn't in the system");
            } catch ( IncorrectCredentialsException ice ) {

                logger.info("对用户[" + uuser.getMoblie() + "]进行登录认证..." + "\n" + "验证失败-password didn't match");
            } catch ( LockedAccountException lae ) {

                logger.info("对用户[" + uuser.getMoblie() + "]进行登录认证..." + "\n" + "验证失败-account is locked in the system");
            } catch ( AuthenticationException ae ) {

                logger.error( ae.getMessage() );
            }
        }
        return "login";
    }


    /**
     * ajax登录请求接口方式登录
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/ajaxlogin", method = RequestMethod.POST)
    public Map<String, Object> submitLogin(@RequestBody String username, String password, Model model) {

        Map<String, Object> resultMap = new LinkedHashMap <>();

        try{

            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            SecurityUtils.getSubject().login(token);
            resultMap.put("status", "200");
            resultMap.put("message", "登录成功");

        } catch (Exception e) {
            resultMap.put("status", "500");
            resultMap.put("message", e.getMessage());
        }
        return resultMap;
    }


}


