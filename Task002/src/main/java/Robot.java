public class Robot extends BaseObject {

    public Robot(int maxDistance, double maxJump, String nameOfObject) {
        super(maxDistance, maxJump, nameOfObject);
    }

    @Override
    public boolean wallJump(Obstacles obstacl){
        if(super.getMaxJump() >= obstacl.getHightWall())
        {
            super.setRaceResult(true);
            return true;
        }
        super.setRaceResult(false);
        return false;
    }

    @Override
    public boolean runningOnTheTrack(Obstacles obstacl){
        if(super.getMaxDistance() >= obstacl.getLengthTracking())
        {
            super.updateDistance(obstacl.getLengthTracking());
            super.setRaceResult(true);
            return true;
        }
        super.setRaceResult(false);
        return false;
    }

}
