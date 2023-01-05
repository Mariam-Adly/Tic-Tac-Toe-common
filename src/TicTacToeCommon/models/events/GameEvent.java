/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeCommon.models.events;

import TicTacToeCommon.models.base.RemoteEvent;

/**
 *
 * @author m-essam
 */
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

    public static class WinGameEvent extends GameEvent {

        public WinGameEvent() {
            super();
        }

        public WinGameEvent(String gameId) {
            super(gameId);
        }
    }
    
    public static class WinGameEvent extends GameEvent {

        public WinGameEvent() {
            super();
        }

        public WinGameEvent(String gameId) {
            super(gameId);
        }
    }
    
    public static class WinGameEvent extends GameEvent {

        public WinGameEvent() {
            super();
        }

        public WinGameEvent(String gameId) {
            super(gameId);
        }
    }
    
    public static class WinGameEvent extends GameEvent {

        public WinGameEvent() {
            super();
        }

        public WinGameEvent(String gameId) {
            super(gameId);
        }
    }
}
