	var myScroll;  
    var pullDownEl, pullDownL;  
    var pullUpEl, pullUpL;  
    var Downcount = 0 ,Upcount = 0;  
    var loadingStep = 0;//加载状态0默认，1显示加载状态，2执行加载数据，只有当为0时才能再次加载，这是防止过快拉动刷新  
    var currentPage = 1;
    var noMoreData = "";
	$(function () {
		
		selectData();
		setTimeout(function() {
			
			var dheight =document.documentElement.clientHeight;
			var theight = $(".top").height();
			$(".botm").height(dheight-theight+"px");
			},200);
			$(window).on("resize",function() {
			var dheight =document.documentElement.clientHeight;
			var theight = $(".top").height();
			$(".botm").height(dheight-theight+"px");
		});
		
		//tab选项查询
		/*$(".header ul li").click(function(){
			var index=$(this).index();
			$(".header ul li").removeClass("tab-color");
			$(this).addClass("tab-color");
		});*/

	});
	
	function selectData(){
		//alert("currentPage:"+currentPage);
		var type = $("#video_type_id").val();
		$.ajax({
			url:"selectDataForPage.do",
			data:{currentPage:currentPage,
				type:type},
			dataType:"json",
			type:"post",
			success:function(data){
				
				var text = "";
				if(data.length>0){
					//text += "<section class='list-box-con clearfix' style='border-top:0;'><ul class='list-box-con-s clearfix' style='border-top:0;'>";
					$.each(data,function(i,obj){
						text += "<li><a onclick=\"showMusicPermission('"+obj.id+"');\"><img src="+obj.music_photo_url+"><em>"+obj.music_name+"</em><span>";
						if(obj.music_type==1)text += "广播录音";
						if(obj.music_type==2)text += "名人课堂";
						//if(obj.music_type==3)text += "专题片";
						text += "<span></a></li>";
					});
					//text += "</ul></section>";
					$("#loadingDataForpage").append(text);
				}else{
					noMoreData = "没有更多数据了...";
					currentPage --;
					//pullUpL.html('没有更多数据了...');
				}
			},
			error:function(e){
				alert("Loading data error:"+e.status);
			}
		})
	}

/**
 * 下拉刷新 （自定义实现此方法）
 * myScroll.refresh(); 数据加载完成后，调用界面更新方法
 */
function pullDownAction () {
	
}
 
/**
 * 滚动翻页 （自定义实现此方法）
 * myScroll.refresh();      // 数据加载完成后，调用界面更新方法
 */
function pullUpAction () {
	//alert("上啦");
	currentPage ++;
    setTimeout(function () {    // <-- Simulate network congestion, remove setTimeout from production!
        
    	selectData();
    	pullUpEl.removeClass('loading');  
        pullUpL.html('上拉显示更多...');  
        pullUpEl['class'] = pullUpEl.attr('class');  
        pullUpEl.attr('class','').hide();  
        myScroll.refresh();  
        loadingStep = 0;  
        //myScroll.refresh();     //数据加载完成后，调用界面更新方法
    }, 1000);
	//myScroll.refresh();
}
/**
 * 初始化iScroll控件
 */

 function loaded() {  
     pullDownEl = $('#pullDown');  
     pullDownL = pullDownEl.find('.pullDownLabel');  
     pullDownEl['class'] = pullDownEl.attr('class');  
     pullDownEl.attr('class','').hide();  
       
     pullUpEl = $('#pullUp');  
     pullUpL = pullUpEl.find('.pullUpLabel');  
     pullUpEl['class'] = pullUpEl.attr('class');  
     pullUpEl.attr('class','').hide();  
       
     myScroll = new IScroll('#wrapper', {
         probeType: 2,//probeType：1对性能没有影响。在滚动事件被触发时，滚动轴是不是忙着做它的东西。probeType：2总执行滚动，除了势头，反弹过程中的事件。这类似于原生的onscroll事件。probeType：3发出的滚动事件与到的像素精度。注意，滚动被迫requestAnimationFrame（即：useTransition：假）。  
         scrollbars: true,//有滚动条  
         mouseWheel: true,//允许滑轮滚动  
         fadeScrollbars: true,//滚动时显示滚动条，默认影藏，并且是淡出淡入效果  
         bounce:true,//边界反弹  
         interactiveScrollbars:true,//滚动条可以拖动  
         shrinkScrollbars:'scale',// 当滚动边界之外的滚动条是由少量的收缩。'clip' or 'scale'.  
         click: true ,// 允许点击事件  
         keyBindings:true,//允许使用按键控制  
         momentum:true// 允许有惯性滑动  
     });  
     //滚动时  
     myScroll.on('scroll', function(){  
         
             pullUpEl.attr('class',pullUpEl['class'])  
             pullUpEl.show();  
             myScroll.refresh();  
             pullUpEl.addClass('flip');
             if(noMoreData != '') pullUpL.html(noMoreData);
             else pullUpL.html('loading...');
             loadingStep = 1;  
         
     });  
     //滚动完毕  
     myScroll.on('scrollEnd',function(){  
         
             pullUpAction();  
       
     });  
   }  
 
//初始化绑定iScroll控件
 document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);  