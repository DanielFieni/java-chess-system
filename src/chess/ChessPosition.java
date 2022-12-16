package chess;

import boardgame.Position;

/**
 *
 * @author danie
 */
public class ChessPosition {
    
    private int row;
    private char column;

    public ChessPosition(char column, int row)
    {
        if(column < 'a' || column > 'h' || row < 1 || row > 8)
        {
            // Erro ao instanciar ChessPosition: os valores validos sao a1 a h8
            throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8.");
        }
        
        this.row = row;
        this.column = column;
    }
    
    protected Position toPosition()
    {
        return new Position(8 - row, column - 'a'); 
    }
    
    protected static ChessPosition fromPosition(Position position)
    {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }
    
    @Override
    public String toString()
    {
        return "" + column + row; 
    }
    
}
