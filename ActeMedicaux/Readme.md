Actes médicaux
Ce TP a pour but de gérer un référentiel d'actes médicaux, chacun composé d'un code et d'un libellé.

Comme on souhaite pouvoir des recherches efficaces sur le code, on choisit d'utiliser un dictionnaire.

Initialiser un référentiel d'actes
— Écrire la fonction initReferentiel qui initialise un référentiel avec plusieurs actes.

BZQM001 - Échographie de l'oeil et/ou de l'orbite en mode B

BZQP003 - Biomicroscopie de l'oeil aux ultrasons

BZQK001 - Tomographie de l'oeil par scanographie à cohérence optique

BJQP005 - Vidéonystagmoscopie

Afficher un référentiel
— Écrire la fonction affichReferentiel qui affiche un référentiel.

Rechercher un acte dans le référentiel
— Écrire la fonction chercherActe qui renvoie le libellé d'un acte à partir de son code, null s'il n'existe pas.

Saisir un code d'acte
— Écrire la fonction saisieCodeClavier qui permet de saisir un code d'acte au clavier.

Plusieurs recherches
— Compléter la fonction main pourqu'elle initialise le référentiel et propose à l'utilisateur de faire des recherches en saisissant des codes d'acte au clavier.