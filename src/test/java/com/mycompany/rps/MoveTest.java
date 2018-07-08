package com.mycompany.rps;

import com.mycompany.rps.model.Move;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class MoveTest {

    private Move move = new Move("Rock");

    @Test
    public void moveHasBeenSelected() {
        Assert.assertThat(move.selectMove(), containsString("Rock"));
    }
}
