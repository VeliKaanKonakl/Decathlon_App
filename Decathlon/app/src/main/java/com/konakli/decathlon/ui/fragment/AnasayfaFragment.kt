package com.konakli.decathlon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.konakli.decathlon.R
import com.konakli.decathlon.data.Kategoriler
import com.konakli.decathlon.databinding.FragmentAnasayfaBinding
import com.konakli.decathlon.ui.adapter.KategorilerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val kategoriListesi = ArrayList<Kategoriler>()
            val k1 = Kategoriler(1,"erkek_kategori")
            val k2 = Kategoriler(2,"kadin_kategori")
            val k3 = Kategoriler(3,"cocuk_kategori")
            val k4 = Kategoriler(4,"aksesuar_kategori")
            kategoriListesi.add(k1)
            kategoriListesi.add(k2)
            kategoriListesi.add(k3)
            kategoriListesi.add(k4)

            val adapter = KategorilerAdapter(requireContext(),kategoriListesi)
            binding.rv.adapter = adapter

        return binding.root
    }
}