package com.lx.mapapp.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchMapper {
	List<HashMap<String, Object>> getAttData();
	List<HashMap<String, Object>> getNearstMetro(Map param);
}
