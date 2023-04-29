package br.com.uniritter.usandoroom.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.uniritter.usandoroom.model.Contato;

    @Database(entities = {Contato.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract ContatoDao contatoDao();
    }
