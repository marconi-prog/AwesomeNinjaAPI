package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import jakarta.persistence.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninjaDTO){
        NinjaDTO ninja = ninjaService.criarNinja(ninjaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso: " + ninja.getNome());
    }

    // Mostrar ninjas (Read)
    @GetMapping("/todos")
    public ResponseEntity <List<NinjaDTO>> listarNinjas(){
         List<NinjaDTO> ninjas = ninjaService.listarNinjas();
         return ResponseEntity.ok(ninjas);
    }
    // Mostrar ninjas por id (Read)
    @GetMapping("/todosID/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        NinjaDTO ninjas = ninjaService.buscarPorId(id);

        if (ninjas != null){
            return ResponseEntity.ok(ninjas);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ninja com o id " + id + " nao existe");
        }
    }

    // Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "alterar ninja por id";
    }
    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID/{id}")
    public ResponseEntity<String> deletarNinjaporId(@PathVariable Long id){
        if (ninjaService.buscarPorId(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " foi deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja com o ID " + id + " nao foi achado");
        }
    }
}