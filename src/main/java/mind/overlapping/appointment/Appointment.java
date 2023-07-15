package mind.overlapping.appointment;

/**
 * Design a calls that represents an appointment and implement a methods that checks if one
 * appointment is overlapping another one.
 */
final class Appointment {
  private final long startTime;
  private final long endTime;

  public Appointment(long startTime, long endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public boolean isOverlapping(Appointment appointment) {
    return startTime < appointment.endTime && (endTime > appointment.endTime
        || endTime > appointment.startTime);
  }
}
