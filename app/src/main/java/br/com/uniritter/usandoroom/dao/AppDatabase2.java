package br.com.uniritter.usandoroom.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.uniritter.usandoroom.model.Contato;


    @Database(entities = {Contato.class}, version = 3)
    public abstract class AppDatabase2 extends RoomDatabase {
        public abstract ContatoDao contatoDao();
    }
