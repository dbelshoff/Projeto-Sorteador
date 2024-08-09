package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlayer")
    private Long id;

    @Column(name = "nomePlayer")
    private String nomePlayer;

    @Column(name = "fonePlayer")
    private String fonePlayer;

    @Column(name = "numero1")
    private Integer numero1;

    @Column(name = "numero2")
    private Integer numero2;

    @Column(name = "numero3")
    private Integer numero3;

    @Column(name = "numero4")
    private Integer numero4;

    @Column(name = "numero5")
    private Integer numero5;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nomePlayer
     */
    public String getNomePlayer() {
        return nomePlayer;
    }

    /**
     * @param nomePlayer the nomePlayer to set
     */
    public void setNomePlayer(String nomePlayer) {
        this.nomePlayer = nomePlayer;
    }

    /**
     * @return String return the fonePlayer
     */
    public String getFonePlayer() {
        return fonePlayer;
    }

    /**
     * @param fonePlayer the fonePlayer to set
     */
    public void setFonePlayer(String fonePlayer) {
        this.fonePlayer = fonePlayer;
    }

    /**
     * @return Integer return the numero1
     */
    public Integer getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return Integer return the numero2
     */
    public Integer getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return Integer return the numero3
     */
    public Integer getNumero3() {
        return numero3;
    }

    /**
     * @param numero3 the numero3 to set
     */
    public void setNumero3(Integer numero3) {
        this.numero3 = numero3;
    }

    /**
     * @return Integer return the numero4
     */
    public Integer getNumero4() {
        return numero4;
    }

    /**
     * @param numero4 the numero4 to set
     */
    public void setNumero4(Integer numero4) {
        this.numero4 = numero4;
    }

    /**
     * @return Integer return the numero5
     */
    public Integer getNumero5() {
        return numero5;
    }

    /**
     * @param numero5 the numero5 to set
     */
    public void setNumero5(Integer numero5) {
        this.numero5 = numero5;
    }

}
