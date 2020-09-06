package tech.geek.flu.digital.profile.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BodyFat {
  private float IMC;
  private float neckCircumference;
  private float abdominalCircumference;
  private float waistCircumference;
  private float hipsCircumference;
  private float percentageBodyFat;
}
