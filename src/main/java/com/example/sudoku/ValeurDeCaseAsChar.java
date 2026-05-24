package com.example.sudoku;

import fr.miageamiens.isi05.sudoku.modele.ValeurDeCase;

public class ValeurDeCaseAsChar implements ValeurDeCase {

    private final char valeur;

    public ValeurDeCaseAsChar(char valeur) {
        if (valeur < '1' || valeur > '9') {
            throw new IllegalArgumentException("Valeur invalide : " + valeur);
        }
        this.valeur = valeur;
    }

    public char getChar() {
        return valeur;
    }

    @Override
    public String toString() {
        return String.valueOf(valeur);
    }
}