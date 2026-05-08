package fr.univ_amu.iut.exercice4;

/// Position (x, y) sur la grille infinie.
///
/// Utiliser un `record` garantit automatiquement `equals`, `hashCode` et `toString` basés sur les
/// champs - exactement ce qu'on attend d'une valeur.
public record Position(int x, int y) {

  /// Retourne la position obtenue en appliquant le déplacement `(dx, dy)` à cette position.
  public Position translater(int dx, int dy) {
    return new Position(x + dx, y + dy);
  }
}
