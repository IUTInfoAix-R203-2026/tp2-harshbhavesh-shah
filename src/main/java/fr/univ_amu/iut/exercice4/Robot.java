package fr.univ_amu.iut.exercice4;

/// Exercice 4 - Robot sur grille infinie.
///
/// Un robot a une [Position] et une [Orientation]. Il peut :
///
/// - tourner à droite / à gauche (sens horaire / antihoraire)
/// - avancer d'une case dans sa direction courante
///
/// Les rotations ne modifient **pas** la position, et l'avancée ne modifie **pas** l'orientation.
/// La grille est infinie dans les deux dimensions.
public class Robot {

  private Position position;
  private Orientation orientation;

  public Robot(Position position, Orientation orientation) {
    this.position = position;
    this.orientation = orientation;
  }

  public Position getPosition() {
    return position;
  }

  public Orientation getOrientation() {
    return orientation;
  }

  /// Fait pivoter le robot d'un quart de tour vers sa droite (sens horaire).
  public void tournerADroite() {
    // TODO exercice 4 : implémenter la rotation horaire.
    // Astuce : profitez de l'ordre NORD → EST → SUD → OUEST → NORD
    // (les valeurs de l'enum sont déjà dans le sens horaire).
  }

  /// Fait pivoter le robot d'un quart de tour vers sa gauche (sens antihoraire).
  public void tournerAGauche() {
    // TODO exercice 4 : implémenter la rotation antihoraire.
  }

  /// Avance le robot d'une case dans la direction de son orientation courante.
  public void avancer() {
    // TODO exercice 4 : implémenter le déplacement d'une case.
    // NORD → y+1, EST → x+1, SUD → y-1, OUEST → x-1
  }
}
