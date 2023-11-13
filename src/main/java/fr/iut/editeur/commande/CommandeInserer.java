package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length != 3) {
            System.err.println("Format attendu : inserer;ajout;debut");
            return;
        }

        int start = Integer.parseInt(parameters[2]);
        this.document.inserer(parameters[1], start);
        super.executer();
    }

    @Override
    public void getDescriptionCommande(){
        System.out.println("Insère du texte au document à partir de la position start");
    }
}
