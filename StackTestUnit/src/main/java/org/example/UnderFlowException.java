package org.example;

public class UnderFlowException extends Exception{

    public  UnderFlowException(){
       super("Il est impossible de retirer un élément d'une pile vide.");
    }

}
