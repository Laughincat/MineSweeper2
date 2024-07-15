package dev.laughingcat27.minesweeper.model.item.itemfactory;

import dev.laughingcat27.minesweeper.model.item.Item;
import dev.laughingcat27.minesweeper.model.item.OpenerMineItem;
import dev.laughingcat27.minesweeper.model.tile.Tile;

import java.util.List;

public class OpenerMineItemFactory extends ItemFactory {

    @Override
    public Item createItem(List<List<Tile>> grid) {
        return new OpenerMineItem(grid);
    }
}