// Variables
int barWidth = 30; // Width of the bars
int barHeight = 30; // Height of the bars
int bottomY = 320; // Y position where the bars start
int startX = 100; // X position where the bars start
int barSpacing = 70; // Spacing between the bars
int scaleSpacing = 40; // Space between the y scale and the first bar

// Value limits
int upperLimit = 10; // Highest value that any of the bars can go + 1
int lowerLimit = 4; // Lowest value that any of the bars can go

// Extension value limits
int upperExtensionlimit = 4;
int lowerExtensionlimit = 1;

// Offsets for the labels
int xLabelOffsetX = 60; // Distance of the x labels from the border along the x axis
int xLabelOffsetY = 45; // Distance of the x labels from the border along the y axis
int yLabelOffsetX = -30; // Distance from the y border and the labels along the x axis
int yLabelOffsetY = 2; // Distance from the y border and the labels along the y axis

int averageBarWidth = 10; // Width of the average bars

boolean altColour = false; // Toggles alternate colour for average bar
boolean lineGraph = false; // Toggles line graph

int[] barValues = {5, 2, 4, 7, 6}; // Value of all the bars in total
int[] extensionValues = {1, 2, 2, 3, 1}; // Part of the bars that is an extension

String[] xLabels = {"Raptors", "Warriors", "  Nets", "76ers", "Mavericks"}; // Labels for all of the bars (should be extended along with barValues)

int[][] barColours = { { 83, 238,  50},
                       {255,  45,  24},
                       { 50,   0, 200},
                       {234, 234,   0},
                       {134,   0, 175} }; // Colours to be used for each of the bars (MUST BE EXTENDED ALONG WITH barValues)

void setup() {
    size(500, 400); // Initializes screen size
}

void draw() {

    // Calculates average
    float total = 0;
    for (int i = 0; i < barValues.length; i++) {
        total += barValues[i];
    }
    float average = (total / barValues.length);

    background(165, 209, 221);
    strokeWeight(2);

    // y scale and horizontal lines
    int z = 0;
    do {
        fill(0);
        textSize(24);
        text(z, startX - scaleSpacing + yLabelOffsetX, bottomY - (barHeight * z) + barHeight + yLabelOffsetY);
        line(startX - scaleSpacing, bottomY - (barHeight * z), startX + (barSpacing * (barValues.length - 1)) + barWidth + scaleSpacing, bottomY - (barHeight * z));
        z++;
    } while (z < upperLimit);

    // Checks if lineGraph is true. If yes, then it creates a line graph, otherwise it creates a bar graph
    if (lineGraph) {
        // Changes fill based on altCOlour
        if (altColour) {
            fill(255);
        }
        else {
            fill(0);
        }
        strokeWeight(5);
        // Iterates through every item in barValues and draws a line
        for (int i = 0; i < barValues.length - 1; i++) {
            // Changes the line's colour based on whether it's going up or down
            if (barValues[i] < barValues[i + 1]) {
                stroke(0, 255, 0);
            }
            else {
                stroke(255, 0, 0);
            }
            line(startX + (barSpacing * i) + (barWidth / 2), bottomY - (barHeight * barValues[i]) + barHeight, startX + (barSpacing * (i + 1)) + (barWidth / 2), bottomY - (barHeight * barValues[i + 1]) + barHeight);
        }
        stroke(0);
        // Adds dots to each of the line graph's points
        for (int i = 0; i < barValues.length; i++) {
            circle(startX + (barSpacing * i) + (barWidth / 2), bottomY - (barHeight * barValues[i]) + barHeight, 10);
        }
    }
    else {
        // Iterates through every item in barValues and creates bars
        for (int i = 0; i < barValues.length; i++) {
            // Sets colour based on the current bar in barValues and looks for the matching colour in barColours
            // Iterates through each value in the bar and creates a part of the bar until it reaches the correct value
            int j = 0;
            while (j < barValues[i]) {
                // Checks to see if the bar is an extension or just a normal bar. If a normal bar, normal colours. If part of an extension, make it darker by 100 on each of the RGB channels
                if (j < barValues[i] - extensionValues[i]) {
                    fill(barColours[i][0], barColours[i][1], barColours[i][2]);
                }
                else {
                    fill(barColours[i][0] - 100, barColours[i][1] - 100, barColours[i][2] - 100);
                }
                // Draws the actual bar
                rect(startX + (i * barSpacing), bottomY - (barHeight * j), barWidth, barHeight);
                j++;
            }
            if (altColour) {
                fill(240, 160, 0);
            }
            else {
                fill(200);
            }

            // Iterates through every bar and adds an average bar beside it
            int k = 0;
            while (k < int(average)) {
                rect(startX + (i * barSpacing) + barWidth, bottomY - (barHeight * k), averageBarWidth, barHeight);
                k++;
            }
            rect(startX + (i * barSpacing) + barWidth, bottomY - (barHeight * k) + (barHeight - (barHeight * (average - int(average)))) , averageBarWidth, barHeight * (average - int(average)));
        }
    }

    // Draws the x and y axis lines
    strokeWeight(5);
    line(startX - scaleSpacing, bottomY + barHeight, startX + (barSpacing * (barValues.length - 1)) + barWidth + scaleSpacing, bottomY + barHeight);
    line(startX - scaleSpacing, bottomY + barHeight, startX - scaleSpacing, bottomY - (upperLimit * barHeight) + barHeight);
    strokeWeight(1);

    // Draws the x axis labels
    textSize(12);
    fill(0);
    for (int i = 0; i < xLabels.length; i++) {
        text(xLabels[i], scaleSpacing + (i * barSpacing) + xLabelOffsetX, bottomY + xLabelOffsetY);
    }

    // Refresh button
    fill(mouseX > 450 && mouseX < 490 && mouseY > 10 && mouseY < 30 ? 200 : 255);
    rect(450, 10, 45, 20);
    fill(0);
    textSize(12);
    text("Refresh", 452, 25);

    // Main Title
    textSize(24);
    text("Favourite Basketball Teams", 140, 35);

    // X Title
    textSize(18);
    text("Basketball teams", 200, 385);

    // Y Title
    pushMatrix();
    translate(20, 300);
    rotate(radians(270));
    text("Number of people", 0, 0);
    popMatrix();

    // Average bar colour toggle
    fill(mouseX > 5 && mouseX < 20 && mouseY > 5 && mouseY < 20 ? 200 : 255);
    rect(5, 5, 15, 15);

    fill(0);
    if (altColour) {
        rect(8, 8, 9, 9);
    }
    textSize(12);
    text("Toggle Colour", 23, 17);

    fill(mouseX > 5 && mouseX < 20 && mouseY > 25 && mouseY < 40 ? 200 : 255);
    rect(5, 25, 15, 15);

    fill(0);
    if (lineGraph) {
       rect(8, 28, 9, 9);
    }
    textSize(12);
    text("Toggle Line Graph", 23, 37);

}

void mousePressed ()
{
    // Checks if the cursor is over the refresh button
    if (mouseX > 450 && mouseX < 490 && mouseY > 10 && mouseY < 30) {
        // Looks through every value in the barValues and extensionValues lists and randomizes them
        int i = 0;
        do {
            barValues[i] = (int)random(lowerLimit, upperLimit);
            extensionValues[i] = (int)random(lowerExtensionlimit, upperExtensionlimit);
            i++;
        } while(i < barValues.length);
    }

    // Toggles altColour if the button is pressed
    if (mouseX > 5 && mouseX < 20 && mouseY > 5 && mouseY < 20) {
        altColour = !altColour;
    }
    
    if (mouseX > 5 && mouseX < 20 && mouseY > 25 && mouseY < 40) {
        lineGraph = !lineGraph;
    }
}
