package fr.iut.editeur.commande;
import fr.iut.editeur.document.Document;

/**
 * CommandeMajuscules
 */
public class CommandeMajuscules extends CommandeDocument {

        public CommandeMajuscules(Document document, String[] parameters) {
            super(document, parameters);
        }

        @Override
        public void executer() {
            if(parameters.length < 3) {
                System.err.println("Format attendu : majuscules;start;end");
                return;
            }
            int start = Integer.parseInt(parameters[1]);
            int end = Integer.parseInt(parameters[2]);
            this.document.majuscules(start, end);
            super.executer();
        }

        @Override
        public void getDescriptionCommande(){
            System.out.println("Mets en majuscules dans le document de start à end");
        }
}
