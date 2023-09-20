package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;
import com.algaWords.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);


//        banco.getContas().stream()
//                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
//                .filter(conta -> conta.getNumero() > 200)
//                .sorted(Comparator.comparingInt(Conta::getNumero))
//                .forEach(conta -> {
//                    System.out.printf("Agência: %d / Número da conta: %d / Saldo: = %.2f$%n", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
//                });
    }
}
