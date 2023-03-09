import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Obstacles> allObstacles = new ArrayList<>();
        allObstacles.add(new Track(5000,"Беговая дорожка 1"));
        allObstacles.add(new Wall(1.3,"Стена 1"));
        allObstacles.add(new Track(5000,"Беговая дорожка 2"));
        allObstacles.add(new Wall(1.4,"Стена 2"));
        allObstacles.add(new Track(20000,"Беговая дорожка 3"));

        ArrayList<BaseObject> participantsOfTheCompetition = new ArrayList<>();
        participantsOfTheCompetition.add(new Human(42000, 1.5, "Царь Леонид"));
        participantsOfTheCompetition.add(new Cat(15000, 2.7, "Кот-Абармот"));
        participantsOfTheCompetition.add(new Robot(1000000, 6, "Терминатор T-800"));

        System.out.println("В эстафете принимают участие:");
        for (var participant:  participantsOfTheCompetition) {
                System.out.println(participant.getNameOfObject() + ".");
        }

        for (var participant:  participantsOfTheCompetition
             ) {
            System.out.println("\n"+participant.getNameOfObject() + " начал забег:");
            for (var obst: allObstacles) {
                if(obst instanceof Track){
                    if(participant.runningOnTheTrack(obst) == true){
                        System.out.println("\t'"+obst.getNameOfObstacle() + "' длиной "+ obst.getLengthTracking() + " метров пройдена");
                    }
                    else {
                        System.out.println("\t"+participant.getNameOfObject() + " сошёл с дистанции, т.к. '"+ obst.getNameOfObstacle() + "' длиной "+ obst.getLengthTracking() + " метров НЕ пройдена");
                        break;
                    }
                }else if(obst instanceof Wall){
                    if(participant.wallJump(obst) == true){
                        System.out.println("\t'"+obst.getNameOfObstacle() + "' высотой "+ obst.getHightWall() + " метров перепрыгнута");
                    }
                    else{
                        System.out.println("\t"+participant.getNameOfObject() + " сошёл с дистанции, т.к. '"+ obst.getNameOfObstacle() + "' высотой "+ obst.getHightWall() + " метров НЕ перепрыгнута");
                        break;
                    }

                }
            }
        }


        System.out.println("\nИтог соревнований:\n");

        for (var participant:  participantsOfTheCompetition) {
            if(participant.isRaceResult() == true){
                System.out.println(participant.getNameOfObject() + " успешно прошёл эстафету.");
            }else
                System.out.println(participant.getNameOfObject() + " сошёл с дистанции.");
        }
    }
}
