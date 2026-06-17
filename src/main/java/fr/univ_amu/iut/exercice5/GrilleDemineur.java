package fr.univ_amu.iut.exercice5;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercice 5 - Grille du démineur.
 *
 * <p>Prend en entrée une grille de caractères {@code ' '} et {@code '*'} (où {@code '*'} représente
 * une mine) et produit la même grille annotée : chaque case vide reçoit le nombre de mines dans ses
 * 8 cases voisines (ou reste un espace si aucune mine n'est adjacente).
 *
 * <p>Exemple :
 *
 * <pre>
 *     +-----+     +-----+
 *     | * * |     |1*3*1|
 *     |  *  |  →  |13*31|
 *     |  *  |     | 2*2 |
 *     |     |     | 111 |
 *     +-----+     +-----+
 * </pre>
 *
 * <p>Cet exercice mêle :
 *
 * <ul>
 *   <li>tableaux 2D irréguliers (chaque ligne est une {@link String})
 *   <li>gestion des bornes (cases au bord de la grille)
 *   <li>validation d'entrée (null, symboles, lignes de longueurs différentes)
 *   <li>{@code ApprovalTests} pour une grille de grande taille (voir les tests)
 * </ul>
 */
public class GrilleDemineur {

  private final List<String> grille;

  /**
   * Construit une grille à partir de sa représentation textuelle.
   *
   * @param grilleInitiale lignes de la grille
   * @throws IllegalArgumentException si la grille est {@code null}, contient un caractère autre que
   *     {@code ' '} ou {@code '*'}, ou si les lignes ont des longueurs différentes
   */
  public GrilleDemineur(List<String> grilleInitiale) {
    if (grilleInitiale == null) throw new IllegalArgumentException();
    for (String ligne : grilleInitiale) {
      if (ligne.length() != grilleInitiale.get(0).length()) // Taille incorrecte
      throw new IllegalArgumentException();
      for (char car : ligne.toCharArray()) {
        if (car != ' ' && car != '*') // Caractere inconnu
        throw new IllegalArgumentException();
      }
    }

    this.grille = grilleInitiale == null ? List.of() : List.copyOf(grilleInitiale);
  }

  /**
   * Retourne la grille annotée : chaque case vide est remplacée par le nombre de mines adjacentes
   * (ou un espace si aucune), chaque mine reste un {@code '*'}.
   */
  public List<String> getRepresentationAnnotee() {
    List<String> resultat = new ArrayList<>(grille.size());

    for (int i = 0; i < this.grille.size(); i++) {
      String newLigne = new String("");

      for (int j = 0; j < this.grille.get(i).length(); j++) {

        switch (this.grille.get(i).charAt(j)) {
          case '*': // Mine
            newLigne = newLigne + '*';
            break;

          case ' ': // Vide
            int nbMines = compterMinesAdjacentes(i, j);
            if (nbMines > 0) newLigne = newLigne + nbMines;
            else newLigne = newLigne + ' ';
            break;

          default:
            throw new IllegalArgumentException();
        }
      }

      resultat.add(newLigne);
    }
    // Pour chaque case (ligne, col) :
    // - si c'est une mine ('*'), laisser '*'
    // - sinon compter les mines dans les 8 cases voisines (en gérant les bords)
    // - si le compte est > 0, écrire ce chiffre
    // - si le compte est 0, écrire un espace
    //
    // Astuce : une méthode privée compterMinesAdjacentes(int, int) facilite
    // la gestion des bords et rend le code testable.
    return resultat;
  }

  private int compterMinesAdjacentes(int ligne, int colonne) {
    int total = 0;
    if (colonne > 0 && this.grille.get(ligne).charAt(colonne - 1) == '*') total++; // Gauche
    if (ligne > 0 && colonne > 0 && this.grille.get(ligne - 1).charAt(colonne - 1) == '*')
      total++; // Haut gauche
    if (ligne > 0 && this.grille.get(ligne - 1).charAt(colonne) == '*') total++; // Haut
    if (ligne > 0
        && colonne < this.grille.get(ligne).length() - 1
        && this.grille.get(ligne - 1).charAt(colonne + 1) == '*') total++; // Haut droite

    if (colonne < this.grille.get(ligne).length() - 1
        && this.grille.get(ligne).charAt(colonne + 1) == '*') total++; // Droite
    if (ligne < this.grille.size() - 1
        && colonne < this.grille.get(ligne).length() - 1
        && this.grille.get(ligne + 1).charAt(colonne + 1) == '*') total++; // Bas droite
    if (ligne < this.grille.size() - 1 && this.grille.get(ligne + 1).charAt(colonne) == '*')
      total++; // Bas
    if (ligne < this.grille.size() - 1
        && colonne > 0
        && this.grille.get(ligne + 1).charAt(colonne - 1) == '*') total++; // Bas gauche

    return total;
  }
}
