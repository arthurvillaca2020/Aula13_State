package org.example;

public class PersonagemEstadoMorto extends PersonagemEstado{
    private PersonagemEstadoMorto() {};

    private static PersonagemEstadoMorto instance = new PersonagemEstadoMorto();
    public static PersonagemEstadoMorto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Morto";
    }
}
