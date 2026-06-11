package com.crud;

/**
 * Representa una mascota en el sistema.
 */
public final class Pet {

    /**
     * Nombre de la mascota.
     */
    private final String name;

    /**
     * Constructor de la mascota.
     *
     * @param petName el nombre asignado a la mascota
     */
    public Pet(final String petName) {
        this.name = petName;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return el nombre de la mascota
     */
    public String getName() {
        return name;
    }
}
