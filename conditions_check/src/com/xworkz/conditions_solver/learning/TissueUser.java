package com.xworkz.conditions_solver.learning;

public class TissueUser{
    private Tissue tissue;

    public TissueUser(Tissue tissue) {
        this.tissue = tissue;
    }

    public void useTissue() {
        tissue.apply();
    }
}
