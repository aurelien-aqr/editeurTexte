package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace le texte entre start et end par le texte de remplacement
     * @param start
     * @param end
     * @param remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscule le texte entre start et end
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toUpper = texte.substring(start, end).toUpperCase();
        texte = leftPart + toUpper + rightPart;
    }
    public void minuscule(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toLower = texte.substring(start, end).toLowerCase();
        texte = leftPart + toLower + rightPart;
    }
    public void effacer(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + rightPart;
    }
    public void clear() {
        texte = "";
    }

    public void inserer(String ajout, int debut){

        String fin = texte.substring(debut);
        texte = texte.substring(0,debut);
        texte += ajout + fin;
    }
}
