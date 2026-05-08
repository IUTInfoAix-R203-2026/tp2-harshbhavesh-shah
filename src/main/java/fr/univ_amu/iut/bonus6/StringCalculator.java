package fr.univ_amu.iut.bonus6;

/// Bonus - StringCalculator (kata Roy Osherove).
///
/// Kata classique qui pousse le TDD en baby steps dans ses retranchements : chaque nouveau test
/// ajoute une règle incrémentale au parser.
///
/// Règles :
///
/// 1. Chaîne vide → `0`
/// 2. `"1"` → `1`
/// 3. `"1,2"` → `3`
/// 4. Un nombre inconnu de valeurs séparées par `,` est autorisé
/// 5. Le caractère `\n` est aussi un séparateur : `"1\n2,3"` → `6`
/// 6. Préfixe `"//X\n"` définit un délimiteur personnalisé : `"//;\n1;2"` → `3`
/// 7. Un nombre négatif lève une exception listant tous les négatifs : `"-1,2,-3"` →
///    `IllegalArgumentException("négatifs interdits : -1, -3")`
public class StringCalculator {

  /// Retourne la somme des nombres présents dans la chaîne.
  public int add(String nombres) {
    int somme = 0;
    // TODO bonus : parser la chaîne et sommer les nombres.
    // Activez les tests un par un et n'implémentez que le strict minimum
    // à chaque étape. Le test "chaîne vide" passe directement avec le
    // return 0 par défaut, c'est votre fake it initial.
    return somme;
  }
}
