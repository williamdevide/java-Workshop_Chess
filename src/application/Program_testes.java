package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program_testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// teste da classe POSITION
		Position pos = new Position(3,5);
		System.out.println(pos);
		System.out.println();
		
		// teste da classe BOARD e PIECE
		Board borad = new Board(8, 8);
		System.out.println();
		
		// teste da classe CHESS MATCH, CHESSPIECE e COLOR
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
	}

}
