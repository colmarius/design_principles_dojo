package com.thoughtworks.game_of_life.core;

public class AliveCellRule implements CellRule {

    @Override
    public boolean canMutate(int numberOfAliveNeighbours) {
        return numberOfAliveNeighbours == 2 || numberOfAliveNeighbours == 3;
    }

    @Override
    public Cell mutate(int numberOfAliveNeighbours) {
        return new AliveCell();
    }
}
