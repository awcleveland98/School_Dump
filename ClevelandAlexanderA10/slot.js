jackpot = 10000.00;
match3Factor = 100.00;
match2Win = 50.00;

//Function: randInt
//Input: max
//Ouptput: a random integer between 1 and max including 1 and including max
//Example of call: rand(5) will generate a random number between 1 and 5
//Hint: random function of the Math object returns a real number between 0 
//and 1.  You will need to first change its range and then convert it to an 
//integer.  To do this, first multiply the number by max.  This will generate 
//a real number between 0 and max.  Now add one to it.  This would change it 
//to a real number between 1 and max+1. Now find the floor of the result.  
//This will convert it to an integer between 1 and max.
function randInt(max) {
	return Math.floor(Math.random() * max) + 1;
}

//Function: winMessage
//Input: amount
//Output: a string of the form "You win $amount.00".  
//Example of call: winMessage(200) will return the string "You win $200.00"
function winMessage(amount){
	return "You win $" + amount;
}
