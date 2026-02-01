package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {


    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar ninja (Create)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO){
        return ninjaService.criarNinja(ninjaDTO);
    }

    // Mostrar ninjas (Read)
    @GetMapping("/todos")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    // Mostrar ninjas por id (Read)
    @GetMapping("/todosID/{id}")
    public NinjaDTO buscarPorId(@PathVariable Long id){
        return ninjaService.buscarPorId(id);
    }

    // Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "alterar ninja por id";
    }
    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID/{id}")
    public void deletarNinjaporId(@PathVariable Long id){
       ninjaService.deletarNinjaPorId(id);
    }
}