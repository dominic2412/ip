import skywalker.task.Deadline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class DeadlineTest {

    @Test
    public void testDeadlineCreation() {
        Deadline deadline = new Deadline("submit report", "2024-08-30");
        assertEquals("[D][ ] submit report (by: Aug 30 2024)", deadline.toString());
    }

    @Test
    public void testMarkDone() {
        Deadline deadline = new Deadline("submit report", "2024-08-30");
        deadline.markDone();
        assertEquals("[D][X] submit report (by: Aug 30 2024)", deadline.toString());
    }
}
