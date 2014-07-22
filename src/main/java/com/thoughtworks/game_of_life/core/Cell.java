package com.thoughtworks.game_of_life.core;

public interface Cell {
    boolean isAlive();
    Cell mutate(int numberOfAliveNeighbours);
}
