package com.thinkgem.jeesite.modules.video_m_n.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.video_m_n.dao.MusicTableCountMapper;
import com.thinkgem.jeesite.modules.video_m_n.dao.MusicTableMapper;
import com.thinkgem.jeesite.modules.video_m_n.entity.MusicTable;
import com.thinkgem.jeesite.modules.video_m_n.entity.MusicTableCount;

@Service
@Transactional(readOnly = false)
public class MusicTableService extends BaseService {

	@Autowired
	private MusicTableMapper musicTableMapper;
	
	@Autowired
	private MusicTableCountMapper musicTableCountMapper;
	
	@Transactional(readOnly=true)
	public List<Map<String,Object>> searchMusic(String searchName){
		return musicTableMapper.searchMusic(searchName);
	}
	
	@Transactional(readOnly=true)
	public List<Map<String,Object>> selectMusicBelongTo(){
		return musicTableMapper.selectMusicBelongTo();
	}
	
	@Transactional(readOnly=true)
	public List<Map<String,Object>> selectDataForPage(Map<String,Object> map){
		return musicTableMapper.selectHostMusic(map);
	}
	
	@Transactional(readOnly=true)
	public Map<String,Object> musicDownload(Integer mtcId){
		return musicTableMapper.musicDownload(mtcId);
	}
	
	public Integer selectLikeOrHiteCount(Map<String,Object> map){
		Integer count = musicTableMapper.selectLikeOrHiteCount(map);
		int count2 = count+1;
		map.put("count", count2);
		musicTableMapper.updateLikeOrHiteCount(map);
		return count2;
	}
	
	@Transactional(readOnly=true)
	public Map<String,Object> selectPlayLikeHiteCount(Integer mtcId){
		return musicTableMapper.selectPlayLikeHiteCount(mtcId);
	}
	
	@Transactional(readOnly = true)
	public List<Map<String,Object>> showMusicPermission(Integer id){
		return musicTableMapper.showMusicPermission(id);
	}
	
	@Transactional(readOnly = true)
	public List<Map<String,Object>> selectHostMusic(Map<String,Object> map){
		return musicTableMapper.selectHostMusic(map);
	}
	
	public void addData(){
		File file = new File("G:/KuGouOldName");
		String[] fileName = file.list();
		
		int i = 1;
		int j = 8;
		int k = 1;
		for(String s:fileName){
			MusicTable mt = new MusicTable();
			mt.setMusicName(s);
			if(i % 2 ==0)mt.setMusicBelongto("1");
			else mt.setMusicBelongto("2");
			mt.setMusicContext(s);
			if(j==36)j=8;
			mt.setMusicPhotoUrl("/musicPhotoUrl/"+j+".jpg");
			if(k==8)k=1;
			mt.setMusicType(k+"");
			j ++;
			k++;
			musicTableMapper.insertSelective(mt);
			
			MusicTableCount mtc = new MusicTableCount();
			mtc.setMusicId(mt.getId());
			mtc.setMusicAddress("/musicUrl/"+i+".mp3");
			mtc.setMusicDownAddress("G:/KuGoump3/"+i+".mp3");
			mtc.setMusicHiteCount(0);
			mtc.setMusicLikeCount(0);
			mtc.setMusicPlayCount(0);
			musicTableCountMapper.insertSelective(mtc);
			i++;
		}
	}
}
