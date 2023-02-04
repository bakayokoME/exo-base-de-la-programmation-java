package TPJeudupendu;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Jeu du pendu");
    // les mots à découvrir
    String [] tMots = { "algorithme","attribut", "javascript", "programmation"};

  }
  
  /*
  fonction motADecouvrir
    données : un tableau de mots -> param -> String []
    résultat : un mot -> valeur de retour -> String
  */
  public static String motADecouvrir(String [] tabMots){
    int index = (int) (Math.random() * tabMots.length-1);
    return tabMots[index];
  }

/*
  fonction crypterMot 
    données : un tableau de mots -> param -> String []
    résultat : tableau -> valeur de retour -> char []
  */

  public static ArrayList<Character> crypterMot(String mot){
    ArrayList<Character> tabCharactere = new ArrayList<>();
    for (int i = 0; i < mot.length(); i++) {
        tabCharactere.add('_');
    }
    return tabCharactere;
  }

  /*
  fonction estDans  
    données : une lettre -> param -> String []
    résultat : boolean -> valeur de retour -> (vrai) ou (faux)
  */

  public static boolean estDans(char lettre, String mot){
    boolean present = false;
        for (int i = 0; i < mot.length(); i++) {
            if(lettre == mot.charAt(i)){
                present =true;
            }}
        return present;

        }

        /*
  fonction actualiserMotCrypte   
    données : une lettre -> param -> String [], motcryper tab charactere, mot string
    résultat : Tableau de charactère -> valeur de retour -> mot crypter actualiser
    je prend si la lettre passer est présente dans le mots, je cherche sa position 
    et je le mets a cette position dans mon tableau 

  */
 public static ArrayList<Character> actualiserMotCrypte(char lettre,ArrayList<Character> motcrypte, String mot){
            for (int i = 0; i < mot.length(); i++) {
                if(lettre == mot.charAt(i)){
                    motcrypte.add(i, lettre);
                } 
            }
            return motcrypte;
 }

 /*
  fonction lettreHasard   
    données : rien -> param -> Rien
    résultat : une lettre  -> valeur de retour -> String
  */

 public static char lettreHasard(){
    char[] tabalpha = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','é','è','à','ù','ç','â','ê','î','ô','û','ë','ï'};
    int index = (int) (Math.random() * tabalpha.length-1);
    return tabalpha[index];
 }

  /*
  fonction afficherMotCrypte    
    données : mot -> param -> string
    résultat : mot   -> valeur de retour -> String
  */
  public static String afficherMotCrypte(String mot){
    return "mot";
  }

    /*
  fonction jouerPartieHasard     
    données : mot -> param -> string
    résultat : mot   -> valeur de retour -> String
    correspond a un solveur 
  */
  public static int jouerPartieHasard (String [] tabMots){
    boolean trouve = false;
    int nb = 0;
    while (trouve) {
        nb+=1;
        String mot = motADecouvrir(tabMots);
        crypterMot(mot);
        char lettre = lettreHasard();
    if (estDans(lettre,mot)){
        String nouveauMot = actualiserMotCrypte(lettre,crypterMot(mot),mot).toString();
        if(nouveauMot == mot){
            trouve=true;
        }
    }
    
    }
    return nb;
  }

  public static char saisieClavier() {
    Scanner sc = new Scanner(System.in);
    System.out.print("un caractère ? : ");
    return sc.next().charAt(0);
    }

 public static int jouerPartieInteractive(String [] tabMots){
    char lettre = saisieClavier();
    boolean trouve = false;
    int nb = 0;
    while (trouve) {
        nb+=1;
        String mot = motADecouvrir(tabMots);
    if (estDans(lettre,mot)){
        String nouveauMot = actualiserMotCrypte(lettre,crypterMot(mot),mot).toString();
        if(nouveauMot == mot){
            trouve=true;
        }
    }
    
    }
    return nb;
 }

 public static int jouerPartieInteractive(String [] tabMots,int nbMax){
    char lettre = saisieClavier();
    boolean trouve = false;
    int nb = 0;
    while (trouve) {
        if(nb == nbMax){
            System.out.println("Nombre d'essaie Max atteint ! ");
        }else{
        nb+=1;
        String mot = motADecouvrir(tabMots);
        if (estDans(lettre,mot)){
            String nouveauMot = actualiserMotCrypte(lettre,crypterMot(mot),mot).toString();
            if(nouveauMot == mot){
                trouve=true;
            }
        }
        
    }
    
    }return nb;

 }


}