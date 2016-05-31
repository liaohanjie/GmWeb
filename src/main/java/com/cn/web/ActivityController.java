package com.cn.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 活动管理
 * @author admin
 *
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

	
	@RequestMapping("/list")
	@ResponseBody
	public Map<Object, Object> getContentCatList(@RequestParam(value="id", defaultValue="0")Long id) {
		Map<Object, Object> map = new HashMap<>();
		map.put(1, "list");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/create")
	public List<Player> createContentCategory() {
		List<Player> list = new ArrayList<>();
		list.add(new Player());
		return list;
	}
}
