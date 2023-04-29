package br.com.uniritter.usandoroom.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity
public class Contato {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    @ColumnInfo(name="nome")
    private String nome;
    @ColumnInfo(name="sobre_nome")
    private String sobreNome;
    @ColumnInfo(name="email")
    private String email;
    @ColumnInfo(name="fone")
    private String fone;

    public Contato() {

    }

    public Contato(Integer id, String nome, String sobreNome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.fone = fone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
