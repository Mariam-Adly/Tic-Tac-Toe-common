package TicTacToeCommon.models.events;

import TicTacToeCommon.models.GameModel;
import TicTacToeCommon.models.PlayerModel;
import TicTacToeCommon.models.base.RemoteEvent;

public abstract class GameEvent implements RemoteEvent {

    private String gameId;

    public GameEvent() {
    }

    public GameEvent(String gameId) {
        this.gameId = gameId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public static class Started extends GameEvent {

        private GameModel game;
        private PlayerModel player;

        public Started() {
            super();
        }

        public Started(String gameId) {
            super(gameId);
        }

        public Started(String gameId, GameModel game, PlayerModel player) {
            super(gameId);
            this.game = game;
            this.player = player;
        }

        public GameModel getGame() {
            return game;
        }

        public void setGame(GameModel game) {
            this.game = game;
        }

        public PlayerModel getPlayer() {
            return player;
        }

        public void setPlayer(PlayerModel player) {
            this.player = player;
        }

    }

    public static class Won extends GameEvent {

        public Won() {
            super();
        }

        public Won(String gameId) {
            super(gameId);
        }
    }

    public static class Lost extends GameEvent {

        public Lost() {
            super();
        }

        public Lost(String gameId) {
            super(gameId);
        }
    }

    public static class Withdraw extends GameEvent.Won {

        public Withdraw() {
            super();
        }

        public Withdraw(String gameId) {
            super(gameId);
        }
    }

    // TODO change Object to Move
    
    public static class Moved extends GameEvent {

        private String playerId;
        private Object move;

        public Moved() {
            super();
        }

        public Moved(String gameId) {
            super(gameId);
        }

        public Moved(String gameId, String playerId, Object move) {
            super(gameId);
            this.playerId = playerId;
            this.move = move;
        }

        public String getPlayerId() {
            return playerId;
        }

        public void setPlayerId(String playerId) {
            this.playerId = playerId;
        }

        public Object getMove() {
            return move;
        }

        public void setMove(Object move) {
            this.move = move;
        }

    }
}
