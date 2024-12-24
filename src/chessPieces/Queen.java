package chessPieces;

public class Queen extends Piece{
	public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        return (position.row == b.row || position.col == b.col) || Math.abs(position.row - b.row) == Math.abs(position.col - b.col);
    }
}
