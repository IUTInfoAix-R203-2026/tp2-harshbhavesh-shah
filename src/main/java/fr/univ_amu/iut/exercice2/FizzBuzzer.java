package fr.univ_amu.iut.exercice2;

/// Exercice 2 - FizzBuzz.
///
/// Classique des entretiens d'embauche et exercice parfait pour pratiquer la **triangulation** :
/// commencez par un retour en dur, puis généralisez dès qu'un deuxième test vous y force.
///
/// Règles : pour chaque entier `n`,
///
/// - si `n` est multiple de 3 *et* de 5, retourner `"FizzBuzz"`
/// - sinon si `n` est multiple de 3, retourner `"Fizz"`
/// - sinon si `n` est multiple de 5, retourner `"Buzz"`
/// - sinon retourner la représentation textuelle de `n`
public class FizzBuzzer {

  /// Retourne la représentation FizzBuzz d'un entier.
  ///
  /// @param n entier strictement positif
  /// @return la chaîne FizzBuzz correspondante
  public String fizzBuzz(int n) {
    // TODO exercice 2 : ajouter les cas Fizz, Buzz et FizzBuzz avant le
    // return par défaut. Activez les tests dans l'ordre : 1 et 2 passent
    // directement (fake it via le return final), 3 demande d'introduire
    // un premier cas, etc.
    return String.valueOf(n);
  }

  /// Retourne la séquence FizzBuzz des entiers de 1 à `n` inclus.
  ///
  /// @param n taille de la séquence demandée (positif)
  /// @return tableau de `n` chaînes FizzBuzz dans l'ordre croissant
  public String[] fizzBuzzJusquA(int n) {
    String[] sequence = new String[n];
    // TODO exercice 2 : remplir sequence[i] en réutilisant fizzBuzz(i+1).
    // Ne dupliquez pas la logique : appelez fizzBuzz !
    return sequence;
  }
}
