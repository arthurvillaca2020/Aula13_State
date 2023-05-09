import org.example.Personagem;
import org.example.PersonagemEstadoCombate;
import org.example.PersonagemEstadoMorto;
import org.example.PersonagemEstadoVivo;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    @org.junit.jupiter.api.Test
    public void deveCombaterPersonagemVivo() {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        assertTrue(personagem.Combater());
        assertEquals(PersonagemEstadoCombate.getInstance(), personagem.getEstado());
    }

    @org.junit.jupiter.api.Test
    public void deveContinuarVivoPersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertTrue(personagem.Vivo());
        assertEquals(PersonagemEstadoVivo.getInstance(), personagem.getEstado());
    }

    @org.junit.jupiter.api.Test
    public void deveMorrerPersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertTrue(personagem.Morrer());
        assertEquals(PersonagemEstadoMorto.getInstance(), personagem.getEstado());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarVivoPersonagemVivoForaDeCombate() {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        assertFalse(personagem.Vivo());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarVivoPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Vivo());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarEmCombatePersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertFalse(personagem.Combater());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarEmCombatePersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Combater());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarMortoPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Morrer());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveViverPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Vivo());
    }
}
