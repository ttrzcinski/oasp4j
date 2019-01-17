package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import java.time.DayOfWeek;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

@Embeddable
public class WeeklyPeriodEmbeddable implements WeeklyPeriod {

  private DayOfWeek startingDay;

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  private static final long serialVersionUID = 1L;

  public DayOfWeek getStartingDay() {

    return startingDay;
  }

  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  @Max(24)
  @Min(0)
  public int getStartingHour() {

    return startingHour;
  }

  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  public DayOfWeek getEndingDay() {

    return endingDay;
  }

  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  @Max(24)
  @Min(0)
  public int getEndingHour() {

    return endingHour;
  }

  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

}
