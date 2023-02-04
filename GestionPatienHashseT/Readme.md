Gestion de patients
Le but du TP est de gérer une liste de patients en utilisant une collection de type tableau dynamique ArrayList.

Un patient est caractérisé par son nom, son prenom, sa taille et son poids.

La syntaxe : Patient p = new Patient("Dupont","Jean",1.72, 65)
permet de créer un nouveau patient.
les fonctions/méthodes p.getNom(), p.getPrenom(), p.getTaille(), p.getPoids() permettent de récupérer chacune des propriétés.

Initialiser une liste de patients
— Écrire la fonction initPatients qui initialise une liste avec plusieurs patients.

Affichage des patients
— Écrire la fonction afficherPatients qui affiche une liste de patients.

Ajouter un patient
— Écrire la fonction ajouterPatient qui permet d'ajouter un patient à une liste (en vérifiant qu'il n'est pas déjà présent).
La fonction renverra vrai ou faux selon que l'ajout a été fait ou pas.

Supprimer un patient
— Écrire la fonction supprimerPatient qui permet de supprimer un patient d'une liste (en vérifiant qu'il soit présent).
La fonction renverra vrai ou faux selon que la suppression a été faite ou pas.

Supprimer des patients ayant une taille inférieure à un valeur donnée
— Écrire la fonction supprimerPatientsTaille qui permet de supprimer des patients d'une liste (ceux qui ont taille inférieure à la référence). Il ne faut pas créer une nouvelle liste mais modifier la liste donnée.

Poids moyen
— Écrire la fonction poidsMoyen qui permet de calculer le poids moyen des patients d'une liste)

Liste des patients portant un prénom donné
— Écrire la fonction listePrenom qui construit une nouvelle liste de patients, ceux portant un prenom donné.