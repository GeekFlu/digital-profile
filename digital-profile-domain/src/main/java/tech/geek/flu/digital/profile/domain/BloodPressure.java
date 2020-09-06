package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BloodPressure {

  private int systolic;
  private int diastolic;

  @Override
  public String toString() {
    return systolic +
      " over " + diastolic;
  }
}
