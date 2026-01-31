package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        return ninjaRepository.findAll().stream().map(ninjaMapper::map).toList();
    }
    //Listar todos os ninjas por ID
    public NinjaDTO buscarPorId(Long id) {
       return ninjaRepository.findById(id).map(ninjaMapper::map).orElseThrow(() -> new RuntimeException("Ninja nao encontrado com ID: " + id));
    }
    //Deletar ninjas por id
    public void deletarNinjaPorId(Long id){
        ninjaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ninja nao encontrado com ID: " + id));
        ninjaRepository.deleteById(id);
    }
}
