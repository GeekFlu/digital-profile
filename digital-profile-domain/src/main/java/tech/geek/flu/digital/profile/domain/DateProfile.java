package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
public class DateProfile {

  private LocalDateTime birthDate;

  public int getYear() {
    return this.birthDate.getYear();
  }

  public int getMonth() {
    return this.birthDate.getMonthValue();
  }

  public int getDay() {
    return this.birthDate.getDayOfMonth();
  }
}
