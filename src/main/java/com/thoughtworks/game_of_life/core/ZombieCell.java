package com.thoughtworks.game_of_life.core;

public class ZombieCell extends NeoCell {

    public ZombieCell() {
        this.cellRules.add(new ZombieCellRule());
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
