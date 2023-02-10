package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    //O método onCreateViewHolder() é chamado pelo gerenciador de layout para criar novos armazenadores
    //de visualização para o RecyclerView (quando não há armazenadores de visualização existentes que possam ser reutilizados)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size //mesma coisa que fazer o { return dataset.size }

    // Esse método é chamado para gerenciador de layout para substituir o conteúdo de uma vizualização
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        //essa linha de código atualiza o armazenador de visualização para mostrar a string de afirmação.
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
}