package rhea.demo.initialization;

import rhea.demo.utility.SpringContextUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2016/12/20 10:30
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class ContextLoader implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SpringContextUtil.getInstance().getContext();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
