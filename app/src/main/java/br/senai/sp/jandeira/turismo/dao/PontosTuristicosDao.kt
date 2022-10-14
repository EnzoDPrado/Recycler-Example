package br.senai.sp.jandeira.turismo.dao

import android.content.Context
import br.senai.sp.jandeira.turismo.R
import br.senai.sp.jandeira.turismo.model.PontoTuristico

class PontosTuristicosDao {
    //Tudo que esta dentro do metodo companion e estatico
    companion object {

        fun getPontosTuristicos(context: Context): List<PontoTuristico>{


            val pt1 = PontoTuristico()
            pt1.codigo = 1;
            pt1.nomePontoTuristico = "Noruega"
            pt1.descricao = "Aurora boreal muito lindo, lindo mesmo, de mais, ate muito, dvdd confia"
            pt1.imagem = context.getDrawable(R.drawable.img)

            val pt2 = PontoTuristico()
            pt2.codigo = 2;
            pt2.nomePontoTuristico = "Bahia"
            pt2.descricao = "Praia do espelho"
            pt2.imagem = context.getDrawable(R.drawable.img_2)

            val pt3 = PontoTuristico()
            pt3.codigo = 3;
            pt3.nomePontoTuristico = "Bahia"
            pt3.descricao = "Praia do espelho"
            pt3.imagem = context.getDrawable(R.drawable.img_3)

            val pt4 = PontoTuristico()
            pt4.codigo = 4;
            pt4.nomePontoTuristico = "Bahia"
            pt4.descricao = "Praia do espelho"
            pt4.imagem = context.getDrawable(R.drawable.img_4)

            val pt5 = PontoTuristico()
            pt5.codigo = 5;
            pt5.nomePontoTuristico = "Fossa das Marianas"
            pt5.descricao = "A Fossa das Marianas é o local mais profundo dos oceanos, atingindo uma profundidade de 10 984 metros. Localiza-se no oceano Pacífico, a leste das ilhas Marianas"
            pt5.imagem = context.getDrawable(R.drawable.img_5)





            val pontosTuristicos = listOf<PontoTuristico>(pt1,pt2,pt3,pt4,pt5)

            return pontosTuristicos
        }


    }
}