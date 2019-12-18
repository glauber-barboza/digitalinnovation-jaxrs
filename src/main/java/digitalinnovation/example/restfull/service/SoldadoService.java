package digitalinnovation.example.restfull.service;

import digitalinnovation.example.restfull.controller.request.SoldadoEditRequest;
import digitalinnovation.example.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flexa");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e flexa");
        Soldado soldado2 = new Soldado();
        soldado2.setCpf("987654321");
        soldado2.setNome("Paloma");
        soldado2.setRaca("Elfa");
        soldado2.setArma("Arco e flexa");

        return Arrays.asList(soldado1,soldado2);
    }
}
