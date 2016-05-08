$(document).ready(function(){
	console.log("ready");
	$.ajax({
	   type: "POST",
	   dataType:'json',
	   url: "http://10.4.129.241:9001/door/select",
	   success: function(msg){
	     console.log(msg[0]['doorStatus']);
	      var state61 = msg[0]['doorStatus'];
	      var state62 = msg[1]['doorStatus'];
	     $("#doorStatus61").html(state61);
	     $("#doorStatus62").html(state62);
	   }
	 });
});