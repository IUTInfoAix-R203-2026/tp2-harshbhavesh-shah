package fr.univ_amu.iut.exercice5;

import java.util.ArrayList;
import java.util.List;

/// Exercice 5 - Grille du démineur.
///
/// Prend en entrée une grille de caractères ` ` et `*` (où `*` représente une mine) et produit la
/// même grille annotée : chaque case vide reçoit le nombre de mines dans ses 8 cases voisines (ou
/// reste un espace si aucune mine n'est adjacente).
///
/// Exemple :
///
/// ```
///     +-----+     +-----+
///     | * * |     |1*3*1|
///     |  *  |  →  |13*31|
///     |  *  |     | 2*2 |
///     |     |     | 111 |
///     +-----+     +-----+
/// ```
///
/// Cet exercice mêle :
///
/// - tableaux 2D irréguliers (chaque ligne est une [String])
/// - gestion des bornes (cases au bord de la grille)
/// - validation d'entrée (null, symboles, lignes de longueurs différentes)
/// - `ApprovalTests` pour une grille de grande taille (voir les tests)
public class GrilleDemineur {

  private final List<String> grille;

  /// Construit une grille à partir de sa représentation textuelle.
  ///
  /// @param grilleInitiale lignes de la grille
  /// @throws IllegalArgumentException si la grille est `null`, contient un caractère autre que
  ///     ` ` ou `*`, ou si les lignes ont des longueurs différentes
  public GrilleDemineur(List<String> grilleInitiale) {
    // TODO exercice 5 : valider l'entrée puis stocker la grille.
    this.grille = grilleInitiale == null ? List.of() : List.copyOf(grilleInitiale);
  }

  /// Retourne la grille annotée : chaque case vide est remplacée par le nombre de mines
  /// adjacentes (ou un espace si aucune), chaque mine reste un `*`.
  public List<String> getRepresentationAnnotee() {
    List<String> resultat = new ArrayList<>(grille.size());
    // TODO exercice 5 : remplir resultat avec une ligne annotée par ligne d'entrée.
    //
    // Pour chaque case (ligne, colonne) :
    //   - si c'est une mine ('*'), laisser '*'
    //   - sinon compter les mines dans les 8 cases voisines (en gérant les bords)
    //   - si le compte est > 0, écrire ce chiffre
    //   - si le compte est 0, écrire un espace
    //
    // Astuce : extraire des méthodes privées (annoterLigne, annoter,
    // estMine, compterMinesAdjacentes) facilite la gestion des bords et
    // rend le code testable et lisible.
    return resultat;
  }
}
