package com.monopoly_game_of_thrones;

public class MoneyBox {
    private int moneyCollected;

    public int getMoneyCollected() {
        return moneyCollected;
    }

    public void setMoneyCollected(int moneyCollected) {
        this.moneyCollected += moneyCollected;
    }
    public void clearMoneyBox(){
        this.moneyCollected = 0;
    }
}
