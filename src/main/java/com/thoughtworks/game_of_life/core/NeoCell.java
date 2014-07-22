package com.thoughtworks.game_of_life.core;

import java.util.ArrayList;
import java.util.List;

public abstract class NeoCell implements Cell {

    public ArrayList<CellRule> cellRules = new ArrayList<CellRule>();;

    @Override
    public Cell mutate(int numberOfAliveNeighbours) {
        for (CellRule cellRule : this.cellRules) {
            if (cellRule.canMutate(numberOfAliveNeighbours))
                return cellRule.mutate(numberOfAliveNeighbours);
        }
        throw new NoCellRuleFound();
    }

    class NoCellRuleFound extends RuntimeException {}
}
