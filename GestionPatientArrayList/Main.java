package GestionPatientHashSet;
import java.util.*;
class Main {
 public static void main() {
    ArrayList<Patient> tbPatient = new ArrayList<>();
}

        public static void initPatient(ArrayList<Patient> l){
            l.add(new Patient("Dupont","Jean",1.72, 65));
            l.add(new Patient("Durand","Leon",1.78, 85));
            }

        public void afficherPatients (ArrayList<Patient> l){
            for (Patient p : l){
                System.out.println(p);
            }
        }
  
         /*
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */
        public static boolean ajouterPatient (Patient p, ArrayList<Patient> tbPatient){
            boolean ajouter = false;
            if(!tbPatient.contains(p)){
                tbPatient.add(p);
                ajouter = true;
            }
            return ajouter;
        }

        /*
        fonction supprimerPatient 
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */

        public static boolean supprimerPatient (Patient p,ArrayList<Patient> tbPatient){
            boolean supprimer = false;
            if(tbPatient.contains(p)){
                tbPatient.remove(p);
                supprimer=true;
            }
            return supprimer;
        }

         /*
        fonction supprimerPatientsTaille  
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */
        
        public static boolean supprimerPatientsTaille (Patient p,ArrayList<Patient> tbPatient, double referance){
            boolean supprimerptaille = false;
            if(tbPatient.contains(p)){
                if (p.getTaille() < referance) {
                    tbPatient.remove(p);
                    supprimerptaille=true;
                }
                
            }
            return supprimerptaille;
        }
         /*
        fonction poidsMoyen   
        données : un patient -> paramètre -> Patient 
        résultat : int poids moyen -> valeur de retour -> booléen
        */
        public static int poidsMoyen(ArrayList<Patient> p ){
            int nbPatient = 0;
            int poidsTotaldespatient = 0;
            for ( Patient pat : p) {
                poidsTotaldespatient+= pat.getPoids();
                nbPatient += 1;
            }
            int poidsMoy = (poidsTotaldespatient/nbPatient);
            return poidsMoy;
        }

          /*
        fonction listePrenom    
        données : String nom patient -> paramètre -> String 
        résultat : list patient -> valeur de retour -> booléen
        */

        public static ArrayList<Patient> listePrenom(String prenom, ArrayList<Patient> p){
                ArrayList<Patient> tabPatientPrenom = new ArrayList<>();
                for (Patient patient : p) {
                    if(patient.getPrenom() == prenom){
                        tabPatientPrenom.add(patient);
                    }   
                }
                return tabPatientPrenom;
        }




        
}