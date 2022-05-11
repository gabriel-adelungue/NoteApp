package br.senac.noteapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// @ColumInfo Serve para renomear coluna

@Entity  // Serve para transformar uma classe em uma tabela
data class Note(    // Construtor
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var title: String,
    var desc: String
)
