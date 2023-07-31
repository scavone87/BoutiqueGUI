package com.melfi.boutique;
public class Cassa {
  private double budget;

  public Cassa(double budgetIniziale) {
    this.budget = budgetIniziale;
  }

  // Metodo per vendere un prodotto e aggiornare il budget della Cassa
  public void vendiProdotto(double prezzoFinale) {
    budget += prezzoFinale;
  }

  // Metodo per ottenere il budget corrente della Cassa
  public double getBudget() {
    return budget;
  }
}