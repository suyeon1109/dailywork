/*
Starting with our program that creates an array of coin flips, add a function that prints out the total number of heads and total number of tails flipped.

Your function should take the array of flips as a parameter like this:

function countHeadsAndTails(flips) {
    // your code here
}
*/

var NUM_FLIPS = 100;

function start(){
	var flips = flipCoins();
	printArray(flips);
	countHeadsAndTails(flips);
}

function flipCoins(){
	var flips = [];
	for(var i = 0; i < NUM_FLIPS; i++){
		if(Randomizer.nextBoolean()){
			flips.push("Heads");
		}else{
			flips.push("Tails");
		}
	}
	return flips;
}

function printArray(arr){
	for(var i = 0; i < arr.length; i++){
		println(i + ": " + arr[i]);
	}
}

function countHeadsAndTails(flips) {
    var headCounts = 0;
    var tailCounts = 0;
    for(var i = 0; i < flips.length; i++){
		if(flips[i]=="Heads"){
			headCounts++;
		}else{
			tailCounts++;
		}
	}
	
	println("head counts: "+headCounts);
	println("tail counts: "+tailCounts);
}