package kgy.sample.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.sample.dao.SampleDAO;
import kgy.sample.service.SampleService;
//import kgy.sample.vo.EmpVO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{

	@Resource(name="sampleDAO")
	SampleDAO sampleDao;
	
	@Override
	public List<Map<String,Object>> selectEmpList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return sampleDao.selectEmpList(commandMap);
	}
	
	
}
