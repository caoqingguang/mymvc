package cn.cqg.ac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoqingguang on 2016/4/9.
 */
public class AcTest {

    @Autowired
    public MyObj myObj;

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
        System.out.println(ac);
        AcTest act=new AcTest();
        ac.getAutowireCapableBeanFactory().autowireBeanProperties(act, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE,false);
        AcTest bean = ac.getBean(AcTest.class);
        System.out.println(bean);
        System.out.println(bean.myObj);
        ac.getAutowireCapableBeanFactory().createBean(AcTest.class).myObj.print();

    }
}
