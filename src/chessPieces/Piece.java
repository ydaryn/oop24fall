package chessPieces;

public abstract class Piece {
    Position position; 

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position b);
}
