package com.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para las clases Pet y PetService.
 */
public final class PetServiceTest {

    /**
     * Prueba la agregacion de mascotas y la obtencion de su nombre.
     */
    @Test
    public void testAddPetAndGetName() {
        final PetService service = new PetService();
        final Pet myPet = new Pet("Firulais");
        
        service.addPet(myPet);

        assertEquals(1, service.getPets().size());
        assertEquals("Firulais", myPet.getName());
    }

    /**
     * Prueba el borrado de la lista de mascotas.
     */
    @Test
    public void testClearPets() {
        final PetService service = new PetService();
        service.addPet(new Pet("Rex"));
        
        service.clearPets();

        assertEquals(0, service.getPets().size());
    }
}