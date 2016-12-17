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

@Controller
@RequestMapping(value = "${adminPath}/video_m_n/musicTableController")
public class MusicTableController extends BaseController {

	Log log = LogFactory.getLog(MusicTableController.class);
	
	@Autowired
	private MusicTableService musicTableService;
	
	@RequestMapping(value="showMusicPermission",method = RequestMethod.GET)
	public ModelAndView showMusicPermission(@RequestParam("id")Integer id){
		ModelAndView mv = new ModelAndView();
		List<Map<String,Object>> list = musicTableService.showMusicPermission(id);
		log.debug("=====================showMusicPermission==============="+list);
		mv.addObject("list", list);
		mv.addObject("list_0", list.get(0));
		if(list.size()>14) mv.addObject("more",14);
		mv.setViewName("modules/video_m_n/music_show");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="selectPlayLikeHiteCount",method=RequestMethod.POST)
	public Map<String,Object> selectPlayLikeHiteCount(@RequestParam("mtcId")Integer mtcId){
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("mtcId", mtcId);
		m.put("play", "music_play_count");
		musicTableService.selectLikeOrHiteCount(m);
		
		Map<String,Object> map = musicTableService.selectPlayLikeHiteCount(mtcId);
		log.debug("=====selectPlayLikeHiteCount============"+map);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="addLikeOrHiteCount",method=RequestMethod.POST)
	public int addLikeOrHiteCount(@RequestParam("mtcId")Integer mtcId,
			@RequestParam("type")Integer type){
		int result = 0;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mtcId", mtcId);
		if(type == 1){//不喜欢
			map.put("hite", "music_hite_count");
			result = musicTableService.selectLikeOrHiteCount(map);
		}
		if(type == 2){
			//喜欢
			map.put("like", "music_like_count");
			result = musicTableService.selectLikeOrHiteCount(map);
		}
		/*if(type == 3){//播放次数
			map.put("play", "music_play_count");
			result = musicTableService.selectLikeOrHiteCount(map);
		}*/
		return result;
	}
	
	@RequestMapping(value="musicDownload",method=RequestMethod.GET)
	public void musicDownload(@RequestParam("mtcId")Integer mtcId,
			HttpServletResponse response,
			HttpServletRequest request) throws IOException{
		Map<String,Object> map = musicTableService.musicDownload(mtcId);
		fileUpload.fileDownload((String)map.get("music_down_address"), response, (String)map.get("music_name"),request);
	}
	
	@RequestMapping(value="goMusicMorePage",method=RequestMethod.GET)
	public ModelAndView goMusicMorePage(HttpServletRequest request){
		String type = request.getParameter("type");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("type", type);
		mv.setViewName("modules/video_m_n/music_more_list");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="selectDataForPage",method=RequestMethod.POST)
	public List<Map<String,Object>> selectDataForPage(@RequestParam("currentPage")Integer currentPage,HttpServletRequest request){
		String type = request.getParameter("type");
		Map<String,Object> map = new HashMap<String,Object>();
		int pageSize = 10;
		int start = currentPage*pageSize - pageSize;
		if(null != type && !"".equals(type))map.put("belongto", type);
		map.put("start", start);
		map.put("pageSize", pageSize);
		List<Map<String,Object>> list = musicTableService.selectDataForPage(map);
		log.debug("====================selectDataForPage==================="+list);
		return list;
	}
	
	
	@RequestMapping(value="goMusicListPage",method=RequestMethod.GET)
	public ModelAndView goMusicListPage(){
		ModelAndView mv = new ModelAndView();
		Map<String,Object> map1 = new HashMap<String,Object>();
		Map<String,Object> map2 = new HashMap<String,Object>();
		map1.put("belongto", "1");
		map1.put("start", 0);
		map1.put("pageSize", 6);
		map2.put("belongto", "2");
		map2.put("start", 0);
		map2.put("pageSize", 6);
		List<Map<String,Object>> list = musicTableService.selectMusicBelongTo();
		List<Map<String,Object>> list1 = musicTableService.selectHostMusic(map1);
		List<Map<String,Object>> list2 = musicTableService.selectHostMusic(map2);
		mv.addObject("list", list);
		mv.addObject("list1", list1);
		mv.addObject("list2", list2);
		log.debug("====================goMusicListPage==================="+list);
		log.debug("====================goMusicListPage==================="+list1);
		log.debug("====================goMusicListPage==================="+list2);
		mv.setViewName("modules/video_m_n/music_list");
		return mv;
	}
	
	@RequestMapping(value="goSearchMusicPage",method=RequestMethod.GET)
	public ModelAndView goSearchMusicPage(){
		ModelAndView mv = new ModelAndView();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("belongto", "7");
		map.put("start", 0);
		map.put("pageSize", 10);
		List<Map<String,Object>> list = musicTableService.selectHostMusic(map);
		log.debug("====================goSearchMusicPage==================="+list);
		mv.addObject("list", list);
		mv.setViewName("modules/video_m_n/music_search");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="searchMusic",method=RequestMethod.POST)
	public List<Map<String,Object>> searchMusic(@RequestParam("searchName")String searchName){
		List<Map<String,Object>> list = musicTableService.searchMusic(searchName);
		log.debug("==========================searchMusic=============="+list);
		return list;
	}
}