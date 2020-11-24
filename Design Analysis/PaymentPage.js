$(document).ready(function(){
$("#paymentSelection").change(function(){
	if($(this).val() == "paypal"){
		$('.paymentOption').hide();
	} else {
		$('.paymentOption').show();
	}
});
$("paymentSelection").trigger("change");
});