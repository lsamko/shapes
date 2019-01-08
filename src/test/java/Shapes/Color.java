package Shapes;

import java.util.Random;


public enum Color {
    RED, BLUE, WHITE, BLACK, GRAY, YELLOW, ROSE, PURPLE;

    public static Color randomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}




