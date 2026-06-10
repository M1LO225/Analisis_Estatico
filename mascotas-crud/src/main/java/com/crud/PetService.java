package com.crud;
import java.util.ArrayList;
import java.util.List;

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

    public void clearPets() {
        pets.clear();
    }
}