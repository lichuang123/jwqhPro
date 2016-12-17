	$(function(){
		$('#music_search_id').bind('input propertychange', function() { 
		 //进行相关操作 
			if($("#music_search_id").val()==''){
				$("#searchOrback").val(1);
				$("#confirmId")[0].innerHTML = "取消";
			}else{
				$("#searchOrback").val(2);
				$("#confirmId")[0].innerHTML = "搜索";
			}
			
		});
		
		$('#searchName').bind('input propertychange', function() { 
		 //进行相关操作 
			if($("#searchName").val()==''){
				$("#searchOrback").val(1);
				$("#confirmId")[0].innerHTML = "取消";
			}else{
				$("#searchOrback").val(2);
				$("#confirmId")[0].innerHTML = "搜索";
			}
		});
	})

	function searchMusic(){
		var searchOrback = $("#searchOrback").val();
		if(searchOrback == 1){
			window.location.href = "goMusicListPage.do";
		}
		if(searchOrback == 2){
			var searchName = $("#music_search_id").val();
			if(searchName != "" ){
				$.ajax({
					url:"searchMusic.do",
					data:{searchName:searchName},
					dataType:"JSON",
					type:"POST",
					success:function(data){
						var text = "";
						if(data.length>0){
							$.each(data,function(i,obj){
								text += "<a onclick=\"showMusicPermission("+obj.id+");\">"+obj.music_name+"</a>";
							});
						}else{
							text += "<a color='red'>没有关于'"+searchName+"'的结果</a>";
						}
						$("#music_search-list-con")[0].innerHTML = "";
						$("#music_search-list-con")[0].innerHTML += text; 
					},
					error:function(e){
						alert("search music error:"+e.status);
					}
				})
			}
		}
		
		
	}

	function showMusicPermission(id){
		window.location.href = "../musicTableController/showMusicPermission.do?id="+id;
	}

	function showVideoPermission(id){
		window.location.href = "showVideoPermission.do?id="+id;
	}
	
	//video_search.jsp start................
	function searchVideo(){
		var searchOrback = $("#searchOrback").val();
		if(searchOrback==1){
			window.location.href = "selectThreeTypeVideoHost.do";
		}
		if(searchOrback==2){
			var searchName = $("#searchName").val();
			if(searchName != "" ){
				$.ajax({
					url:"searchVideo.do",
					data:{searchName:searchName},
					dataType:"JSON",
					type:"POST",
					success:function(data){
						var text = "";
						if(data.length>0){
							$.each(data,function(i,obj){
								text += "<a onclick=\"showVideoPermission("+obj.id+");\">"+obj.video_name+"</a>";
							});
						}else{
							text += "<a color='red'>没有关于'"+searchName+"'的结果</a>";
						}
						$("#search-list-con")[0].innerHTML = "";
						$("#search-list-con")[0].innerHTML += text; 
					},
					error:function(e){
						alert("search video error:"+e.status);
					}
				})
			}
		}
		
		
	}
	//video_search.jsp end..................