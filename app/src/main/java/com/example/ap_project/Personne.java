package com.example.ap_project;

public class Personne {

    private String pseudo;
    private Float taille;
    private Float masse;
    private Float imc;
    private String result;

    public Personne(Float taille, Float masse, String pseudo) {
        this.taille = taille;
        this.masse = masse;
        this.pseudo = pseudo;
    }

    public float calculImc() {

        imc = masse / (taille * taille);
        return imc;
    }


    public String interpretationIMC(){

            imc = calculImc();

            if(imc < 18.5) {
                result = pseudo+", votre imc est de " + imc + ", vous êtes en insuffisance pondérale";
                return result;
            }
            else if  (imc >= 18.5 && imc < 25) {
                result = pseudo+", votre imc est de " + imc + ", vous avez une corpulence normal";
                return result;
            }
            else if(imc >= 25 && imc < 30) {
                result = pseudo+", votre imc est de " + imc + ", vous êtes en obésite normale";
                return result;
            }
            else if(imc >= 30 && imc <= 35) {
                result = pseudo+", votre imc est de " + imc + ", vous êtes en obésite sévère";
                return result;
            }
            else {
                result = pseudo + ", votre imc est de " + imc + ", vous êtes en obésite morbide";
                return result;
            }
        }
    }

