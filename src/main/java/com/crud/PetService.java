package com.crud;


import java.util.*; 

public class PetService {
    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
        String variableInutil = "No me usan";
        try {
            int x = 1 / 1;
        } catch (Exception e) {

        }
    }

    public List<Pet> getPets() {
        return pets;
    }


    public void ESTE_METODO_ESTA_MAL_NOMBRADO() {
        pets.clear();
    }

    String lineaLarguisima = "Esta linea es absurdamente larga a proposito para que Checkstyle se queje de que superamos los cien caracteres permitidos por el estandar de Google y nos marque un error rojo gigante en la consola";
}