Gestion de l'ADN
On représente un brin d’ADN par une chaîne de caractères qui peut contenir quatre caractères différents (les 4 nucléotides) :

’A’ (Adénine),
’C’ (Cytosine),
’G’ (Guanine)
et ’T’ (Thymine).

base A,C,G ou T ?
— Écrire la fonction ACGT qui prend en paramètre un caractère et renvoie vrai si ce caractère correspond à une des 4 bases, faux sinon.

ADN ?
— Écrire la fonction estADN qui prend en paramètre une chaîne de caractères et renvoie vrai si cette chaîne correspond à un brin d’ADN, faux sinon.

Par exemple,
estADN("TTGAC") et estADN("GCAATAG") renvoient true mais estADN("AMOG") et estADN("CaTg") renvoient false.

Masse molaire ?
— Ecrire la fonction masseMolaireBase qui retourne la masse molaire d'une base passée en argument.

Chaque base a une masse donnée :

’A’ (135 g/mol)
’T’ (126 g/mol)
’G’ (151 g/mol)
’C’ ( 111 g/mol).
— Ecrire la fonction masseMolaire qui calcule la masse molaire d’une séquence ADN passée en argument.

La masse totale est la somme des masses des bases de la séquence.

Par exemple :
masseMolaire("AGATC") renvoie (135 + 151 + 135 + 126 + 111) g/mol, c’est-à-dire 658 g/mol.

Base complémentaire ?
Chaque base possède une base complémentaire avec laquelle elle peut s’associer :
’A’ et ’T’ sont complémentaires,
et ’C’ et ’G’ sont complémentaires.

-Écrire la fonction complementaireBase qui renvoie la base complémentaire d'une base passée en argument.

-Écrire la fonction brinComp qui étant donné un brin d’ADN b calcule et renvoie son brin complémentaire, c’est à dire le brin constitué des bases complémentaires de b.

Par exemple, brinComp("A") renvoie "T" et brinComp("AAGT") renvoie "TTCA".

Sous-séquence ?
— Écrire la fonction sousSequence qui prend en argument deux chaînes de caractères représentant des brins d’ADN et renvoie true si le premier brin est une sous-séquence du deuxième (c’est à dire sion trouve exactement une partie de deuxième brin qui est égale au premier brin), et qui renvoie false sinon.

Par exemple,
sous_sequence("ATC", "GGTATCG") renvoie true et sous_sequence("GC", "AAT") renvoie false.

Générer une séquence ADN ?
— Écrire la fonction nucleideHasard qui prenvoie de manière aléatoire une des 4 nucléotides A,C,G,T.

Remarque : la foncion java Math.random() permet de générer un nb aléatoire entre 0 et 1.

— Écrire la fonction genererSequenceADN qui permet de créer aléatoirement une séquence ADN de laongueur n. Pour que la séquence soit correcte, elle doit être composée uniquement des 4 nucléotides A,C,G,T.

Région codante ?
Une région codante est une succession de codons (triplet de nucléotides) non-chevauchants qui commence par un triplet ATG (appelé codon start) et s’achève par l’un des trois triplets TAA, TAG ou TGA (appelés codons stop).

Exemple :Ceci est un exemple d’imageIl y a deux régions codantes. Dans la première, le deuxième codon ATG(*) n’est pas un codon start car il n’est pas précédé d’un codon stop.

Une région codante est composée d’un nombre entier de codons.

-Écrire la fonction codonsStart prenant en entrée une séquence d’ADN et renvoyant une liste contenant la place de tous les codons ATG trouvés (on donnera la place du A). Si aucun codon ATG n’est trouvé, la fonction doit renvoyer une liste vide.

-Écrire la fonction codonStop prenant en entrée une séquence d’ADN et l’indice i du début d’un codon start et renvoyant l’indice du premier codon stop (TAA, TAG ou TGA) suivant celui-ci. Les codons start et stop doivent être en phase, c’est -à-dire séparés par un nombre de nucléotides multiple de 3. Si aucun codon stop n’est trouvé, la fonction doit renvoyer faux.