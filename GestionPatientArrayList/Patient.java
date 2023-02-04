package GestionPatien;
public class Patient implements Comparable<Patient> {

    private String nom;
    private String prenom;
    private double taille;
    private int poids;
    // constructeur
    public Patient(String nom, String prenom, double taille, int poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
    }
    // getters
    public String getNom() {
      return nom;
    }
    public String getPrenom() {
      return prenom;
    }
    public double getTaille() {
      return taille;
    }
    public int getPoids() {
      return poids;
    }
    // conversion de l'objet en chaine
    public String toString() {
        return nom + " " + prenom + " ( taille : " + taille + " poids : " + poids+" )";
    }
    // calcul du hash code
    @Override
    public int hashCode() {
      return nom.hashCode() * prenom.hashCode() * (int)(taille*100);
    }
    // définir comment 2 patients sont "égaux"
    @Override
    public boolean equals(Object obj) {
      if (obj == null) return false;
      if( ! (obj instanceof Patient) ) return false;

      Patient other = (Patient) obj;
      return (this.nom !=null ? this.nom.equals(other.nom) : this.nom == other.nom) && (this.prenom !=null ? this.prenom.equals(other.prenom) : this.prenom == other.prenom) && ( this.taille == other.taille) && ( this.poids == other.poids)  ;
    }
    // définir une relation d'ordre en 2 patients
    // pour les algos de tri
    @Override
    public int compareTo(Patient p) {
    // plusieurs critères de tri possible
    // par nom
     /* if (nom.equals(p)) return 0;
      return nom.compareTo(p.nom);*/

    // par taille
      int res = 0;
      if (taille < p.taille ) res = 1;
      if (taille > p.taille ) res = -1;
      return res;
    }
}