package br.com.a2.cosbackend.models;




import jakarta.persistence.*;


@Entity
@Table(name = "banimento")
public class Banimento {

    @Id
    private Integer banimentoKey;
//    private String nome; //todo criar Entity Jogador
//    private String tipoInfracao; //todo criar TipoInfracaoEnum
//    private String tipoBanimento; //todo criar TipoBanimentoEnum
//    private LocalDate inicio;
//    private LocalDate fim;
//    private String moderador; //todo criar Entity Moderador
//    private String descricao;
//
    public Integer getBanimentoKey() {
        return banimentoKey;
    }

    public void setBanimentoKey(Integer banimentoKey) {
        this.banimentoKey = banimentoKey;
    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getTipoInfracao() {
//        return tipoInfracao;
//    }
//
//    public void setTipoInfracao(String tipoInfracao) {
//        this.tipoInfracao = tipoInfracao;
//    }
//
//    public String getTipoBanimento() {
//        return tipoBanimento;
//    }
//
//    public void setTipoBanimento(String tipoBanimento) {
//        this.tipoBanimento = tipoBanimento;
//    }
//
//    public LocalDate getInicio() {
//        return inicio;
//    }
//
//    public void setInicio(LocalDate inicio) {
//        this.inicio = inicio;
//    }
//
//    public LocalDate getFim() {
//        return fim;
//    }
//
//    public void setFim(LocalDate fim) {
//        this.fim = fim;
//    }
//
//    public String getModerador() {
//        return moderador;
//    }
//
//    public void setModerador(String moderador) {
//        this.moderador = moderador;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
}