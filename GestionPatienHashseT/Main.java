package GestionPatienArrayList;
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Collections");
    
        HashSet<Patient> ens1Patients = new HashSet<Patient>();
    
      }

        public static void initPatient( HashSet<Patient>  l){
            l.add(new Patient("Dupont","Jean",1.72, 65));
            l.add(new Patient("Durand","Leon",1.78, 85));
            }

        public void afficherPatients (HashSet<Patient> l){
            for (Patient p : l){
                System.out.println(p);
            }
        }
  
         /*
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */
        public static boolean ajouterPatient (Patient p, HashSet<Patient> ens1Patients){
            boolean ajouter = false;
            if(!ens1Patients.contains(p)){
                ens1Patients.add(p);
                ajouter = true;
            }
            return ajouter;
        }

        /*
        fonction supprimerPatient 
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */

        public static boolean supprimerPatient (Patient p,HashSet<Patient> ens1Patients){
            boolean supprimer = false;
            if(ens1Patients.contains(p)){
                ens1Patients.remove(p);
                supprimer=true;
            }
            return supprimer;
        }

         /*
        fonction supprimerPatientsTaille  
        données : un patient -> paramètre -> Patient 
        résultat : vrai ou faux -> valeur de retour -> booléen
        */
        
        public static boolean supprimerPatientsTaille (Patient p,HashSet<Patient> ens1Patients, double referance){
            boolean supprimerptaille = false;
            if(ens1Patients.contains(p)){
                if (p.getTaille() < referance) {
                    ens1Patients.remove(p);
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
        public static int poidsMoyen(HashSet<Patient> ens1Patients){
            int nbPatient = 0;
            int poidsTotaldespatient = 0;
            for ( Patient pat : ens1Patients) {
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

        public static HashSet<Patient>  listePrenom(String prenom, HashSet<Patient> ens1Patients){
            HashSet<Patient>  tabPatientPrenom = new HashSet<>();
                for (Patient patient : ens1Patients) {
                    if(patient.getPrenom() == prenom){
                        tabPatientPrenom.add(patient);
                    }   
                }
                return tabPatientPrenom;
        }
        /*
        fonction Union    
        */

        public static void union(Set<String> p1,Set<String> p2 ){
            p1.addAll(p2);
            System.out.println("S1 union S2" + p1.addAll(p2));
        }


        /*
        fonction Intersection    
        */

        public static void Intersection(Set<String> p1,Set<String> p2 ){
            p1.retainAll(p2);
            System.out.println("S1 union S2" + p1.retainAll(p2));
        }

         /*
        fonction difference    
        */

        public static void difference(Set<String> p1,Set<String> p2 ){
            p1.removeAll(p2);
            System.out.println("S1 union S2" + p1.removeAll(p2));
        }

        /*
        fonction initPatientTree    
        */
        // Besoin d'indication 
        public static void initPatientsTree (Set<String> p1,Set<String> p2 ){
            //
        }





        
}