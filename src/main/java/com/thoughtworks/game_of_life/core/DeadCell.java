package com.thoughtworks.game_of_life.core;

public class DeadCell extends NeoCell{

    public DeadCell() {
        this.cellRules.add(new DeadCellRule());
        this.cellRules.add(new AliveCellRule());
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
