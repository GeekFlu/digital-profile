package tech.geek.flu.digital.profile.domain.tools;

import tech.geek.flu.digital.profile.domain.BodyComposition;
import tech.geek.flu.digital.profile.domain.type.GenreEnum;

public class MedicalCalculators {

  /**
   * U.S. Navy Method:
   * <p>
   * There are many specific techniques used for measuring body fat.
   * The calculator above uses a method involving equations developed at the Naval Health Research Center by Hodgdon and Beckett in 1984.
   * The method for measuring the relevant body parts as well as the specific equations used are provided below:
   * <p>
   * 1. Measure the circumference of the subject's waist at a horizontal level around the navel for men, and at the level with the smallest width for women.
   * Ensure that the subject does not pull their stomach inwards to obtain accurate measurements.
   * <p>
   * 2. Measure the circumference of the subject's neck starting below the larynx, with the tape sloping downward to the front.
   * The subject should avoid flaring their neck outwards.
   * <p>
   * 3. For women only: Measure the circumference of the subject's hips at the largest horizontal measure.
   * <p>
   * Once these measurements are obtained, use the following formulas to calculate an estimate of body fat.
   * Two equations are provided, one using the U.S. customary system (USC) which uses inches,
   * and the other using the International System of Units, specifically the unit of centimeters
   *
   * @param genre
   * @param bodyComposition
   * @return fat percentage in SI metric
   */
  public static double calculateBodyFatPercentage(GenreEnum genre, BodyComposition bodyComposition) {
    double result = 0.0;
    if (genre == GenreEnum.MALE) {
      result = calculateBodyFatPercentageMale_SI(bodyComposition.getBodyFat().getWaistCircumference(), bodyComposition.getBodyFat().getNeckCircumference(), bodyComposition.getHeight());
    } else if (genre == GenreEnum.FEMALE) {
      result = calculateBodyFatPercentageFemale_SI(bodyComposition.getBodyFat().getWaistCircumference(), bodyComposition.getBodyFat().getNeckCircumference(), bodyComposition.getBodyFat().getHipsCircumference(), bodyComposition.getHeight());
    }
    return result;
  }

  public static double calculateBodyFatPercentageMale_SI(double waistCircumference, double neckCircumference, float height) {
    double denim = 1.0324 - 0.19077 * Math.log10(waistCircumference - neckCircumference) + 0.15456 * Math.log10(height);
    return 495 / denim - 450;
  }

  public static double calculateBodyFatPercentageFemale_SI(double waistCircumference, double neckCircumference, double hipsCircumference, float height) {
    double denim = 1.29579 - 0.35004 * Math.log10(waistCircumference + hipsCircumference - neckCircumference) + 0.22100 * Math.log10(height);
    return 495 / denim - 450;
  }

  public static double calculateBodyFatPercentageMale_USC(float abdominalCircumference, float neckCircumference, float height) {
    return 86.010 * Math.log10(abdominalCircumference - neckCircumference) - 70.041 * Math.log10(height) + 36.76;
  }

  public static double calculateBodyFatPercentageFemale_USC(float waistCircumference, float neckCircumference, float hipsCircumference, float height) {
    return 163.205 * Math.log10(waistCircumference + hipsCircumference - neckCircumference) - 97.684 * (Math.log10(height)) + 36.76;
  }

  public static double calculateFatMass(double bodyFatPercentage, float weight) {
    return bodyFatPercentage * weight;
  }

  public static double calculateLeanMass(double fatMass, float weight) {
    return weight - fatMass;
  }

}
