package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.LocalDateTime;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * Criteria for searching @{@link io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity} Contains
 * information about OfferNumber to find by and date of checking for special offer to check if there is sth active.
 */
public class SpecialSearchCriteriaTo extends SearchCriteriaTo {
  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private String name;

  private LocalDateTime dateOfCheckingOffers;

  private Money specialPrice;

  private Long offerNumber;

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public LocalDateTime getDateOfCheckingOffers() {

    return this.dateOfCheckingOffers;
  }

  public void setDateOfCheckingOffers(LocalDateTime dateOfCheckingOffers) {

    this.dateOfCheckingOffers = dateOfCheckingOffers;
  }

  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  public Long getOfferNumber() {

    return this.offerNumber;
  }

  public void setOfferNumber(Long offerNumber) {

    this.offerNumber = offerNumber;
  }
}
