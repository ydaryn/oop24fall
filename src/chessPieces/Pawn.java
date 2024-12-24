package chessPieces;

public class Pawn extends Piece{
	public Pawn(Position position) {
		super(position);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
        int rowDiff = b.row - position.row;
        if(rowDiff==1) return true;
        else return false;
	}
}
