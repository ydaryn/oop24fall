package chessPieces;

public class King extends Piece {
	public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        // King moves one square in any direction
        int rowDiff = Math.abs(position.row - b.row);
        int colDiff = Math.abs(position.col - b.col);
        return rowDiff <= 1 && colDiff <= 1;
    }

}
