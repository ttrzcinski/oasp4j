package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;

/**
 * @author TTRZCINS
 *
 */
public interface Special {
  public void setName(String name);

  public String getName();

  public void setActivePeriod(WeeklyPeriodEmbeddable activePeriod);

  public WeeklyPeriodEmbeddable getActivePeriod();

  public void setOffer(OfferEntity offer);

  public OfferEntity getOffer();

  public void setSpecialPrice(Money price);

  public Money getSpecialPrice();
}
