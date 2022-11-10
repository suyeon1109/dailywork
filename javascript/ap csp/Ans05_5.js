var SENTINEL = 0;
var isEvenNumber=1;

// Prints whether the entered number is even or odd
function start(){
	while (true) {
	    var num = readInt("Enter a number: ");
	    if (num==SENTINEL) {
	        println("Done!");
	        break;
	    } else if (isEven(num)) {
	        println("Even");
	    } else {
	        println("Odd");
	    }
	}
}

function isEven(x) {
    return x%2==0;
}