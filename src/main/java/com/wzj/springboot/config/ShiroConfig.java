package com.wzj.springboot.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.wzj.springboot.web.shiro.ShiroRealm;

@Configuration
public class ShiroConfig {

    //注入自定义的realm，告诉shiro如何获取用户信息来做登录或权限控制
    @Bean
    public Realm realm() {
        return new ShiroRealm();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        /**
         * setUsePrefix(false)用于解决一个奇怪的bug。在引入spring aop的情况下。
         * 在@Controller注解的类的方法中加入@RequiresRole注解，会导致该方法无法映射请求，导致返回404。
         * 加入这项配置能解决这个bug
         */
        creator.setUsePrefix(true);
        return creator;
    }

    /**
     * 这里统一做鉴权，即判断哪些请求路径需要用户登录，哪些请求路径不需要用户登录。
     * 这里只做鉴权，不做权限控制，因为权限用注解来做。
     * @return
     */

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chain = new DefaultShiroFilterChainDefinition();
        //哪些请求可以匿名访问
        chain.addPathDefinition("/static/**", "anon");
        chain.addPathDefinition("/admin/login", "anon");
        chain.addPathDefinition("/admin/jumpLogin", "anon");
        // chain.addPathDefinition("/page/403", "anon");
        // chain.addPathDefinition("/t5/hello", "anon");
        // chain.addPathDefinition("/t5/guest", "anon");
        //除了以上的请求外，其它请求都需要登录
        chain.addPathDefinition("/**", "authc");
        return chain;
    }

    @Bean
    public SessionsSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm());
        return securityManager;
    }


    /**
     * 自定义sessionDao
     * @return
     */
//    @Bean
//    public SessionRedisDao sessionDAO(){
//        SessionRedisDao dao = new SessionRedisDao();
//        return dao;
//    }

    /**
     * 配置shiro标签 使用shiro权限注解需要去application.yml 设置userNativeSessionManager为true 不然注解失效
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

}
