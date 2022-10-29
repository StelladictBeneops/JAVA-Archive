import
java.util.*;
import java.awt.*; // for Color
public class woofy extends Critter {
private static int barX = -1;
private static int barY = -1;
private int steps;
private int cycle; 
private boolean walkEast;
private boolean lastBool;

public woofy() {
steps = 0;
cycle = 1;
this.walkEast = walkEast; 
lastBool = true;

if (barX == -1 && barY == -1) {
Random rand = new Random();
barX = rand.nextInt(2);
barY = rand.nextInt(3); 
}
}

public boolean eat() {
return true;
}

public Color getColor() {
return Color.GRAY;
}

public Direction getMove() {
if (barY != getY()) {
return Direction.NORTH;
} else if (walkEast) {
if (lastBool) {
lastBool = false;
return Direction.EAST;
} else {
lastBool = true;
return Direction.SOUTH;
}
} else {
if (lastBool) {
lastBool = false;
return Direction.WEST;
} else {
lastBool = true;
return Direction.NORTH;
}
}

}

public Attack fight(String opponent) { 
return Attack.ROAR;
}

public String toString() {
return "&" 
;
}
}

