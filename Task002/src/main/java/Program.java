import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Obstacles> allObstacles = new ArrayList<>();
        allObstacles.add(new Track(5000,"Беговая дорожка 1"));
        allObstacles.add(new Wall(1.2,"Стена 1"));
        allObstacles.add(new Track(5000,"Беговая дорожка 2"));
        allObstacles.add(new Wall(1.4,"Стена 2"));
        allObstacles.add(new Track(25000,"Беговая дорожка 3"));


        BaseObject newMan = new Human(42000, 1.5);

        for (var obst: allObstacles) {
            if(obst instanceof Track){
                System.out.println(obst.getNameOfObstacle());
                newMan.runningOnTheTrack(obst);
            }else if(obst instanceof Wall){
                System.out.println(obst.getNameOfObstacle());
            }
        }
        System.out.println(newMan.getMaxDistance());

    }
}
