package tech.geek.flu.digital.profile.domain.type;

import lombok.Getter;

@Getter
public enum CountryEnum {

  MEXICO(1), USA(2), OTHER(3);
  private int countryId;

  CountryEnum(int countryId) {
    this.countryId = countryId;
  }

}
