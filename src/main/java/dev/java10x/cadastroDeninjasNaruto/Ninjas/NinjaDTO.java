package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import dev.java10x.cadastroDeninjasNaruto.Missoes.MissoesModel;
public class NinjaDTO {

    private long id;
    private String nome;
    private String email;
    private String imgurl;
    private int idade;
    private MissoesModel missoes;

    public NinjaDTO(long id, String nome, String email, String imgurl, int idade, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.imgurl = imgurl;
        this.idade = idade;
        this.missoes = missoes;
    }

    public NinjaDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
}