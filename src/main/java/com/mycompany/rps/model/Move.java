package com.mycompany.rps.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MOVES")
@NoArgsConstructor
@AllArgsConstructor
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "game_id", nullable = false)
//    private Game game;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = true)
    private Player player;

    private String move;

    public Move(String move) {
        this.move = move;
    }

    public String selectMove() {
        return this.move;
    }
}
