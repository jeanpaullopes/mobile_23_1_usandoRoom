package br.com.uniritter.usandoroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;


import br.com.uniritter.usandoroom.dao.AppDatabase2;
import br.com.uniritter.usandoroom.dao.ContatoDao;
import br.com.uniritter.usandoroom.model.Contato;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase2 db = Room.databaseBuilder(this, AppDatabase2.class, "banco-contatos")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        ContatoDao contatoDao = db.contatoDao();
        Contato c = new Contato(0,"jean","lopes","jean.lopes@ulife.com.br","99999.9999");
        contatoDao.insertAll(new Contato[]{c});
        Log.d("TAG", "onCreate: "+contatoDao.getAll());
        //Services.getAllContatos(this);

    }
}