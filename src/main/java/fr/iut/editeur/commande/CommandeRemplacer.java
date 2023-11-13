package fr.iut.editeur.commande;
import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;start;end;remplacement");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String remplacement = "";
        if(parameters.length > 3) {
            remplacement = parameters[3];
        }
        this.document.remplacer(start, end, remplacement);
        super.executer(); 
    }

    @Override
    public void getDescriptionCommande(){
        System.out.println("Remplace dans le document de start à end par remplacement");
    }


}
