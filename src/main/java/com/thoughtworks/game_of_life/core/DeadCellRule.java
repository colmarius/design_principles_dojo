package com.thoughtworks.game_of_life.core;

public class DeadCellRule implements CellRule {

    @Override
    public boolean canMutate(int numberOfAliveNeighbours) {
        return numberOfAliveNeighbours <= 2;
    }

    @Override
    public Cell mutate(int numberOfAliveNeighbours) {
        return new DeadCell();
    }
}
