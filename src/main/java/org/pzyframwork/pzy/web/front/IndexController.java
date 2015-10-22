/**
 */
package org.pzyframwork.pzy.web.front;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class IndexController {
	private static final String INDEX = "index";
	private static final String PLAN = "plan";
	private static final String MAJOR = "major";
	private static final String SCHOOL = "school";
	static Logger logger = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping(value="index", method=RequestMethod.GET)
	public String index(Map<String, Object> map) {
		logger.error("fucksdfsdf");
		return INDEX;
	}
	@RequestMapping(value="plan", method=RequestMethod.GET)
	public String plan(Map<String, Object> map) {
		logger.error("fucksdfsdfyou");
		return PLAN;
	}
	@RequestMapping(value="/major", method=RequestMethod.GET)
	public String major(Map<String, Object> map) {
		logger.error("fucksdfsdfyou");
		return MAJOR;
	}
	@RequestMapping(value="/school", method=RequestMethod.GET)
	public String school(Map<String, Object> map) {
		return SCHOOL;
	}
}
