package kgy.sample.service;

import java.util.List;
import java.util.Map;

//import kgy.sample.vo.EmpVO;

public interface SampleService {
	
	List<Map<String,Object>> selectEmpList(Map<String,Object>commandMap);
}
