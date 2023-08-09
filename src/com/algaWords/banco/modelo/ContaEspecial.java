package com.algaWords.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta {
    private BigDecimal valorLimite;


    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal credito) {
        super(titular, agencia, numero);
        this.valorLimite = credito;
    }

    @Override
    public void debilitarTarifaMensal() {
        sacar(new BigDecimal("20"));
    }

    @Override
    public BigDecimal getSaldoDisponivel() {
        return getSaldo().add(getValorLimite());

    }

    public BigDecimal getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }



}
