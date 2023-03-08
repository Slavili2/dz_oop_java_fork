/**
 * Базовый класс
 */
public abstract class BaseObject {
    protected int avgSpeedRun;
    protected int maxJump;

    public BaseObject(int avgSpeedRun, int maxJump) {
        this.avgSpeedRun = avgSpeedRun;
        this.maxJump = maxJump;
    }

    public abstract int getAvgSpeedRun();

    public abstract int getMaxJump();

    /**
     * Способность перепрыгивать через стену
     * @return - true - объект перепрыгнул, false - объект не смог перепрыгнуть
     */
    public abstract boolean wallJump();

    /**
     * Преодоление дистанции бегом
     * @return - true - пробежал, false - не смог пробежать
     */
    public abstract boolean runningOnTheTrack();
}
