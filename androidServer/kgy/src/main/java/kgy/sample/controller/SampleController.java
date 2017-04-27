package kgy.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kgy.sample.service.SampleService;
//import kgy.sample.vo.EmpVO;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

@Controller
@RequestMapping(value="/sample")
public class SampleController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/openSampleList.do")
	public ModelAndView openSampleList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mav = new ModelAndView();
		log.debug("인터셉트 테스트");
		List<Map<String,Object>> list = sampleService.selectEmpList(commandMap);
		mav.addObject("list",list);
		mav.setViewName("home");
		
		return mav;
	}
	
}
