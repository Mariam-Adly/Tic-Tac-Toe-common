/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeCommon.services.engine;

import TicTacToeCommon.services.engine.board.Board;
import TicTacToeCommon.services.engine.move.Move;
import TicTacToeCommon.services.engine.player.ai.MiniMax;
import TicTacToeCommon.services.engine.player.ai.TicTacToeAlgorithm;

/**
 *
 * @author m-essam
 */
public class TicTacToeEngine {

    // Driver code
    public static void main(String[] args) {
        Board board = Board.createStandardBoard(3);
        TicTacToeAlgorithm miniMax = new MiniMax(10);
        for (int i = 0; i < 10; i++) {
            Move move = miniMax.execute(board);
            System.out.println(move);
            board = move.execute();
            System.out.println(board);
            System.out.println(board.isWin());
        }
    }

}
