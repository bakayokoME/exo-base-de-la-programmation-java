package ActeMedicaux;
import java.util.HashMap;
import java.util.*;

class Main {
  public static void main(String[] args) {
    HashMap<String,String> reference = new HashMap <String,String>();
    System.out.println("Referentiel d'actes médicaux");
    String code = saisieCodeClavier();
    chercherActe(code);
  }

  /*
  initReferentiel
    */

    public static void initReferentiel(HashMap<String,String> r){
        r.put("BZQM001" , "Échographie de l'oeil et/ou de l'orbite en mode B");
        r.put("BZQP003" , "Biomicroscopie de l'oeil aux ultrasons");
        r.put("BZQK001" , "Tomographie de l'oeil par scanographie à cohérence optique");
        r.put("BJQP005" , "Vidéonystagmoscopie");
    }
       
    public static void affichReferentiel(HashMap<String,String> referenciel ){
        for (Map.Entry r : referenciel.entrySet()) {
            System.out.println(r.getKey());
            System.out.println(r.getValue());
            }
        }

    public static void chercherActe (String code ){
        //difficultés pour recuperer mon tableau
        System.out.println();
        }
    

/*
  saisieCodeClavier 
    */
    public static String saisieCodeClavier (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisisez le code pour voir l'acte : ");
        return sc.next().toString();
    }

    /*
    Plusieurs recherches
    */


 
}
