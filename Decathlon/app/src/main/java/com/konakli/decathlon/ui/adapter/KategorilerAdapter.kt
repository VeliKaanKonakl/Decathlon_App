package com.konakli.decathlon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.konakli.decathlon.data.Kategoriler
import com.konakli.decathlon.databinding.CardTasarimBinding


class KategorilerAdapter(var mContext : Context, var kategorilerListesi : List<Kategoriler>)
    : RecyclerView.Adapter<KategorilerAdapter.HolderClass>() {

        inner class HolderClass(var binding:CardTasarimBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderClass {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return HolderClass(binding)
    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }

    override fun onBindViewHolder(holder: HolderClass, position: Int) {
        val kategori = kategorilerListesi.get(position)
        val t = holder.binding

        t.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.kategoriAdi,"drawable",mContext.packageName))
        t.cardView.setOnClickListener{
            //
        }
    }


}