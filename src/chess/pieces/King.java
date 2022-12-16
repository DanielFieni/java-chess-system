package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author danie
 */
public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString()
    {
        return "K";
    }
    
    public boolean canMove(Position position)
    {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        // up
        p.setValues(position.getRow() - 1, position.getColumn());
        if(getBoard().positionExists(position) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // down
        p.setValues(position.getRow() + 1, position.getColumn());
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // northwest (noroeste)
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // northeast (nordeste)
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // southwest (sudoeste)
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // southeast (sudeste)
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        return mat;
    }

}