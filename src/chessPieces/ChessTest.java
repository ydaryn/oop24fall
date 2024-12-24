package chessPieces;

public class ChessTest {
    public static void main(String[] args) {
        Position p1 = new Position(1, 1); // A1
        Position p2 = new Position(1, 8); // A8
        Position p3 = new Position(5, 1); // E1

        Rook rook = new Rook(p1);
        System.out.println("Rook A1 -> A8: " + rook.isLegalMove(p2));
        System.out.println("Rook A1 -> E1: " + rook.isLegalMove(p3)); 

        Bishop bishop = new Bishop(new Position(4, 4)); 
        System.out.println("Bishop D4 -> G7: " + bishop.isLegalMove(new Position(7, 7))); 
        System.out.println("Bishop D4 -> D7: " + bishop.isLegalMove(new Position(4, 7))); 

        Queen queen = new Queen(new Position(4, 4)); 
        System.out.println("Queen D4 -> G7: " + queen.isLegalMove(new Position(7, 7))); 
        System.out.println("Queen D4 -> D7: " + queen.isLegalMove(new Position(4, 7))); 

        Knight knight = new Knight(new Position(3, 3)); 
        System.out.println("Knight C3 -> D5: " + knight.isLegalMove(new Position(5, 4)));
        System.out.println("Knight C3 -> D4: " + knight.isLegalMove(new Position(4, 4)));

        Pawn pawn = new Pawn(new Position(2, 1)); 
        System.out.println("Pawn A2 -> A4: " + pawn.isLegalMove(new Position(3, 1))); 
        System.out.println("Pawn A2 -> A5: " + pawn.isLegalMove(new Position(5, 1))); 
    }
}
