package dev.laughingcat27.minesweeper2.fxgui.root;

import dev.laughingcat27.minesweeper2.fxgui.board.BoardNode;
import dev.laughingcat27.minesweeper2.model.board.SimpleBoard;
import dev.laughingcat27.util.fx.fxmlloader.ExtendedFxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class RootPane extends BorderPane {

    public RootPane() {
        new ExtendedFxmlLoader().loadCustomObject(this, RootPane.class);
    }
}
