package com.thinkgem.jeesite.modules.video_m_n.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.video_m_n.commenMethod.fileUpload;
import com.thinkgem.jeesite.modules.video_m_n.service.MusicTableService;
import com.thinkgem.jeesite.modules.video_m_n.service.VideoTableService;

@Controller
@RequestMapping(value = "${adminPath}/video_m_n/videoTableController/")
public class VideoTableController extends BaseController {

	Log log = LogFactory.getLog(VideoTableController.class);
	
	@Autowired
	private VideoTableService videoTableService;
	
	@Autowired
	private MusicTableService musicTableService;
	
	@RequestMapping(value="selectHostVideo",method=RequestMethod.GET)
	public ModelAndView selectHostVideo(){
		ModelAndView mv = new ModelAndView();
		
		Map<String,Object> v_map = new HashMap<String,Object>();
		v_map.put("belongto", "1");
		v_map.put("start", 0);
		v_map.put("pageSize", 4);
		List<Map<String,Object>> v_list = videoTableService.selectHostVideo(v_map);
		
		Map<String,Object> m_map = new HashMap<String,Object>();
		m_map.put("belongto", "7");
		m_map.put("start", 0);
		m_map.put("pageSize", 4);
		List<Map<String,Object>> m_list = musicTableService.selectHostMusic(m_map);
		
		log.debug("=========selectHostVideo============="+v_list+"========"+m_list);
		mv.addObject("v_list", v_list);
		mv.addObject("m_list", m_list);
		mv.setViewName("modules/video_m_n/index");
		return mv;

	}
	
	@RequestMapping(value="showVideoPermission",method=RequestMethod.GET)
	public ModelAndView showVideoPermission(@RequestParam("id")Integer id){
		ModelAndView mv = new ModelAndView();
		List<Map<String,Object>> list = videoTableService.showPermissionVideo(id);
		log.debug("==================sohwVideoPermission==============="+list);
		mv.addObject("list", list);
		mv.addObject("list_0", list.get(0));
		if(list.size()>14) mv.addObject("more",14);
		mv.setViewName("modules/video_m_n/page2");
		return mv;
	}
	
	@RequestMapping(value="fileDownload",method=RequestMethod.GET)
	public void fileDownload(@RequestParam("vtcId")Integer id,HttpServletResponse response,HttpServletRequest request) throws IOException{
		Map<String,Object> map = videoTableService.selectDownAddressById(id);
		String video_name = (String) map.get("video_name");
		String video_down_address = (String) map.get("video_down_address");
		log.debug("=======进入video的下载方法：fileDownload==================");
		fileUpload.fileDownload(video_down_address,response,video_name,request);
	}
	
	@ResponseBody
	@RequestMapping(value="addVideoLikeCount",method=RequestMethod.POST)
	public Integer addVideoLikeCount(@RequestParam("vtcId")Integer id){
		Integer count = videoTableService.addVideoLikeCount(id);
		log.debug("===========addVideoLikeCount==========="+count);
		return count;
	}
	
	@ResponseBody
	@RequestMapping(value="addVideoPlayCount",method=RequestMethod.POST)
	public Integer addVideoPlayCount(@RequestParam("vtcId")Integer vtcId){
		Integer count = videoTableService.addVideoPlayCount(vtcId);
		log.debug("===============addVideoPlayCount=============="+count);
		return count;
	}
	
	@ResponseBody
	@RequestMapping(value="addVideoHiteCount",method=RequestMethod.POST)
	public Integer addVideoHiteCount(@RequestParam("vtcId")Integer id){
		Integer count = videoTableService.addVideoHiteCount(id);
		log.debug("==================addVideoHiteCount=================="+count);
		return count;
	}
	
	@ResponseBody
	@RequestMapping(value="selectThreeCount",method=RequestMethod.POST)
	public Map<String,Object> selectThreeCount(@RequestParam("vtcId")Integer vtcId){
		Map<String,Object> map = videoTableService.selectThreeCount(vtcId);
		log.debug("===========selectThreeCount============"+map);
		return map;
	}
	
	@RequestMapping(value="selectThreeTypeVideoHost",method=RequestMethod.GET)
	public ModelAndView selectThreeTypeVideoHost(){
		Map<String,Object> map = videoTableService.selectThreeTypeVideoHost();
		log.debug("==============selectThreeTypeVideoHost==================="+map);
		ModelAndView mv = new ModelAndView();
		mv.addObject("map", map);
		mv.setViewName("modules/video_m_n/video_list");
		return mv;
	}
	
	@RequestMapping(value="gotoSearchPage",method=RequestMethod.GET)
	public ModelAndView gotoSearchPage(){
		ModelAndView mv = new ModelAndView();
		Map<String,Object> v_map = new HashMap<String,Object>();
		v_map.put("belongto", "1");
		v_map.put("start", 0);
		v_map.put("pageSize", 10);
		List<Map<String,Object>> v_list = videoTableService.selectHostVideo(v_map);
		log.debug("=========gotoSearchPage============"+v_list);
		mv.addObject("v_list", v_list);
		mv.setViewName("modules/video_m_n/video_search");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="searchVideo",method=RequestMethod.POST)
	public List<Map<String,Object>> searchVideo(@RequestParam("searchName")String searchName){
		List<Map<String,Object>> list = videoTableService.searchVideo(searchName);
		log.debug("================searchVideo=============="+list);
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value="showMore",method=RequestMethod.POST)
	public List<Map<String,Object>> showMore(@RequestParam("id")Integer id){
		List<Map<String,Object>> list = videoTableService.showPermissionVideo(id);
		log.debug("=====showMore========"+list);
		return list;
	}
	
	@RequestMapping(value="selectHostVideoForPage",method=RequestMethod.GET)
	public ModelAndView selectHostVideoForPage(HttpServletRequest request){

		String type = request.getParameter("type");
		ModelAndView mv = new ModelAndView();
		mv.addObject("type", type);
		mv.setViewName("modules/video_m_n/video_more_list");
		return mv;
	}
	
	//加载所有的
	@ResponseBody
	@RequestMapping(value="selectDataForpage",method=RequestMethod.POST)
	public List<Map<String,Object>> selectDataForpage(@RequestParam("currentPage")Integer currentPage,HttpServletRequest request){
		String type = request.getParameter("type");
		Map<String,Object> map = new HashMap<String,Object>();
		int pageSize = 10;
		int start = currentPage*10 - pageSize;
		map.put("start", start);
		map.put("pageSize", pageSize);
		if(null != type && !"".equals(type))map.put("videoType", type);
		List<Map<String,Object>> list = videoTableService.selectDataForpage(map);
		log.debug("===============selectDataForpage================="+list);
		return list;
	}
	
	
}
