package com.mycompany.rps.repository;

import com.mycompany.rps.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}

