package mind.overlapping.appointment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppointmentTest {
  @Test
  void checkAppointment() {
    // Starts before another appointment.
    assertFalse(new Appointment(0, 50).isOverlapping(new Appointment(100, 200)));
    assertFalse(new Appointment(0, 100).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(0, 150).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(0, 200).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(0, 250).isOverlapping(new Appointment(100, 200)));

    // Starts at the same time as another appointment.
    assertTrue(new Appointment(100, 150).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(100, 200).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(100, 300).isOverlapping(new Appointment(100, 200)));

    // Starts in the middle of another appointment.
    assertTrue(new Appointment(120, 150).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(120, 200).isOverlapping(new Appointment(100, 200)));
    assertTrue(new Appointment(120, 300).isOverlapping(new Appointment(100, 200)));

    // Starts at the same time when another appointment ends.
    assertFalse(new Appointment(200, 300).isOverlapping(new Appointment(100, 200)));

    // Starts after another appointment.
    assertFalse(new Appointment(250, 300).isOverlapping(new Appointment(100, 200)));
  }
}
