package TicTacToeCommon.models;

import java.util.Date;

/**
 * Represents a single move at a certain space on the grid.
 * @author Karim
 * @version 1.0
 * @since 1.0
 * */
public class Move {

    private int playerId;
    private int gameId;
    private byte spacePosition;
    private final Date createdAt = new Date();

    /** Default Constructor */
    public Move(){}

    /**
     * Creates a single a move associated with a player's ID, a game's ID, and in a certain space position on the grid.
     * @param playerId The ID of the player that took the move.
     * @param gameId the ID of the game where this move was taken.
     * @param spacePosition The exact position where the move was taken on the grid.
     * */
    public Move(int playerId, int gameId, byte spacePosition) {
        this.playerId = playerId;
        this.gameId = gameId;
        //TODO Check whether the spacePosition given was between the correct upper and lower bounds.
        //TODO may throw an IllegalSpacePositionException if an incorrect spacePosition was given.
        this.spacePosition = spacePosition;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public byte getSpacePosition() {
        return spacePosition;
    }

    //TODO Check whether the spacePosition given was correct or not.
    public void setSpacePosition(byte spacePosition) {
        this.spacePosition = spacePosition;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
