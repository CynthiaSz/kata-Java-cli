package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here
        Ville v0 = new Ville();
        Ville v1 = new Ville("Marseille", 123456, "France");
        Ville v2 = new Ville("Rio", 321654, "Brésil");

        System.out.println("\n v = "+v0.getNom()+" ville de  "+v0.getNbreHabitants()+ " habitants se situant en "+v0.getNomPays());
        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");


        Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");


        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");



        class Capitale extends Ville {

                private String monument;

                //Constructeur par défaut
                public Capitale(){
                    //Ce mot clé appelle le constructeur de la classe mère
                    super();
                    monument = "aucun";
                }

                //Constructeur d'initialisation de capitale
                public Capitale(String nom, int hab, String pays, String monument){
                    super(nom, hab, pays);
                    this.monument = monument;
                }

                /**
                 * Description d'une capitale
                 * @return String retourne la description de l'objet
                 */
                public String decrisToi(){
                    String str = super.decrisToi() + "\n \t ==>>" + this.monument + "en est un monument";

                    return str;
                }

                /**
                 * @return le nom du monument
                 */
                public String getMonument() {
                    return monument;
                }

                //Définit le nom du monument
                public void setMonument(String monument) {
                    this.monument = monument;
                }

                }
            }
        }
    




