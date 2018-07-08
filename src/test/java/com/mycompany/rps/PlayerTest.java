package com.mycompany.rps;

import com.mycompany.rps.model.Player;
import com.mycompany.rps.repository.PlayerRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;

public class PlayerTest {

    private Player player = new Player("Bob");

    @Test
    public void playerHasName() {
        Assert.assertThat(player.getName(), containsString("Bob"));
    }
}


