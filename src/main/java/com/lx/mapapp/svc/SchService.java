package com.lx.mapapp.svc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lx.mapapp.repo.SchMapper;

@Service
public class SchService {

	@Autowired
	SchMapper schMapper;
	
	public List<HashMap<String, Object>> getAttData() {
		return schMapper.getAttData();
	}
	
	public List<HashMap<String, Object>> getNearstMetro(Map param) {
		return schMapper.getNearstMetro(param);
	}
}
