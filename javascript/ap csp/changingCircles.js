var NUM_CIRCLES = 15;
var MIN_RADIUS = 10;
var MAX_RADIUS = 40;
var DELAY = 500;
var circles = [];

function start(){
	// Your code here
	createCircles(NUM_CIRCLES);
	setTimer(changeColors, DELAY);
}

function changeColors(){
	for(var i = 0; i < circles.length; i++){
		circles[i].setColor(Randomizer.nextColor());
	}
}

function createRandomCircle(radius,x,y) {
    // creates a circle on the screen with a radius and coordinates
    var circle = new Circle(radius);
	circle.setPosition(x,y);
	add(circle);
	circles.push(circle);
    
}

function createCircles(NUM_CIRCLES) {
	for(var i = 0; i < NUM_CIRCLES; i++){
	    var radius = Randomizer.nextInt(MIN_RADIUS, MAX_RADIUS);
	    var x = Randomizer.nextInt(0, getWidth());
	    var y = Randomizer.nextInt(0, getHeight());
		createRandomCircle(radius,x,y);
	}
}