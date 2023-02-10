package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * Adaptador para o [RecyclerView] em [MainActivity]. Exibe o objeto de dados [Affirmation]
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Forneça uma referência às visualizações para cada item de dados
    // Itens de dados complexos podem precisar de mais de uma visualização por item e
    // você fornece acesso a todas as visualizações para um item de dados em um portador de visualização.
    // Cada item de dados é apenas um objeto de Afirmação.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Cria novas visualizações (chamadas pelo gerenciador de layout)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // cria uma nova visualização
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Retorne o tamanho do seu conjunto de dados (chamado pelo gerenciador de layout)
     */
    override fun getItemCount() = dataset.size //mesma coisa que fazer o { return dataset.size }

    /**
     * Substitua o conteúdo de uma exibição (chamada pelo gerenciador de layout)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        //essa linha de código atualiza o armazenador de visualização para mostrar a string de afirmação.
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
}