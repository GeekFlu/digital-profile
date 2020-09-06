package tech.geek.flu.digital.profile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class DigitalProfileEntity {

  private UUID id;
  private String firstName;
  private String lastName;
  private String fullName;
  

}
