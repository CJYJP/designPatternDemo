package com.yjp.designpattern.creative.memo;

import lombok.Getter;

@Getter
public class GameMemento {
    /** 步数 */
    private int playerSteps;

    /**
     * 备份步数
     * @param playerSteps
     */
    public GameMemento(int playerSteps){
        this.playerSteps = playerSteps;
    }
}
