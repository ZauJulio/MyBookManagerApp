package com.zlancelot.gerenciadordelivros.data;

public class LivroContract {

    public static final String TABLE_NAME = "livro";

    public static final class Columns {
        public static final String _ID = "_id";
        public static final String titulo = "titulo";
        public static final String autor = "autor";
        public static final String editora = "editora";
        public static final String emprestado = "emprestado";
    }

}
