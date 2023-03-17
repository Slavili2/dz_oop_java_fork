package org.example.game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in=new Scanner(System.in);
        System.out.print("Выберите игру: ");
        int num=in.nextInt();
        Game game = null;
        switch (num){
            case 1:game=new NumberGame();
                break;
            case 2:game=new WordGame();
               break;
            case 3:game=new WordRussianGame();
                break;
            default:
                System.out.println("Такой игры еще не существует!");
        }
        game.start(4,2);
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println("Ваш ход:");
            String answer=in.next();
            Answer answerGame=game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков",answerGame.getCows(),answerGame.getBulls()));
            game.setDataWareHouse(answer);
        }
        System.out.println("Загаданное слово: " + game.getWord());
        System.out.println(game.getGameStatus());
        System.out.println("Вывести историю ходов: y - да, n - нет:");
        String result=in.next();


        if(result.equals("y")){
            System.out.println("Ваши ходы:");
            for (var item: game.getDataWareHouse()) {
                System.out.println(item);
            }
        }

    }
}
