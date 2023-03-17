package org.example.game;

import java.util.List;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
    String getWord();
    void setDataWareHouse(String listItem);
    List<String> getDataWareHouse();
}
