package leetcode.com;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;
import java.time.Instant;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class TimeTrackedTest {
    private Instant start;

    @BeforeAll
    void startTime() {
        start = Instant.now();
    }

    @AfterAll
    void stopTime() {
        long timeElapsed = Duration.between(start, Instant.now()).toMillis();
        System.out.println(String.format(
                "Time spent on program execution: %s ms", timeElapsed));
    }
}
