package com.example.sudoku;

import fr.miageamiens.isi05.sudoku.modele.Grille;
import fr.miageamiens.isi05.sudoku.solver.Solver;
import fr.miageamiens.isi05.sudoku.solver.SolverException;

public class SimpleSolver implements Solver {

    @Override
    public boolean solve(final Grille grille)
            throws SolverException {

        if (grille == null) {
            throw new SolverException(
                    new IllegalArgumentException(
                            "La grille ne peut pas être nulle"));
        }

        return grille.isComplete();
    }
}