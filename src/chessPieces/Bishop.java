package chessPieces;

public class Bishop extends Piece {
	public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        return Math.abs(position.row - b.row) == Math.abs(position.col - b.col);
    }
}
