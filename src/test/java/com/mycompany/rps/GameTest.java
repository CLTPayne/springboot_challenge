package com.mycompany.rps;

import com.mycompany.rps.model.Game;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.CoreMatchers.containsString;

public class GameTest {

    private Game game = new Game();

    @Test
    public void defaultsToInProgress() {
        Assert.assertThat(game.getStatus(), containsString("IN_PROGRESS"));
    }
}
