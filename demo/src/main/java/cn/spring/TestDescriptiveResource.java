package cn.spring;

import org.springframework.core.io.DescriptiveResource;

/**
 * Created by caoqingguang on 2016/4/15.
 */
public class TestDescriptiveResource {
    public static void main(String[] args) {
        org.springframework.core.io.Resource resource = new DescriptiveResource("zhang san");
        System.out.println(resource.toString());
        System.out.println(resource.getDescription());
    }
}
