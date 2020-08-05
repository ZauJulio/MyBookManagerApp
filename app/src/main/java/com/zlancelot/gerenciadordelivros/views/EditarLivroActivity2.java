package com.zlancelot.gerenciadordelivros.views;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.zlancelot.gerenciadordelivros.R;
import com.zlancelot.gerenciadordelivros.data.LivroDAO;
import com.zlancelot.gerenciadordelivros.dominio.Livro;

public class EditarLivroActivity2 extends AppCompatActivity {

    private EditText edt_titulo;
    private EditText edt_autor;
    private EditText edt_editora;
    private CheckBox chk_emprestado;

    private LivroDAO livroDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_livro2);

        edt_titulo = findViewById(R.id.edit_titulo);
        edt_autor = findViewById(R.id.edit_autor);
        edt_editora = findViewById(R.id.edit_editora);
        chk_emprestado = findViewById(R.id.check_emprestado);

        livroDAO = LivroDAO.getInstance(this);
    }

    public void cancelar(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void processar(View view) {
        String titulo = edt_titulo.getText().toString();
        String autor = edt_autor.getText().toString();
        String editora = edt_editora.getText().toString();
        int emprestado = (chk_emprestado.isChecked()) ? 1 : 0;

        Livro livro = new Livro(titulo, autor, editora, emprestado);
        livroDAO.save(livro);

        String msg = "Livro Adicionado com sucesso! ID=" + livro.getId();
        setResult(RESULT_OK);
        finish();
    }
}