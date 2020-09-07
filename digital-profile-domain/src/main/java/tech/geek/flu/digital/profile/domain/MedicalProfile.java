package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@Builder
public class MedicalProfile {

  private UUID digitalProfileId;
  private UUID medicalProfileId;
  private BodyComposition currentBodyComposition;
  private List<BodyComposition> bodyCompositions;

}
