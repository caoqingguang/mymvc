package cn.cqg.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping()
public class TestRunController {
	
	@RequestMapping("testRun")
	@ResponseBody
	public Object testRun(){
		String ok = "this is runningbbccdd";
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
	
	
	@RequestMapping("testVM")
	public String testVM(){
		return "test";
	}
}
