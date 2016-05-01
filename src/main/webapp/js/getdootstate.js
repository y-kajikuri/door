$(document).ready(function(){
	console.log("ready");
	$.ajax({
	   type: "POST",
	   dataType:'json',
	   url: "http://localhost:9001/door/select",
	   success: function(msg){
	     console.log(msg[0]['doorStatus']);
	     var state = msg[0]['doorStatus'];
	     $("#doorStatus").html(state);
	   }
	 });
});