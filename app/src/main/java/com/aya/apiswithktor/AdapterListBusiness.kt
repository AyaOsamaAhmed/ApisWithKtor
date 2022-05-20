package com.aya.apiswithktor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.aya.apiswithktor.databinding.ItemListBusinessBinding

class AdapterListBusiness(
    private var list: List<SearchResponse.BusinessResponse>

) : RecyclerView.Adapter<AdapterListBusiness.ViewHolderSubGameFive>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSubGameFive {
        val binding: ItemListBusinessBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_list_business, parent, false
        )
        return ViewHolderSubGameFive(binding)
    }

    override fun getItemCount(): Int {
        return if (list.size > 0) list.size else 0
    }

    override fun onBindViewHolder(holder: ViewHolderSubGameFive, position: Int) {
        val model = list[position]

        holder.bind(model.name)
    }

    class ViewHolderSubGameFive(binding: ItemListBusinessBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemRowBinding: ItemListBusinessBinding= binding
        fun bind(model: String) {
            itemRowBinding.model = model
            itemRowBinding.executePendingBindings()
        }
    }
}