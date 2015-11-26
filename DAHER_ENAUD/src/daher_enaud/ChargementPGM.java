/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daher_enaud;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe permettant de charger une partie à partir d'un fichier de sauvegarde
 *
 * @author Hicham DAHER et Victor ENAUD
 */
public class ChargementPGM {

    private String source;
    private PGM myPGM;

    /**
     * Permet de charger le PGM. Elle va faire appel à une méthode chargement
     * qui va parcourir le PGM. On vérifiera ainsi la compatibilité du fichier
     * et on récupérera les propriétés utiles à l'image (taille et niveaux de
     * gris).
     *
     * @param source la source de PGM
     */
    public ChargementPGM(String source) {
        this.source = source;
        chargement();
    }

    private void chargement() {
        int largeur = 0;
        int hauteur = 0;
        int[][] image = new int[0][0]; // initialisation de base pour l'image
        String commentaires = "#";

        String ligne = "";
        String delimiteurs = " ";
        BufferedReader fichier = null;
        try { // vérifie que le fichier source existe bien
            fichier = new BufferedReader(new FileReader(source));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur, fichier non trouvé !");
        }
                
        try {
            ligne = fichier.readLine();
            StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteurs);
            String mot = tokenizer.nextToken();
            
            // Vérification de la conformité du PGM
            if (!mot.equals("P2")){
                //TODO Générer une exception 
            }
            
            // Gestion des commentaires
            ligne = fichier.readLine();
            tokenizer = new StringTokenizer(ligne, delimiteurs);
            mot = tokenizer.nextToken();
            if (!mot.equals("#")){
                //TODO Générer une exception
            }
            this.myPGM.setCommentaires(ligne);
            
            // Gestion des dimensions
            ligne = fichier.readLine();
            mot = tokenizer.nextToken();
            largeur = parseInt(mot);
            mot = tokenizer.nextToken();
            hauteur = parseInt(mot);
            image = new int[largeur][hauteur];
            
            // Gestion de la teinte maxi
            mot = tokenizer.nextToken();
            int teinteMaxi = parseInt(mot);
            this.myPGM.setTeinteMaxi(hauteur);
            
            // Gestion des éléments du tableau
            ligne = fichier.readLine();
            
            for (int i=0;i<hauteur;i++){
                tokenizer = new StringTokenizer(ligne, delimiteurs);
                mot = tokenizer.nextToken();
                int valeur = parseInt(mot); // conversion en entier du mot
                for (int j=0;j<largeur;j++){
                    this.myPGM.setImageCoordonnees(j, i, valeur);
                }
                ligne = fichier.readLine();
            }

            
            fichier.close();
   
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.myPGM.setImage(image);
        this.myPGM.setCommentaires(commentaires);
        
    }
}
