package test;

import dominio.*;

public class Ex28_VerificarBonusDoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Ana";
        funcionario.salario = 4000;
        System.out.println(funcionario.calcularBonus(10));
    }
}
