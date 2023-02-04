package GestionAdn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    System.out.println("de l'ADN !!!");
  
    System.out.println(estACGT('A'));
  
    }
    /*
     données : un caractère -> paramètre -> char 
     résultat : vrai ou faux -> valeur de retour -> booléen
    */
    public static boolean estACGT(char c) {
      return c == 'A' || c == 'C' || c == 'G' || c == 'T';
    }
    /*
     données : une sequence -> paramètre -> String 
     résultat : vrai ou faux -> valeur de retour -> booléen
    */
    public static boolean estADN(String seq) {
      boolean testADN = true;
    
      for (int i = 0; i < seq.length(); i++) {
       if ( estACGT(seq.charAt(i)) == false )  {
          testADN = false; 
        }
      }
  
      return testADN;
    }
     /*
     données : une base -> paramètre -> String 
     résultat : Masse de donnée-> valeur de retour -> String
    */
    public static int masseMolaireBase (char base){
        int A = 135;
        int T = 126;
        int G = 151;
        int C = 111;
        if( base == 'A'){
            return A;
        }else if (base == 'T') {
            return T;            
        } else if (base == 'G') {
            return G;            
        } else if (base == 'C') {
            return C;
        }
        return 0 ;
    }
         /*
        données : une séquence -> paramètre -> String 
        résultat : la Masse total des bases de séquence-> valeur de retour -> int 
        il passe une chaine de carractère je parcour toutes les chaine une à une 
        pour chaque charactère je recupère sa masse quand j'avance j'ajoute le suivant
         */
        public static String masseMolaire (String seq){
            int MasseTotal = 0;
            for (int i = 0; i < seq.length(); i++) {
                  MasseTotal += masseMolaireBase(seq.charAt(i));
            }
            return MasseTotal +" g/mol" ;
        }

        /*
        données : une Base -> paramètre -> charactere 
        résultat : le Complémentaire de la base de séquence-> valeur de retour -> charactere 
       
         */

        public static char complementaireBase (char base){
            if(base == 'A'){
                return 'T';
            } else if (base == 'G') {
                return 'C';            
            }
            return '0';
        }

        /*
        données : un brin d'ADN -> paramètre -> String 
        résultat : brin Complémentaire du brin-> valeur de retour -> String 
         */

         public static String brinComp (String b){
            String brinComp = "";
            for(int i = 0; i < b.length() ; i++){
                brinComp += complementaireBase(b.charAt(i));
            }
            return brinComp; 
         }

         /*
        données : deux chaine de charachere (des brin d'ADN)  -> paramètre -> String 
        résultat : vrai ou faux -> valeur de retour -> booléen
        renvoie vrai si on parcour le premier  si ses éléments sont dans le deuxieme 
        égale à la première 
         */
        
         public static boolean sousSequence(String brin1, String brin2){
                 return brin2.contains((brin1));
         }

         /*
        données : aucune 
        résultat : renvoie de manière aléatoire l'une des 4 nucléotides 
         */
        public static char nucleideHasard (){
            char [] tabnucleid =  new char []{'A','C','G','T'};
            int index = (int) (Math.random() * tabnucleid.length-1); 
            return tabnucleid[index];
        }

         /*
        données : la longeur n => entier   
        résultat : renvoie une séquence d'adn
         */

         public static String genererSequenceADN (int n){
            if (n > 4){
                System.out.println("Attention la séquence doit etre uniquement composé de 4 nucléodites ! ");
            }
            String sequenceADN = "";
            for (int i = 0; i < n; i++) {
                sequenceADN += nucleideHasard();
            }
            return sequenceADN;
         }

          /*
        données : séquence d'ADN -> String   
        résultat : renvoie une liste contenant 
        la place de tous les codons ATG trouvé
        sinon on renvoie une Liste Vide 
         */

         public static ArrayList<Integer> codonsStart (String seq){
            int i = 0;
            ArrayList<Integer> listdePlace = new ArrayList<>();
            for (String start = "ATG"; seq.contains(start); i++) {
                    listdePlace.add(i);
                }
                return listdePlace;
            }

         /*
        données : séquence d'ADN (String) et l'indice du début d'un codons start -> (int)   
        résultat : boolean (vrai) ou (faux)
         */
        public static boolean codonStop(String seq, int ind){
                boolean trouveCodonStop = false;
                //je n'y arrive pas 
                return trouveCodonStop;

        }
                
}

    