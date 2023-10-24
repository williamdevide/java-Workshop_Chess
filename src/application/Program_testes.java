package application;

import java.util.Scanner;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program_testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// teste da classe POSITION
		Position pos = new Position(3,5);
		System.out.println(pos);
		System.out.println();
		
		// teste da classe BOARD e PIECE
		Board borad = new Board(8, 8);
		System.out.println();
		
		// teste da classe CHESS MATCH, CHESSPIECE e COLOR
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			
			System.out.println();	
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
		
	}

}
