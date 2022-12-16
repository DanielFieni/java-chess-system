package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/**
 *
 * @author danie
 */
public abstract class ChessPiece extends Piece{

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    
    protected boolean isThereOpponentPiece(Position position)
    {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
    public Color getColor()
    {
        return color;
    }

}
