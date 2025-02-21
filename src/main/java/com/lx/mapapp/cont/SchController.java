package com.lx.mapapp.cont;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lx.mapapp.svc.SchService;

@RestController
public class SchController {
	
	@Autowired
	SchService schService;
	
	@GetMapping("/getBusanAttData") 
	public HashMap<String, Object> getAttData() {
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("res", schService.getAttData());
		
		return resultMap;
	}
	
	@PostMapping("/getNearstMetro")
	public HashMap<String, Object> getNearstMetro(@RequestBody Map param) {
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("res", schService.getNearstMetro(param));
		
		return resultMap;
	}
}
