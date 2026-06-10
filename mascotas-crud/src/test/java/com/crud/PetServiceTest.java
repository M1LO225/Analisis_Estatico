package com.crud;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetServiceTest {
    @Test
    public void testAddPet() {
        PetService service = new PetService();
        service.addPet(new Pet("Firulais"));
        assertEquals(1, service.getPets().size());
    }
}