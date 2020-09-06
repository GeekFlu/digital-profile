package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tech.geek.flu.digital.profile.domain.type.MetricSystemEnum;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class BodyComposition {

  private float weight;
  private float height;

  private BodyFat bodyFat;
  private MetricSystemEnum metricSystem;
  private BloodPressure bloodPressure;
  private LocalDateTime measurementDateTaken;

  public void calculateBodyFatPercentage() {

  }

}
