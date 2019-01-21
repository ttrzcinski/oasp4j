package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.time.DayOfWeek;

/**
 * @author TTRZCINS
 *
 */
public interface WeeklyPeriod {

  public DayOfWeek getStartingDay();

  public void setStartingDay(DayOfWeek startingDay);

  public int getStartingHour();

  public void setStartingHour(int startingHour);

  public DayOfWeek getEndingDay();

  public void setEndingDay(DayOfWeek endingDay);

  public int getEndingHour();

  public void setEndingHour(int endingHour);
}
