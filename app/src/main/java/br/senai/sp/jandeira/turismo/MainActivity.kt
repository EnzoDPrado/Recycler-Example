package br.senai.sp.jandeira.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandeira.turismo.adapter.PontosTuristicosAdapter
import br.senai.sp.jandeira.turismo.dao.PontosTuristicosDao
import br.senai.sp.jandeira.turismo.model.PontoTuristico

class MainActivity : AppCompatActivity() {
    lateinit var rvPontosTuristicos: RecyclerView
    lateinit var adapterPontosTuristicosAdapter: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criar instancia da recycler view
        rvPontosTuristicos = findViewById(R.id.rv_pontos_turisticos)

        //Determinar o layout da RecyclerView
        rvPontosTuristicos.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )

        adapterPontosTuristicosAdapter = PontosTuristicosAdapter(this)
        adapterPontosTuristicosAdapter.updatePontosTuristicosList(
            PontosTuristicosDao.getPontosTuristicos(this))

        //Ligar o adapter a nossa Recycler View
        rvPontosTuristicos.adapter = adapterPontosTuristicosAdapter
    }
}