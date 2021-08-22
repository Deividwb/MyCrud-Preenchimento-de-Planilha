package com.dwb.meustestes;

public class Funcionario {
    String nome;
    Horario horario;

    public Funcionario() {
    }

    public Funcionario(String nome, Horario horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", horario=" + horario +
                '}';
    }
}
