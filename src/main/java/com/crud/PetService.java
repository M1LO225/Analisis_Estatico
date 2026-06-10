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
            // PMD odia los catch vacíos
        }
    }

    public List<Pet> getPets() {
        return pets;
    }


    public void ESTE_METODO_ESTA_MAL_NOMBRADO() {
        pets.clear();
    }
}