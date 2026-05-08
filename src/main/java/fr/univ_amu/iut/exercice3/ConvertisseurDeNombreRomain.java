package fr.univ_amu.iut.exercice3;

/// Exercice 3 - Convertisseur de chiffres romains en nombres arabes.
///
/// Règles :
///
/// - Les symboles valides sont `I=1, V=5, X=10, L=50, C=100, D=500, M=1000`
/// - Lus de gauche à droite, les symboles s'additionnent : `VI = 5 + 1 = 6`
/// - Un symbole placé avant un symbole de valeur supérieure se soustrait : `IV = 5 - 1 = 4`
/// - Les seules soustractions valides sont :
///   - I avant V ou X (`IV = 4`, `IX = 9`)
///   - X avant L ou C (`XL = 40`, `XC = 90`)
///   - C avant D ou M (`CD = 400`, `CM = 900`)
///
///   Toute autre soustraction doit lever [IllegalArgumentException].
///
/// Conseils TDD : commencez par gérer uniquement `I`, puis `II` / `III` (fake it), puis `V`
/// (triangulation), puis `VI` (addition de deux symboles différents), puis `IV` (introduction de
/// la soustraction). À ce moment-là, **extrayez une méthode** pour calculer la valeur d'un
/// symbole - vous en aurez besoin pour les symboles suivants.
public class ConvertisseurDeNombreRomain {

  /// Convertit une chaîne de chiffres romains en valeur entière.
  ///
  /// @param nombreRomain chaîne composée de symboles romains (par exemple `"XLIX"`)
  /// @return la valeur entière correspondante
  /// @throws IllegalArgumentException si la chaîne contient un symbole invalide ou une
  ///     soustraction interdite
  public int enNombreArabe(String nombreRomain) {
    int total = 0;
    // TODO exercice 3 : remplir total en parcourant la chaîne.
    //
    // Activez les tests un par un. Commencez par "I" = 1 (fake it en
    // retournant 1 en dur), puis "II" = 2 et "III" = 3 (boucle de comptage
    // d'occurrences de I), puis "V" = 5 (switch sur le symbole).
    //
    // Quand vous arrivez à "IV" = 4 : extrayez une méthode valeurDe(char)
    // pour factoriser, puis ajoutez la logique de soustraction.
    //
    // Pour les exceptions : une soustraction est valide seulement pour
    // I avant V/X, X avant L/C, C avant D/M. Tout le reste est invalide.
    return total;
  }
}
