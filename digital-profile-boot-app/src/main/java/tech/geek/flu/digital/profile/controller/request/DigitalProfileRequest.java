package tech.geek.flu.digital.profile.controller.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tech.geek.flu.digital.profile.domain.*;
import tech.geek.flu.digital.profile.domain.type.GenreEnum;

import java.util.UUID;

@Getter
@Setter
@Builder
public class DigitalProfileRequest {
  private UUID id;
  private String firstName;
  private String lastName;
  private String fullName;
  private int age;
  private GenreEnum genre;
  private Address mainAddress;
  private boolean isAlive;
  private DateProfile birthDay;
}
