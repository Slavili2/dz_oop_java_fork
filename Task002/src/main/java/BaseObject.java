/**
 * Базовый класс
 */
public abstract class BaseObject {
    private int maxDistance;
    private double maxJump;

    private boolean raceResult = true;

    public BaseObject(int maxDistance, double maxJump) {
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    public double getMaxDistance(){
        return this.maxDistance;
    }

    public double getMaxJump(){
        return this.maxJump;
    }

    public void updateDistance(int distance) {
        this.maxDistance = this.maxDistance - distance;
    }

    public void setRaceResult(boolean raceResult) {
        this.raceResult = raceResult;
    }

    public boolean isRaceResult() {
        return this.raceResult;
    }

    /**
     * Способность перепрыгивать через стену
     * @return - true - объект перепрыгнул, false - объект не смог перепрыгнуть
     */
    public abstract boolean wallJump(Obstacles obstacl);

    /**
     * Преодоление дистанции бегом
     * @return - true - пробежал, false - не смог пробежать
     */
    public abstract boolean runningOnTheTrack(Obstacles obstacl);
}
