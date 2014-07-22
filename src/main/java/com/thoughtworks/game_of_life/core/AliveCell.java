package com.thoughtworks.game_of_life.core;

public class AliveCell extends NeoCell {

    public AliveCell() {
        this.cellRules.add(new DeadCellRule());
        this.cellRules.add(new AliveCellRule());
        this.cellRules.add(new ZombieCellRule());
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
