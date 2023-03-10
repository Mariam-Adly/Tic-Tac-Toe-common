package TicTacToeCommon.services.engine.move;

import TicTacToeCommon.services.engine.board.Board;
import TicTacToeCommon.services.engine.board.Board.BoardBuilder;
import TicTacToeCommon.services.engine.piece.League;
import TicTacToeCommon.services.engine.piece.Piece;


public class Move {

    private final Board board;
    private final Piece piece;

    public Move(final Board board, final League league, final int index) {
        this.board = board;
        this.piece = league == null ? null : Piece.createPiece(league, index);
    }

    public final Board execute() {
        final BoardBuilder builder = new BoardBuilder(this.board.getCurrentPlayer().getOpponent().getLeague() ,this.board.getGrid());
        this.board.getTileList().forEach(builder::addTile);
        builder.addPiece(this.piece);
        return builder.build();
    }

    public final int getIndex() { return this.piece.getIndex(); }

    public Piece getPiece() { return piece;  }

    @Override
    public final int hashCode() { return this.piece.hashCode() * 31; }

    @Override
    public final String toString() { return this.piece.toString() + ":" + this.piece.getIndex(); }

    @Override
    public final boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Move) || object instanceof NullMove) {
            return false;
        }
        final Move move = (Move)object;
        return move.piece.equals(this.piece);
    }

    public static final class NullMove extends Move {
        public final static NullMove NULL_MOVE = new NullMove();
        private NullMove() { super(null, null, -1); }
    }
}