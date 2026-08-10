enum Direction {
    LEFT,
    RIGHT
}

public class DirectionEnum {

    public static void main(String[] args) {

        Direction d = Direction.LEFT;

        switch (d) {
            case LEFT:
                System.out.println("Moving left");
                break;

            case RIGHT:
                System.out.println("Moving right");
                break;
        }
    }
}