package fr.univ_amu.iut.exercice4;

/// Orientation cardinale du robot.
///
/// Les valeurs sont ordonnées dans le sens horaire ([#NORD] → [#EST] → [#SUD] → [#OUEST]), ce qui
/// simplifie l'implémentation de [#aDroite()] (avance de 1 dans l'ordre) et [#aGauche()] (recule
/// de 1).
///
/// Chaque orientation porte aussi son **vecteur unitaire** `(dx, dy)` : le déplacement à appliquer
/// à une [Position] pour avancer d'une case dans cette direction.
public enum Orientation {
  NORD(0, 1),
  EST(1, 0),
  SUD(0, -1),
  OUEST(-1, 0);

  private final int dx;
  private final int dy;

  Orientation(int dx, int dy) {
    this.dx = dx;
    this.dy = dy;
  }

  /// Composante horizontale du vecteur unitaire : `+1` vers l'est, `-1` vers l'ouest, `0` sinon.
  public int dx() {
    return dx;
  }

  /// Composante verticale du vecteur unitaire : `+1` vers le nord, `-1` vers le sud, `0` sinon.
  public int dy() {
    return dy;
  }

  /// Retourne l'orientation obtenue après une rotation d'un quart de tour vers la droite (sens
  /// horaire).
  public Orientation aDroite() {
    Orientation[] sens = values();
    return sens[(ordinal() + 1) % sens.length];
  }

  /// Retourne l'orientation obtenue après une rotation d'un quart de tour vers la gauche (sens
  /// antihoraire).
  public Orientation aGauche() {
    Orientation[] sens = values();
    return sens[(ordinal() + sens.length - 1) % sens.length];
  }
}
