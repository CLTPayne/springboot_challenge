package com.mycompany.rps.model;

import com.mycompany.rps.enums.GameStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "GAMES")
@AllArgsConstructor

public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_one_id", nullable = true)
    private Player playerOne;

    @ManyToOne
    @JoinColumn(name = "player_two_id", nullable = true)
    private Player playerTwo;

    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;

    private String status;

    public Game() {
        this.status = "IN_PROGRESS";
    }

    public String getStatus() {
        return this.status;
    }
}
