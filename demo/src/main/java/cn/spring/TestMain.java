package cn.spring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by caoqingguang on 2016/4/15.
 */
public class TestMain {
    public static void main(String[] args) {
        BeanDefinitionRegistry bdr = new DefaultListableBeanFactory();
        System.out.println(bdr.getBeanDefinitionCount());
        XmlBeanDefinitionReader bdReader=new XmlBeanDefinitionReader(bdr);
        BeanDefinitionRegistry bdr2 = bdReader.getRegistry();
        System.out.println(bdr==bdr2);
    }
}
