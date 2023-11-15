package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

        public void testAjouter() {
            Document document = new Document();
            document.ajouter("Hello");
            assertEquals("Hello", document.toString());
        }

        public void testSupprimer() {
            Document document = new Document();
            document.ajouter("Hello");
            document.effacer(0, 2);
            assertEquals("llo", document.toString());
        }

        public void testMajuscule() {
            Document document = new Document();
            document.ajouter("Hello");
            document.majuscules(0, 2);
            assertEquals("HEllo", document.toString());
        }

        public void testMinuscule() {
            Document document = new Document();
            document.ajouter("Hello");
            document.minuscule(0, 2);
            assertEquals("hello", document.toString());
        }
}
