package edu.odu.cs.cs361;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestLunch {
    
    @Test
    public void noDoors() {
        Lunch lunch = new Lunch(2);
        int dist = lunch.findShortestPathBetween(1, 2);
        assertThat(dist, is(-1));
    }

    @Test
    public void oneDoor() {
        Lunch lunch = new Lunch(2);
        lunch.addDoor(1, 2);
        int dist = lunch.findShortestPathBetween(1, 2);
        assertThat(dist, is(1));

        lunch = new Lunch(2);
        lunch.addDoor(2, 1);
        dist = lunch.findShortestPathBetween(1, 2);
        assertThat(dist, is(-1));

    }

    @Test
    public void example1() {
        Lunch lunch = new Lunch(4);
        lunch.addDoor(1, 2);
        lunch.addDoor(3, 1);
        lunch.addDoor(3, 4);
        lunch.addDoor(2, 4);
        lunch.addDoor(4, 2);
        int dist = lunch.findShortestPathBetween(1, 4);
        assertThat(dist, is(2));

        dist = lunch.findShortestPathBetween(2, 3);
        assertThat(dist, is(-1));

    }


}
