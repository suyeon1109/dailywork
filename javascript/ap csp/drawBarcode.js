/*
In this program, you will draw a barcode on the screen given an array that represents the data in the barcode.

The array will contain a boolean in it, and if the boolean is true, you will draw a vertical line in that position that runs from the top to the bottom of the screen. If not, you will not draw a line.

We have written the generateBarcode function for you that creates a random barcode. Your job is to write the drawBarcode function.
*/

setSize(400, 100);
var NUM_LINES = 400;

function start() {
    drawBarcode(generateBarcode(NUM_LINES));
}

// Draw the given barcode
function drawBarcode(barcode) {
    // Your code goes here
    for (var i = 0; i < barcode.length; i++) {
        var line = new Line(0+(NUM_LINES/barcode.length)*i, 0, 0+(NUM_LINES/barcode.length)*i, 100);
        if (barcode[i]) {
            line.setColor("black");
        } else {
            line.setColor("white");
        }
        line.setLineWidth(10);
        add(line);
    }
}

/* Generates a bit array representing a barcode
 * The array contains booleans in each index.
 * true means there is a black line.
 * false means there is not.
 *
 * Returns the array.
 */
function generateBarcode(lines) {
    var barcode = [];
    for (var i = 0; i < lines; i++) {
        barcode[i] = Randomizer.nextBoolean(0.3);
    }
    return barcode;
}