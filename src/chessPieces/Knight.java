package chessPieces;

public class Knight extends Piece {
	public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        int rowDiff = Math.abs(position.row - b.row);
        int colDiff = Math.abs(position.col - b.col);
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
