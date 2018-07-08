package com.mycompany.rps.repository;

import com.mycompany.rps.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

}

