package cn.cqg.controller;

import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping()
public class TestRunController {
	
	@RequestMapping("testRun")
	@ResponseBody
	public Object testRun(){
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		String ok = "this is runningbbccdd"+sdf.format(new Date());
		return ok;
	}
	
	@SuppressWarnings("serial")
	@RequestMapping("testJson")
	@ResponseBody
	public Object testJson(){
		
		return new HashMap<String,String>(){{
				put("keyaaa","valueaaa");
				put("keybbb","valuebbb");
				
			}};
	}
	
	
	@RequestMapping("aaa/testVM")
	public Object testVM(){
		return "/test.jsp";
	}

	@RequestMapping("testp")
	@ResponseBody
	public Object testp(@RequestParam("username") String username, @RequestParam("age") Integer age){
		Map<String, Object> map = new HashMap<>();
		map.put("status", "ok");
		map.put("username", username);
		map.put("age", age);
		return map;
	}
}
