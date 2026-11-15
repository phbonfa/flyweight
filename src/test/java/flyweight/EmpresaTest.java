package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Carlos", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Fernanda", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Ricardo", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Juliana", "Analista de RH", "Recursos Humanos");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Carlos', cargo='Desenvolvedor Backend', departamento='Tecnologia'}",
                "Funcionario{nome='Fernanda', cargo='Desenvolvedor Backend', departamento='Tecnologia'}",
                "Funcionario{nome='Ricardo', cargo='Desenvolvedor Backend', departamento='Tecnologia'}",
                "Funcionario{nome='Juliana', cargo='Analista de RH', departamento='Recursos Humanos'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCargos() {
        Empresa empresa = new Empresa();
        empresa.contratar("Carlos", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Fernanda", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Ricardo", "Desenvolvedor Backend", "Tecnologia");
        empresa.contratar("Juliana", "Analista de RH", "Recursos Humanos");

        assertEquals(2, CargoFactory.getTotalCargos());
    }
}