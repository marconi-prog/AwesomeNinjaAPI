package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgurl(ninjaDTO.getImgurl());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();

        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setImgurl(ninjaModel.getImgurl());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());

        return ninjaDTO;
    }
    public void update(NinjaModel ninja, NinjaDTO dto) {
        ninja.setNome(dto.getNome());
        ninja.setEmail(dto.getEmail());
        ninja.setImgurl(dto.getImgurl());
        ninja.setIdade(dto.getIdade());
        ninja.setMissoes(dto.getMissoes());
    }

}
