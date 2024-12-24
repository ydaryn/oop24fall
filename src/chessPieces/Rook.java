package chessPieces;

public class Rook extends Piece {
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        return position.row == b.row || position.col == b.col;
    }
}
