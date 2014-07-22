package com.thoughtworks.game_of_life.core;

public interface CellRule {
    boolean canMutate(int numberOfAliveNeighbours);
    Cell mutate(int numberOfAliveNeighbours);
}
