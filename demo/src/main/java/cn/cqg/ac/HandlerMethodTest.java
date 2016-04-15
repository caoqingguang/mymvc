package cn.cqg.ac;

import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by caoqingguang on 2016/4/12.
 */
public class HandlerMethodTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HandlerMethodTest handlerMethodTest = new HandlerMethodTest();
        Method[] ms = handlerMethodTest.getClass().getDeclaredMethods();
        Map<String,HandlerMethod> dic=new HashMap<>();
        for(Method m:ms){
            if(m.isAnnotationPresent(MyAn.class)){
                MyAn an=m.getAnnotation(MyAn.class);
                String url=an.url();
                HandlerMethod hm=new HandlerMethod(handlerMethodTest,m);
                dic.put(url,hm);
            }
        }
        HandlerMethod hm=dic.get("/aaa");
//        Object returnValue=hm.getMethod().invoke(hm.getBean(),"ssstt");
//        DefaultParameterNameDiscoverer pnd = new DefaultParameterNameDiscoverer();
//        MethodParameter mp=hm.getMethodParameters()[0];
//        mp.initParameterNameDiscovery(pnd);
//        System.out.println(hm.isVoid());
        print(hm.getMethodParameters()[0]);




    }

    public static void print(MethodParameter mp){
        System.out.println("===============");
        System.out.println("method:"+mp.getMethod());
        System.out.println("index:"+mp.getParameterIndex());
        System.out.println("pname:"+mp.getParameterName());
        System.out.println("ptype:"+mp.getParameterType());
        System.out.println("has annotation:"+mp.getMethodAnnotations().length);
        ParamAn pa = mp.getParameterAnnotation(ParamAn.class);
        System.out.println(pa.name());
        System.out.println("==================");
    }


    @MyAn(url="/aaa")
    public String printtest(@ParamAn(name="userName") String username){
        System.out.println(username);
        return 15+username;
    }


}
