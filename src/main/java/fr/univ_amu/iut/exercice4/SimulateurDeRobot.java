package fr.univ_amu.iut.exercice4;

/// Simulateur qui exécute une séquence de commandes sur un [Robot].
///
/// Commandes :
///
/// - `R` - tourner à droite
/// - `L` - tourner à gauche
/// - `A` - avancer d'une case
///
/// Exemple : `"RAALAL"` exécuté depuis `(7, 3)` en [Orientation#NORD] termine en `(9, 4)` en
/// [Orientation#OUEST].
public class SimulateurDeRobot {

  private final Robot robot;

  public SimulateurDeRobot(Robot robot) {
    this.robot = robot;
  }

  /// Exécute la séquence de commandes dans l'ordre.
  ///
  /// @param commandes chaîne composée uniquement des caractères `R`, `L` et `A`
  /// @throws IllegalArgumentException si un caractère inconnu est rencontré
  public void executer(String commandes) {
    // TODO exercice 4 : appliquer chaque commande au robot l'une après l'autre.
    // Bonus : levez IllegalArgumentException pour tout caractère autre que R, L, A.
  }

  public Robot getRobot() {
    return robot;
  }
}
