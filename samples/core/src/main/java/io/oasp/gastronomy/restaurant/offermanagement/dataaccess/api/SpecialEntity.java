package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

@Entity
@Table(name = "Special")
public class SpecialEntity extends ApplicationPersistenceEntity implements Special {

  private String name;

  private OfferEntity offer;

  private WeeklyPeriodEmbeddable activePeriod;

  private Money specialPrice;

  private static final long serialVersionUID = 1L;

  @Column(unique = true)
  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "offerId")
  public OfferEntity getOffer() {

    return this.offer;
  }

  public void setOffer(OfferEntity offer) {

    this.offer = offer;
  }

  @Embedded
  public WeeklyPeriodEmbeddable getActivePeriod() {

    return this.activePeriod;
  }

  public void setActivePeriod(WeeklyPeriod activePeriod) {

    WeeklyPeriodEmbeddable period = new WeeklyPeriodEmbeddable();
    period.setEndingDay(activePeriod.getEndingDay());
    period.setEndingHour(activePeriod.getEndingHour());
    period.setStartingDay(activePeriod.getStartingDay());
    period.setStartingHour(activePeriod.getStartingHour());

    this.activePeriod = period;
  }

  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  @Override
  @Transient
  public Long getOfferId() {

    if (this.offer == null) {
      return null;
    }
    return this.offer.getId();
  }

  @Override
  public void setOfferId(Long offerId) {

    if (offerId == null) {
      this.offer = null;
    } else {
      OfferEntity offerEntity = new OfferEntity();
      offerEntity.setId(offerId);
      this.offer = offerEntity;
    }
  }

}
