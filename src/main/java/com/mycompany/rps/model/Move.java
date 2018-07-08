package com.mycompany.rps.model;

public class Move {

    private String move;

    public Move(String move) {
        this.move = move;
    }

    public String selectMove() {
        return this.move;
    }
}
