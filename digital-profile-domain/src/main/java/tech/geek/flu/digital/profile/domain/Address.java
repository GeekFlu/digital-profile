package tech.geek.flu.digital.profile.domain;

import lombok.Getter;
import lombok.Setter;
import tech.geek.flu.digital.profile.domain.type.AddressTypeEnum;
import tech.geek.flu.digital.profile.domain.type.CountryEnum;
import tech.geek.flu.digital.profile.domain.type.StateEnum;

@Setter
@Getter
public class Address {

  private String addressLine1;
  private String addressLine2;
  private String city;
  private String colony;
  private String zip;
  private CountryEnum country;
  private StateEnum stateEnum;
  private String otherCountryDescription;
  private String otherStateDescription;
  private AddressTypeEnum addressType;

}
