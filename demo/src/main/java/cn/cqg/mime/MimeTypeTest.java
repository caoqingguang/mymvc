package cn.cqg.mime;

import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;

/**
 * Created by caoqingguang on 2016/4/10.
 */
public class MimeTypeTest {
    public static void main(String[] args) {
        MimeType mimeType = MimeTypeUtils.parseMimeType("text/*+json");
        MimeType type=MimeTypeUtils.parseMimeType("text/json;charset=utf-8");
        System.out.println(type);
        System.out.println(type.getType());
        System.out.println(type.getSubtype());
        System.out.println(type.getParameter("charset"));
        System.out.println(mimeType.includes(type));
    }
}
