$(document).ready(function(){
	console.log("ready");
	$.ajax({
	   type: "POST",
	   dataType:'json',
	   url:"http://10.4.128.127:9001/door/select",
	   success: function(msg){
	     console.log(msg[0]['doorStatus']);
	      var state61 = msg[0]['doorStatus'];
	      var time61 = msg[0]['registerDateTime'];
	      var state62 = msg[1]['doorStatus'];
	      var time62 = msg[1]['registerDateTime'];
	     $("#doorStatus61").html(state61);
	     $("#time61").html(time61);
	     $("#doorStatus62").html(state62);
	     $("#time62").html(time62);
	   }
	 });
});