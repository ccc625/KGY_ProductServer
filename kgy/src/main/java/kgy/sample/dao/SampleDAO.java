package kgy.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;
//import kgy.sample.vo.EmpVO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{
	
	private static final String namespace = "kgy.sample";
	
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectEmpList(Map<String,Object> map){
		return (List<Map<String,Object>>)selectList(namespace+".selectEmpList", map);
	}
}
