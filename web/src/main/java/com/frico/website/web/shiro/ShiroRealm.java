package com.frico.website.web.shiro;

import com.frico.website.dao.system.UpermissionMapperExt;
import com.frico.website.dao.system.UroleMapperExt;
import com.frico.website.dao.system.UuserMapperExt;
import com.frico.website.model.system.Upermission;
import com.frico.website.model.system.Urole;
import com.frico.website.model.system.Uuser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/29
 * Time: 14:04
 * 获取用户的角色和权限信息.
 */
public class ShiroRealm extends AuthorizingRealm{

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    //这里一般都是调用Service层实现   测试先调Dao层实现
    @Autowired
    private UuserMapperExt uuserMapperExt;

    @Autowired
    private UroleMapperExt uroleMapperExt;

    @Autowired
    private UpermissionMapperExt upermissionMapperExt;


    /**
     * 进行登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.info("验证当前Subject时获取的token为:" + token.toString());

        //检查是否有此用户
        Uuser hasUser = uuserMapperExt.findByName(token.getUsername());

        //判断用户是否真的存在,如果存在继续进行
        if(hasUser != null) {
            //用户存在,将此用户存放到登录认证的info中,不需要自己做密码校验,由shiro进行
            List<Urole> rlist = uroleMapperExt.findRoleUid(hasUser.getId()); //获取用户角色

            List<Upermission> plist = upermissionMapperExt.findPermissionByUid(hasUser.getId());//获取用户的权限

            List<String> roleStrList = new ArrayList <String>(); //用户的角色集合

            List<String> perminsStrList = new ArrayList <String>(); //用户的权限集合

            for(Urole role : rlist) {
                roleStrList.add(role.getName());
            }

            for(Upermission upermission : plist) {
                perminsStrList.add(upermission.getName());
            }

            hasUser.setRoleStrlist(roleStrList);
            hasUser.setPerminsStrlist(perminsStrList);

            return new SimpleAuthenticationInfo(hasUser, hasUser.getPassword(), getName());
        }


        return null;
    }


    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        logger.info("***********执行shiro权限认证**************");
        //获取当前登录输入的用户名，等价于(String) principalCollection.fromRealm(getName()).iterator().next();
        // String loginName = (String) super.getAvailablePrincipal(principalCollection);
        Uuser user = (Uuser) principalCollection.getPrimaryPrincipal();

        //到数据库中去查是否有这个对象
        //这个在后期工作量大了的时候要加缓存,暂时不做,由shiro时间间隔搞
        if( user != null ) {
            //权限信息对象info,用来存放查出的用户的所有的角色(role)和权限(permission)
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //用户的角色集合
            info.addRoles(user.getRoleStrlist());
            //用户的权限集合
            info.addStringPermissions(user.getPerminsStrlist());

            return info;
        }

        //这里返回值为空,就会导致任何用户访问被拦截的请求时,都会跳转到unauthorizedUrl指定的地址
        return null;
    }
}





































