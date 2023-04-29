package br.com.uniritter.usandoroom.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import br.com.uniritter.usandoroom.model.Contato;

@Dao
public interface ContatoDao {
    @Query("SELECT * FROM contato")
    List<Contato> getAll();

    @Query("SELECT * FROM contato WHERE id IN (:contatoIds)")
    List<Contato> loadAllByIds(int[] contatoIds);

    @Query("SELECT * FROM contato WHERE nome LIKE :first AND " +
            "sobre_nome LIKE :last LIMIT 1")
    Contato findByName(String first, String last);

    @Insert
    void insertAll(Contato... contatos);

    @Delete
    void delete(Contato contato);
}
