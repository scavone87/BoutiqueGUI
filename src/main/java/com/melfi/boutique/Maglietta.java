package com.melfi.boutique;

public class Maglietta extends Prodotto {
  private String taglia;
  private String colore;
  private String materiale;

  public Maglietta(double prezzoDiListino, double scontoPercentuale, String nomeProdotto, String taglia, String colore,
      String materiale) {
    super(prezzoDiListino, scontoPercentuale, nomeProdotto);
    this.taglia = taglia;
    this.colore = colore;
    this.materiale = materiale;
  }

  public String getTaglia() {
    return taglia;
  }

  public String getColore() {
    return colore;
  }

  public String getMateriale() {
    return materiale;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("---- Maglietta: ----\n");
    sb.append("Taglia: ").append(this.taglia).append("\n");
    sb.append("Colore: ").append(this.colore).append("\n");
    sb.append("Materiale: ").append(this.materiale).append("\n");
    return sb.toString();
  }

}