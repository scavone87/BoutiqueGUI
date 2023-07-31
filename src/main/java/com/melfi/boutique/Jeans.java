package com.melfi.boutique;

public class Jeans extends Prodotto {
  private String taglia;
  private String colore;
  private int numeroTasche;

  public Jeans(double prezzoDiListino, double scontoPercentuale, String nomeProdotto, String taglia, String colore,
      int numeroTasche) {
    super(prezzoDiListino, scontoPercentuale, nomeProdotto);
    this.taglia = taglia;
    this.colore = colore;
    this.numeroTasche = numeroTasche;
  }

  public String getTaglia() {
    return taglia;
  }

  public String getColore() {
    return colore;
  }

  public int getNumeroTasche() {
    return numeroTasche;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("---- Jeans: ----\n");
    sb.append("Taglia: ").append(this.taglia).append("\n");
    sb.append("Colore: ").append(this.colore).append("\n");
    sb.append("# Tasche: ").append(this.numeroTasche).append("\n");
    return sb.toString();
  }
}