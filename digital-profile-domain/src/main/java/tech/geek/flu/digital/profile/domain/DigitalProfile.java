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
public class DigitalProfile {

  private UUID id;
  private String firstName;
  private String lastName;
  private String fullName;
  private int age;
  private GenreEnum genre;
  private Address mainAddress;
  private List<Address> otherAddresses;
  private List<BirthProfile> birthProfiles;
  private boolean isAlive;
  private DeathProfile deathProfile;
  private List<MaritalStatus> maritalStatuses;
  private MedicalProfile medicalProfile;


}
