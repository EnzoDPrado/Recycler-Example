package br.senai.sp.jandeira.turismo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandeira.turismo.R
import br.senai.sp.jandeira.turismo.model.PontoTuristico

class PontosTuristicosAdapter(val context: Context) :
    RecyclerView.Adapter<PontosTuristicosAdapter.HolderpT>() {

    private var pontosTuristicosList = listOf<PontoTuristico>()

    fun updatePontosTuristicosList(pontosTuristico: List<PontoTuristico>) {
        this.pontosTuristicosList = pontosTuristico
        notifyDataSetChanged()
    }

    //Criar uma inner class
    class HolderpT(view: View): RecyclerView.ViewHolder(view){
        val textTituloPt = view.findViewById<TextView>(R.id.textView_titulo);
        val textDescricao = view.findViewById<TextView>(R.id.textView_descricao);
        val imageHolder = view.findViewById<ImageView>(R.id.image_holder);
        val buttonDetalhes = view.findViewById<Button>(R.id.button_detalhes);

        fun bind(pontoTuristico: PontoTuristico){
            textTituloPt.text = pontoTuristico.nomePontoTuristico;
            textDescricao.text = pontoTuristico.descricao;
            imageHolder.setImageDrawable(pontoTuristico.imagem);

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderpT {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false);
        return HolderpT(view);
    }

    override fun onBindViewHolder(holder: HolderpT, position: Int) {
        holder.bind(pontosTuristicosList.get(position))
    }

    override fun getItemCount(): Int {
        return pontosTuristicosList.size
    }

}