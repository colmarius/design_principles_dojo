package com.thoughtworks.game_of_life.core;

public class ZombieCellRule implements CellRule {

    @Override
    public boolean canMutate(int numberOfAliveNeighbours) {
        return numberOfAliveNeighbours >= 4;
    }

    @Override
    public Cell mutate(int numberOfAliveNeighbours) {
        return new ZombieCell();
    }
}
