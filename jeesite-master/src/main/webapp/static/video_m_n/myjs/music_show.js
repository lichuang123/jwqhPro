	$(function(){
		var mtcId = $("#music_table_count_id").val();
		selectPlayLikeHiteCount(mtcId);
	})

	function musicDownload(){
		var mtcId = $("#music_table_count_id").val();
		window.location.href = "musicDownload.do?mtcId="+mtcId;
	}

	function addLikeOrHiteCount(type){
		$.ajax({
			url:"addLikeOrHiteCount.do",
			data:{mtcId:$("#music_table_count_id").val(),
				type:type},
			dataType:"json",
			type:"post",
			success:function(data){
				if(type==1){
					$("#hiteId")[0].innerHTML = "";
					$("#hiteId")[0].innerHTML = data;
				}
				if(type==2){
					$("#likeId")[0].innerHTML = "";
					$("#likeId")[0].innerHTML = data;
				}
				if(type==3){
					$("#playCountId")[0].innerHTML = "";
					$("#playCountId")[0].innerHTML = "播放"+data;
				}
			},
			error:function(e){
				alert("click like or hite error:"+e.status);
			}
		})
	}

	function playOrStop(){
		var audio = document.getElementById("audio_id");
		  if(audio.paused){                 
		      audio.play();
		      $("#playId")[0].innerHTML = "暂停";
		  }else{
			  audio.pause();
			  $("#playId")[0].innerHTML = "播放";
		  }
	}

	function chooseOrder(url,id,mtcId){
		//addLikeOrHiteCount(3);
		$("#music_table_count_id").val(mtcId);
		$("#audio_id")[0].src=url;
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa+1;i++){
			$("#chooseOrder"+i).removeClass("on");
		}
		$("#chooseOrder"+id).addClass("on");
		$("#playId")[0].innerHTML = "暂停";
		selectPlayLikeHiteCount(mtcId);
		
	}
	
	function selectPlayLikeHiteCount(mtcId){
		$.ajax({
			url:"selectPlayLikeHiteCount.do",
			data:{mtcId:mtcId},
			dataType:"json",
			type:"post",
			success:function(data){
				var music_play_count = data.music_play_count;
				var music_like_count = data.music_like_count;
				var music_hite_count = data.music_hite_count;
				$("#playCountId")[0].innerHTML = "";
				$("#playCountId")[0].innerHTML = "播放"+music_play_count;
				$("#likeId")[0].innerHTML = "";
				$("#likeId")[0].innerHTML = music_like_count;
				$("#hiteId")[0].innerHTML = "";
				$("#hiteId")[0].innerHTML = music_hite_count;
			},
			error:function(e){
				alert("select play like hite error:"+e.status);
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
	
	function bf(){
		 var audio = document.getElementById('music1'); 
		 if(audio!==null){             
		    //检测播放是否已暂停.audio.paused 在播放器播放时返回false.
		     alert(audio.paused);
		  if(audio.paused)                     {                 
		      audio.play();//audio.play();// 这个就是播放  
		  }else{
		   audio.pause();// 这个就是暂停
		  }
		 } 
		}