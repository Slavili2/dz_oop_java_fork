public class Human extends BaseObject {

    public Human(int maxDistance, double maxJump) {
        super(maxDistance, maxJump);
    }

    @Override
    public boolean wallJump(Obstacles obstacl){
        if(super.getMaxJump() >= obstacl.getHightWall())
            return true;
        return false;
    }

    @Override
    public boolean runningOnTheTrack(Obstacles obstacl){
        if(super.getMaxDistance() >= obstacl.getLengthTracking())
        {
            super.updateDistance(obstacl.getLengthTracking());
            return true;
        }
        return false;
    }

}
