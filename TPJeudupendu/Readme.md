le jeu du pendu
Le but du jeu est de trouver un mot en ne connaissant que le nombre de lettres.

A chaque tour de jeu, le joueur doit proposer une lettre de l'alphabet (pour simplifier on supposera que le mot ne contient que des lettres en minuscules : pas d'accent, pas d'espace, pas de tiret, ...)

Si la lettre est dans le mot, on affichera alors toutes les occurences de cette lettre à leur place respective.

Mot à trouver : _ _ _ _ (donc 4 lettres)
Proposition : 'a' -> pas présent
Proposition : 's' -> présent
Mot à trouver : _ s _ s
Proposition : 'i' -> présent
Mot à trouver : i s i s
==> trouvé !

Choix du mot à découvrir
— Écrire la fonction motADecouvrir qui choisit au hasard un mot dans un tableau de mots

Mot crypé
— Écrire la fonction crypterMot qui prend en paramètre un mot et renvoie un tableau de caractères contenant autant de '_' que de lettres dans le mot

*Par exemple,
mot = "isis" --> mot crypté = ['_', '_', '_', '_']

Une lettre dans un mot ?
— Ecrire la fonction estDans qui retourne vrai si la lettre est dans le mot.

*Par exemple,
estDans('i',"isis") --> vrai
estDans('a',"isis") --> faux

Actualiser le mot crypté
— Ecrire la fonction actualiserMotCrypte qui modifie le mot crypté en faisant apparaitre toutes les occurences d'une lettre.

*Par exemple,
mot crypté = ['_', '_', '_', '_']
actualiserMotCrypte( 'i', motCrypte, "isis" )
--> mot crypté = ['i', '_', 'i', '_']
*

Mot trouvé ?
— Ecrire la fonction motComplet qui indique si le mot a été trouvé (ou encore si le mot crypté ne contient plus aucun '_')

Lettre au hasard
— Ecrire la fonction lettreHasard qui renvoie une lettre de l'alphabet au hasard.

Afficher mot crypte
— Ecrire la fonction afficherMotCrypte qui affiche à l'écran le mot crypté.

Jouer une partie au hasard
— Ecrire la fonction jouerPartieHasard qui joue une partie, c'est à dire :
-1 choisir un mot dans un tableau de mots
-2 construire le mot crypté
-3 choisir une lettre de l'alphabet au hasard
-4 tester si cette lettre est dans le mot
-5 si oui actualiser le mot crypté
-6 si le mot crypté n'est pas complet alors revenir à l'étape 3
-7 afficher le nb d'essais qui ont été necessaires pour trouver le mot

Jouer une partie interactive
— Ecrire la fonction jouerPartieInteractive qui joue une partie, mais en demandant à l'utilisateur de saisir les caractères un par un.

Pour cela, utiliser la fonction suivante :

public static char saisieClavier() {
Scanner sc = new Scanner(System.in);
System.out.print("un caractère ? : ");
return sc.next().charAt(0);
}

Difficulte
— Modifier la fonction jouerPartieInteractive en y ajoutant un argument défini comme le nb d'erreurs autorisées. Si le jouer a atteint le nb d'erreurs maximum avant de trouver le mot, il a perdu.