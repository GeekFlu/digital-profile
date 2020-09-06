package tech.geek.flu.digital.profile.domain.type;


import lombok.Getter;

@Getter
public enum StateEnum {
  ESTADO_MEXICO(1),
  CDMX(2),
  QUERETARO(3),
  OTHER(4);

  private int stateId;

  StateEnum(int stateId) {
    this.stateId = stateId;
  }
}
