package dev.laughingcat27.minesweeper2.model.item;

import dev.laughingcat27.minesweeper2.model.tile.Tile;

import java.util.List;

public class ItemFactory {

    public static Item createItem(List<List<Tile>> grid, Tile tile) {
        double bombChance = 0.25;

        double random = Math.random();

        return random <= bombChance ? new MineItem(grid, tile) : new CounterItem(grid, tile);
    }
}
