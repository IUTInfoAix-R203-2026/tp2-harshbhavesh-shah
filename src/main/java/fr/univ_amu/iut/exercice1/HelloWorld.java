package fr.univ_amu.iut.exercice1;

/// Exercice 1 - Hello World.
///
/// Premier contact avec le cycle TDD "RED - GREEN - REFACTOR". Écrivez le minimum de code pour
/// faire passer chaque test, en suivant la stratégie de Kent Beck :
///
/// 1. **Fake it** - renvoyez une valeur en dur (ex : `return "Hello, World!";`)
/// 2. **Triangulation** - quand un deuxième test vous force à généraliser, introduisez le minimum
///    de logique
/// 3. **Obvious** - quand l'implémentation tient en une ligne évidente, écrivez-la directement
public class HelloWorld {

  /// Retourne une salutation personnalisée.
  ///
  /// @param nom nom de la personne à saluer, ou `null` / chaîne vide pour une salutation générique
  /// @return `"Hello, World!"` si `nom` est `null` ou vide, `"Hello, <nom>!"` sinon
  public static String saluer(String nom) {
    // TODO exercice 1 : gérer le cas où nom est renseigné (sinon on retourne
    // "Hello, World!" par défaut, ce qui suffit pour les deux premiers tests).
    // Activez les tests un par un. Fake it d'abord, triangulez quand un
    // deuxième test vous y force.
    return "Hello, World!";
  }
}
