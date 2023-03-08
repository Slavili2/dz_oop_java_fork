public abstract class Obstacles {
    private int lengthTracking;
    private double hightWall;

    private String nameOfObstacle;

    public Obstacles(int lengthTracking, String nameOfObstacle) {
        this.lengthTracking = lengthTracking;
        this.nameOfObstacle = nameOfObstacle;
    }

    public Obstacles(double hightWall, String nameOfObstacle) {
        this.hightWall = hightWall;
        this.nameOfObstacle = nameOfObstacle;
    }

    public int getLengthTracking() {
        return lengthTracking;
    }

    public double getHightWall() {
        return hightWall;
    }

    public String getNameOfObstacle() {
        return nameOfObstacle;
    }
}
