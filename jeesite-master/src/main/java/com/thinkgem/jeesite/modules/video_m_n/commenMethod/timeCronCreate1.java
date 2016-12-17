package com.thinkgem.jeesite.modules.video_m_n.commenMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.thinkgem.jeesite.modules.video_m_n.service.VideoTableService;

@Component
public class timeCronCreate1 {

	@Autowired
	private VideoTableService videoTableService;
	
	//@Scheduled(cron="0 0/1 * * * ?")
	public void runM(){
		//videoTableService.insertIntovideo();
	}
}
