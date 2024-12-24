package chessPieces;

public class Position {
    int row; // 1-8
    int col; // 1-8

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isValid() {
        return row >= 1 && row <= 8 && col >= 1 && col <= 8;
    }

}   
