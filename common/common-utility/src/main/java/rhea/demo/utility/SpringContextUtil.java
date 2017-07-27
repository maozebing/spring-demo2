package rhea.demo.utility;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @Creation Date : 2016/12/9 15:06
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtil {
    private static ApplicationContext context;
    private static SpringContextUtil springContextUtil=null;

    public static SpringContextUtil getInstance(){
        if (springContextUtil==null){
            springContextUtil=new SpringContextUtil();
        }
        return springContextUtil;
    }

    /**
     * 获取bean对象
     * @param beanId bean的id
     * @return bean对象
     */
    public static Object getBean(Class beanId){
        if (beanId == null) {
            throw new NullPointerException();
        }
        return context.getBean(beanId);
    }

    public void getContext(){
        context=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
    }
}

