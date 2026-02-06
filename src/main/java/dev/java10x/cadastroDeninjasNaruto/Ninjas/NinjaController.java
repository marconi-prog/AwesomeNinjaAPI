package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.Id;
import lombok.Value;
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
    @Operation(
            summary = "cria um novo ninja",
            description = "rota cria um novo ninja e insere no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ninja criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "erro Na criacao do ninja")
    })
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninjaDTO){
        NinjaDTO ninja = ninjaService.criarNinja(ninjaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso: " + ninja.getNome());
    }

    // Mostrar ninjas (Read)
    @GetMapping("/todos")
    @Operation(summary = "lista todos os ninjas", description = "lista todos os ninjas do banco de dados")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninjas encontrados"),
            @ApiResponse(responseCode = "404", description = "ninjas nao encontrados")
    })
    public ResponseEntity <List<NinjaDTO>> listarNinjas(){
         List<NinjaDTO> ninjas = ninjaService.listarNinjas();
         return ResponseEntity.ok(ninjas);
    }
    // Mostrar ninjas por id (Read)
    @GetMapping("/todosID/{id}")
    @Operation(
            summary = "lista todos o ninja pelo id",
            description = "rota lista um ninja pelo seu id")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja encontrado"),
            @ApiResponse(responseCode = "404", description = "ninja nao encontrado")
    })
    public ResponseEntity<NinjaDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(ninjaService.buscarPorId(id));
    }


    @PatchMapping("/alterar/{id}")
    @Operation(
            summary = "Alterar parcialmente um ninja",
            description = "Atualiza apenas os campos informados do ninja"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos")
    })
    public ResponseEntity<NinjaDTO> alterarNinjasPorId(
            @PathVariable Long id,
            @RequestBody NinjaDTO ninjaDTO
    ) {
        NinjaDTO ninjaAtualizado = ninjaService.atualizarParcial(id, ninjaDTO);
        return ResponseEntity.ok(ninjaAtualizado);
    }

    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID/{id}")
    @Operation(
            summary = "deleta ninjas pelo id",
            description = "rota deleta o ninja pelo id")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "ninja deletado com sucesso"),
            @ApiResponse(responseCode = "400", description = "ninja nao foi deletado")
    })
    public ResponseEntity<String> deletarNinjaporId(@PathVariable Long id){
        if (ninjaService.buscarPorId(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " foi deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja com o ID " + id + " nao foi achado");
        }
    }
}