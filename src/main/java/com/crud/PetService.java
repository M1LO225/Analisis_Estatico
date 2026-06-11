package com.crud;

import java.util.ArrayList;
import java.util.List;

/**
 * Servicio para gestionar las operaciones CRUD de las mascotas.
 */
public final class PetService {

    /**
     * Lista interna para almacenar las mascotas.
     */
    private final List<Pet> pets = new ArrayList<>();

    /**
     * Agrega una nueva mascota a la lista.
     *
     * @param pet la mascota a agregar
     */
    public void addPet(final Pet pet) {
        pets.add(pet);
    }

    /**
     * Obtiene la lista de mascotas registradas.
     *
     * @return la lista de mascotas
     */
    public List<Pet> getPets() {
        return pets;
    }

    /**
     * Elimina todas las mascotas de la lista.
     */
    public void clearPets() {
        pets.clear();
    }
}
