package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tech.geek.flu.digital.profile.domain.type.GenreEnum;

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

  public void calculateBodyFatPercentage(GenreEnum genre) {

    if (genre == GenreEnum.FEMALE) {

    }else if(genre == GenreEnum.MALE) {

    }

  }


}
