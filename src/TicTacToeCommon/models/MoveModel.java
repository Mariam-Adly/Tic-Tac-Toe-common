package TicTacToeCommon.models;

import java.util.Date;

/**
 * Represents a single move at a certain space on the grid.
 *
 * @author Karim
 * @version 1.0
 * @since 1.0
 *
 */
public class MoveModel {

    private String playerId;
    private String gameId;
    private byte spacePosition;
    private Date createdAt;

    /**
     * Default Constructor
     */
    public MoveModel() {
    }

    /**
     * Creates a single a move associated with a player's ID, a game's ID, and
     * in a certain space position on the grid.
     *
     * @param playerId The ID of the player that took the move.
     * @param gameId the ID of the game where this move was taken.
     * @param spacePosition The exact position where the move was taken on the
     * grid.
     * @param createdAt The exact time this move was taken.
     *
     */
    public MoveModel(String playerId, String gameId, byte spacePosition, Date createdAt) {
        this.playerId = playerId;
        this.gameId = gameId;
        this.spacePosition = spacePosition;
        this.createdAt = createdAt;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public byte getSpacePosition() {
        return spacePosition;
    }

    public void setSpacePosition(byte spacePosition) {
        this.spacePosition = spacePosition;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
