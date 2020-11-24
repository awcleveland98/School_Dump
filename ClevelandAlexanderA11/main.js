function monthly(I,N,S){
	//Inputs:
	//I : Yearly Interest Year in decimal (e.g. 8.5% = 0.085)
	//N : Number of monthly payments
	//S : Loan amount//Outputs:
	//returns monthly payments on the loan
	return (S*I/12*Math.pow(I/12+1, N))/(Math.pow(I/12+1,N)-1);
	}
	
function  showVal() {
	var loanAmount = document.getElementById("loanamount").value;
		
	while(loanAmount <= 0 || loanAmount == null){
		loanAmount = prompt("Please enter a positive amount for loan amount", 0);
	}
	loanAmount = parseFloat(loanAmount);
	
	var interestRate = document.getElementById("interest").value;
	var convertedInterest = interestRate / 100;
	
	var loanLength = document.getElementById("loanlength").value;
	var convertedLength = loanLength * 12;
	
	var loanType = document.querySelector('input[name="loantype"]:checked').value;
	
	if(loanType == "Personal ($1000.00 origination fee)"){
		loanAmount += 1000;
	}
	else if(loanType == "Business ($500.00 origination fee)"){
		loanAmount += 500;
	}
	
	var student = document.getElementById("student").checked;
	if(student == true){
		convertedInterest -= 0.01;
	}
	
	var loanMonthly = monthly(convertedInterest, convertedLength, loanAmount);
	var loanTotal = loanMonthly * convertedLength;
	
	if(loanMonthly > 5000){
		alert("We need last 5 years of tax returns for all loans over $5000.00");
	}
	
	document.getElementById("mMessage").innerHTML = loanMonthly.toFixed(2);
	document.getElementById("tMessage").innerHTML = loanTotal.toFixed(2);
}

function resetForm(){
	return confirm("Are you sure you want to reload?");
}