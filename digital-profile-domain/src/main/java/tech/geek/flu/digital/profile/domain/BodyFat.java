package tech.geek.flu.digital.profile.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BodyFat {
  private double IMC;
  private double neckCircumference;
  private double abdominalCircumference;
  private double waistCircumference;
  private double hipsCircumference;
  private double percentageBodyFat;
  private double fatMass;
  private double leanMass;
}
