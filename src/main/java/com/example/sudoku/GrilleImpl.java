package com.example.sudoku;

import java.util.Arrays;
import java.util.Collection;
import fr.miageamiens.isi05.sudoku.modele.exceptions.HorsBornesException;
import fr.miageamiens.isi05.sudoku.modele.exceptions.GrilleException;
import fr.miageamiens.isi05.sudoku.modele.Grille;
import fr.miageamiens.isi05.sudoku.modele.ValeurDeCase;


public class GrilleImpl implements Grille {

    private static final int DIMENSION = 9;
    private static final int SOUS_DIMENSION = 3;

    private final ValeurDeCase[][] grille;

    public GrilleImpl() {
        grille = new ValeurDeCase[DIMENSION][DIMENSION];
    }

    public GrilleImpl(final int taille) {
        this();
    }

    public int getTaille() {
        return DIMENSION;
    }

    @Override
    public int getDimension() {
        return DIMENSION;
    }

    @Override
    public int getSousDimension() {
        return SOUS_DIMENSION;
    }

  @Override
public ValeurDeCase getValeur(final int x,
                              final int y)
        throws HorsBornesException {

    checkBounds(x, y);
    return grille[x][y];
}

@Override
public void setValeur(final int x,
                      final int y,
                      final ValeurDeCase valeur)
        throws HorsBornesException {

    checkBounds(x, y);
    grille[x][y] = valeur;
}
    @Override
    public boolean isPossible(final int x,
                              final int y,
                              final ValeurDeCase valeur) {

        return true;
    }

    @Override
    public boolean isValeurInitiale(final int x,
                                    final int y) {

        return false;
    }

    @Override
    public boolean isComplete() {

        for (int i = 0; i < DIMENSION; i++) {

            for (int j = 0; j < DIMENSION; j++) {

                if (grille[i][j] == null) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
public Collection<ValeurDeCase> getValeursAutorisees() {
    return Arrays.asList(
        new ValeurDeCaseAsChar('1'),
        new ValeurDeCaseAsChar('2'),
        new ValeurDeCaseAsChar('3'),
        new ValeurDeCaseAsChar('4'),
        new ValeurDeCaseAsChar('5'),
        new ValeurDeCaseAsChar('6'),
        new ValeurDeCaseAsChar('7'),
        new ValeurDeCaseAsChar('8'),
        new ValeurDeCaseAsChar('9')
    );
}

 private void checkBounds(final int x,
                         final int y)
        throws HorsBornesException {

    if (x < 0 || x >= DIMENSION
            || y < 0 || y >= DIMENSION) {

        throw new HorsBornesException(
                "Coordonnees invalides");
    }
}
public GrilleImpl(ValeurDeCase[][] contenu) {

    this();

    for (int i = 0; i < DIMENSION; i++) {
        for (int j = 0; j < DIMENSION; j++) {
            grille[i][j] = contenu[i][j];
        }
    }
}
}
