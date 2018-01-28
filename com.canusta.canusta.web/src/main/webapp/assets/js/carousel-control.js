var vmCounter = 1;
var activeVmList = [{name: "vm1", position: 1}];

function appendToCarouselAndMakeActive(data, currentVm = {name: "", position: 0}, destroyCurrent = false){
	vmCounter++;
	
	var cloneVmList = activeVmList.slice(0);
	for (var i = 0; i < cloneVmList.length; i++) {	
		var destroyThis = false;
		if(cloneVmList[i].position > currentVm.position
				|| (destroyCurrent && cloneVmList[i].position == currentVm.position)){
			destroyThis = true;
		}
		
		if(destroyThis){
			var itemId = "#" + cloneVmList[i].name;
			
			if(itemId == "#vm2")
				debugger;
			
			$(itemId).remove();
			activeVmList.splice(i, 1);
		}
	}
	
	activeVmList.push({name: "vm" + vmCounter, position: vmCounter});
	
	$("#carousel-inner").append('<div class="carousel-item" id=vm' + vmCounter +'>' + data + '</div>');
	$(".carousel-inner .carousel-item:not(last)").removeClass("active");
	$(".carousel-inner .carousel-item:last").addClass("active");
	$('.carousel-item.active').addClass('animated zoomOutDown');
	
	$('#dashboardCarousel').children('.carousel-control').removeClass("hide");
	
	if($('.carousel-inner .carousel-item:first').hasClass('active')) {
		$('#dashboardCarousel').children('.left.carousel-control').addClass("hide");
  	}
	
	if($('.carousel-inner .carousel-item:last').hasClass('active')) {
  		$('#dashboardCarousel').children('.right.carousel-control').addClass("hide");
  	}
}

function backToPreviousPage(currentVm = {name: "", position: 0}){
	var cloneVmList = activeVmList.slice(0);
	for (var i = 0; i < cloneVmList.length; i++) {	
		var destroyThis = false;
		if(cloneVmList[i].position >= currentVm.position){
			destroyThis = true;
		}
		
		if(destroyThis){
			var itemId = "#" + cloneVmList[i].name;
			
			$(itemId).remove();
			activeVmList.splice(i, 1);
		}
	}
	
	$(".carousel-inner .carousel-item:not(last)").removeClass("active");
	$(".carousel-inner .carousel-item:last").addClass("active");
	$('.carousel-item.active').addClass('animated zoomOutDown');
	
	$('#dashboardCarousel').children('.carousel-control').removeClass("hide");
	
	if($('.carousel-inner .carousel-item:first').hasClass('active')) {
		$('#dashboardCarousel').children('.left.carousel-control').addClass("hide");
  	}
	
	if($('.carousel-inner .carousel-item:last').hasClass('active')) {
  		$('#dashboardCarousel').children('.right.carousel-control').addClass("hide");
  	}
}

$(document).ready(function() {
	$('#dashboardCarousel').on('slid.bs.carousel', '', function() {
		var $this = $(this);
	
		$this.children('.carousel-control').removeClass("hide");
	
		if ($('.carousel-inner .carousel-item:first').hasClass('active')) {
			$this.children('.left.carousel-control').addClass("hide");
		} else if ($('.carousel-inner .carousel-item:last').hasClass('active')) {
			$this.children('.right.carousel-control').addClass("hide");
		}
	});
});