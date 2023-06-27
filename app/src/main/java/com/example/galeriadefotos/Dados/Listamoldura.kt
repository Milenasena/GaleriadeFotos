package com.example.galeriadefotos.Dados

import com.example.galeriadefotos.R
import com.example.galeriadefotos.model.IdImagemDescricao


class Listamoldura {

    fun carregamoldura(): List<IdImagemDescricao>{
        return listOf<IdImagemDescricao>(
            IdImagemDescricao(R.drawable.m1, R.string.descricao_m1),
            IdImagemDescricao(R.drawable.m2, R.string.descricao_m2),
            IdImagemDescricao(R.drawable.m3, R.string.descricao_m3),
            IdImagemDescricao(R.drawable.m4, R.string.descricao_m4),
            IdImagemDescricao(R.drawable.m5, R.string.descricao_m5),
            IdImagemDescricao(R.drawable.m6, R.string.descricao_m6),
            IdImagemDescricao(R.drawable.m7, R.string.descricao_m7),
            IdImagemDescricao(R.drawable.m8, R.string.descricao_m8)



        )
}
}