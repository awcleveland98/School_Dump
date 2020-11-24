/*
     Filename: main.js
  
     Author: Alexander Cleveland   
     Date: 06/07/19    
 */

function computearea(r){
	return Math.PI*r*r;
}

$(document).ready(function(){
	
	$(document).on('click', '#calculatearea', function(){
		var p = document.getElementById("precision").value;
		var r = document.getElementById("radius").value;
		var a = computearea(r);
		$('input[name="areaField"]').val(a.toFixed(p));
	});	

});


