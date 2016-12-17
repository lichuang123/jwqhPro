	$(function(){
		var vtcId = $("#video_like_hite_vtcId").val();
		videoPlayChange(vtcId);
	})
	function play(){
		var status = document.getElementById('myVideo');
		if($("#myVideo")[0].currentTime == 0){
			var vtcId = $("#video_like_hite_vtcId").val();
			videoPlayChange(vtcId);
		}
		if(status.paused){
			if($("#currentTime").val()!=""){
				$("#myVideo")[0].currentTime = $("#currentTime").val();
			}
			document.getElementById('myVideo').play();
			$("#playOrpused")[0].innerHTML = "";
			$("#playOrpused")[0].innerHTML = "暂停";
			
		}else{
			$("#currentTime").val(status.currentTime);
			$("#myVideo")[0].pause();
			$("#playOrpused")[0].innerHTML = "";
			$("#playOrpused")[0].innerHTML = "播放";
		}
	}
	function chooseOrder(url,order,vtcId){
		$("#video_like_hite_vtcId").val(vtcId);
		$("#sourceId")[0].src = url;
		$("#myVideo")[0].src = url;
		$("#myVideo")[0].play();
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa+1;i++){
			$("#chooseOrder"+i).removeClass("on");
		}
		$("#chooseOrder"+order).addClass("on");
		$("#playOrpused")[0].innerHTML = "";
		$("#playOrpused")[0].innerHTML = "暂停";
		selectThreeCount(vtcId);
		//videoHiteChange();
		//videoLikeChange();
		//$("#chooseOrder"+id).removeClass("on");
	}
	
	function videoPlayChange(vtcId){
		$.ajax({
			url:"addVideoPlayCount.do",
			data:{vtcId:vtcId},
			dataType:"JSON",
			type:"POST",
			success:function(data){
				$("#play_span")[0].innerHTML = "";
				$("#play_span")[0].innerHTML = "观看"+data+"次";
			},
			error:function(e){
				alert("add video play count error:"+e.status);
			}
		})
	}
	
	function downLoad(){
		var vtcId = $("#video_like_hite_vtcId").val();
		window.location.href = "fileDownload.do?vtcId="+vtcId;
	}
	
	function videoHiteChange(){
		$.ajax({
			url:"addVideoHiteCount.do",
			data:{vtcId:$("#video_like_hite_vtcId").val()},
			dataType:"JSON",
			type:"POST",
			success:function(data){
				$("#videoHiteId")[0].innerHTML = "";
				$("#videoHiteId")[0].innerHTML = data;
			},
			error:function(e){
				alert("add video hite error："+e.status);
			}
		});
	}
	
	function videoLikeChange(){
		$.ajax({
			url:"addVideoLikeCount.do",
			data:{vtcId:$("#video_like_hite_vtcId").val()},
			dataType:"JSON",
			type:"POST",
			success:function(data){
				$("#videoLikeId")[0].innerHTML = "";
				$("#videoLikeId")[0].innerHTML = data;
			},
			error:function(e){
				alert("add video like error："+e.status);
			}
		});
	}
	
	function selectThreeCount(vtcId){
		$.ajax({
			url:"selectThreeCount.do",
			data:{vtcId:vtcId},
			dataType:"JSON",
			type:"POST",
			success:function(data){
				$("#play_span")[0].innerHTML="";
				$("#play_span")[0].innerHTML="观看"+data.video_play_count+"次";
				$("#videoHiteId")[0].innerHTML="";
				$("#videoHiteId")[0].innerHTML=data.video_hite_count;
				$("#videoLikeId")[0].innerHTML="";
				$("#videoLikeId")[0].innerHTML=data.video_like_count;
			},
			error:function(e){
				alert("select play like hite error："+e.status);
			}
		})
	}
	
	function removeHdclass(){
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa;i++){
			$("#chooseOrder"+i)[0].style.display = "inline-block";
		}
		$("#showMore")[0].style.display = "none";
	}
	
	function showMore(){
		$.ajax({
			url:"showMore.do",
			data:{id:$("#video_id").val()},
			dataType:"json",
			type:"post",
			success:function(data){
				var text = "";
				$.each(data,function(i,obj){
					/*<a id="chooseOrder${video.video_order }" onclick="chooseOrder('${video.video_address}','${video.video_order }','${video.vtcId }')" <c:if test="${video.video_order==1 }"> class="on"</c:if>>${video.video_order }</a>*/
					text += "<a id='chooseOrder'"+obj.video_order+" onclick=\"chooseOrder('"+obj.video_address+"','"+obj.video_order+"','"+obj.vtcId+"');\">"+obj.video_order+"</a>";
				});
				$("#showMore").addClass("hdclass");
				$("#chooseOrderF")[0].innerHTML = text;
			},
			error:function(e){
				alert("show more list error:"+e.status);
			}
		})
	}
	/*$(function(){
		myVideo.get(0).play();//动态播放、暂停视频【一定要有.get(0)】
		myVideo.get(0).pause();
		backAudio_btn.on('click',function(){
	        if (!backAudio.paused) {
	            backAudio.get(0).pause();
	            backAudio.paused = true;
	        }else{
	            backAudio.get(0).play();
	            backAudio.paused = false;
	        }      
	    });
	})*/