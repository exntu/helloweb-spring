/**
 * 공통 기능 정리
 */

//////////////////////////////////////////////////
//
// Alert
//
//////////////////////////////////////////////////

// 전역객체
var _alert = {};

//기본옵션
_alert.defaultOption = {
	"closeButton": true,
	"debug": false,
	"positionClass": "toast-top-right",
	"onclick": null,
	"showDuration": "300",
	"hideDuration": "1000",
	"timeOut": "5000",
	"extendedTimeOut": "1000",
	"showEasing": "swing",
	"hideEasing": "linear",
	"showMethod": "fadeIn",
	"hideMethod": "fadeOut"
};

// Information
_alert.info = function(content, title, option){
	
	// 타이틀
	title = title ? title : "Information";
	
	// 옵션값이 있을 경우에는 기본 옵션을 확장 
	option = option ? $.extend(this.defaultOption, option) : this.defaultOption;
	
	// 호출
	toastr.info(content, title, option);
};

// Success
_alert.success = function(content, title, option){
	
	// 타이틀
	title = title ? title : "Success";
	
	// 옵션값이 있을 경우에는 기본 옵션을 확장 
	option = option ? $.extend(this.defaultOption, option) : this.defaultOption;
	
	// 호출
	toastr.success(content, title, option);
};

// Warning
_alert.warning = function(content, title, option){
	
	// 타이틀
	title = title ? title : "Warning";
	
	// 옵션값이 있을 경우에는 기본 옵션을 확장 
	option = option ? $.extend(this.defaultOption, option) : this.defaultOption;
	
	// 호출
	toastr.warning(content, title, option);
};

// Error
_alert.error = function(content, title, option){
	
	// 타이틀
	title = title ? title : "Error";
	
	// 옵션값이 있을 경우에는 기본 옵션을 확장 
	option = option ? $.extend(this.defaultOption, option) : this.defaultOption;
	
	// 호출
	toastr.error(content, title, option);
};


//////////////////////////////////////////////////
//
// Loading
//
//////////////////////////////////////////////////

//전역객체
var _loading = {};

//Show
_loading.show = function(){
	
	if( !_loading.$element ){
		_loading.$element = $("#_loading");
		_loading.$element.css("opacity", 0.6);
	}
	
	this.$element.show();
};

//Hide
_loading.hide = function(){
	
	if( !_loading.$element ){
		_loading.$element = $("#_loading");
	}
	
	this.$element.hide();
};