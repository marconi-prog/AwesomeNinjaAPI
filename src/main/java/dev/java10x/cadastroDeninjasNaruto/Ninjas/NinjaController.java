package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
       return "essa e minha primeira rota";
    }
    // Adicionar ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar ninjas (Read)
    @GetMapping("/todos")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    // Mostrar ninjas por id (Read)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "mostar ninja por id";
    }

    // Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "alterar ninja por id";
    }
    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaporId(){
        return "deletar ninjas por id";
    }
}