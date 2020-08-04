package com.zlancelot.gerenciadordelivros.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zlancelot.gerenciadordelivros.R;
import com.zlancelot.gerenciadordelivros.adapter.LivroAdapter;
import com.zlancelot.gerenciadordelivros.dominio.Livro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.ryclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Livro> listaLivros = new ArrayList<>();

        listaLivros.add(new Livro(1L, "Android para Leigos", "Michel Burton", "Alta Books", false));
        listaLivros.add(new Livro(1L, "Android para Leigos", "Michel Burton", "Alta Books", false));
        listaLivros.add(new Livro(2L, "Android para Programadores", "Paul J, Deitel", "Bookman", true));
        listaLivros.add(new Livro(3L, "Desenvolvimento para Android", "Griffiths, David", "Alta Books", false));
        listaLivros.add(new Livro(4L, "Android Base de Dados", "Queirós, Ricardo", "FCA Editora", true));
        listaLivros.add(new Livro(5L, "Android em Ação", "King, Chris", "Elsevier - Campus", false));
        listaLivros.add(new Livro(5L, "Jogos em Android", "Queirós, Ricardo", "FCA - Editora", true));
        listaLivros.add(new Livro(5L, "Android Essencial com Kotlin", "Ricardo R.", "NOVATEC", false));

        LivroAdapter livroAdapter = new LivroAdapter(listaLivros, this);
        recyclerView.setAdapter(livroAdapter);

    }
}
