package com.contabanco.contabanco.model;

import jakarta.persistence.*;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String numero;
    private String agencia;
    private String titular;
    private Double saldo;

    //construtores

    public Conta(){}

    public Conta(String numero, String agencia, String titular, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters
    public Long getId(){
        return id;
    }

    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
