package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
    //Listar todos os ninjas por ID
    public Optional<NinjaModel> todosID(Long id){
        return ninjaRepository.findById(id);
    }
}
