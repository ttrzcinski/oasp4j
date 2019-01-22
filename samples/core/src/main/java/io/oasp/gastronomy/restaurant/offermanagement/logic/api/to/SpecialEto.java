package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.module.basic.common.api.to.AbstractEto;

public class SpecialEto extends AbstractEto implements Special {

  private static final long serialVersionUID = -123L;

  private String name;

  private OfferEto offer;

  private WeeklyPeriod activePeriod;

  private Money specialPrice;

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public OfferEto getOffer() {

    return this.offer;
  }

  public void setOffer(OfferEto offer) {

    this.offer = offer;
  }

  public WeeklyPeriod getActivePeriod() {

    return this.activePeriod;
  }

  public void setActivePeriod(WeeklyPeriod activePeriod) {

    this.activePeriod = activePeriod;
  }

  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

}
