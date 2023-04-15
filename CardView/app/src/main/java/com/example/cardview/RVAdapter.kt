package com.example.cardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val mContext:Context,private  val ulkelerGelenListe:List<Ulkeder>)
    : RecyclerView.Adapter<RVAdapter.CardViewTasarimNesneleriniTutucu>() {
    //: RecyclerView.Adapter<RVAdapter.CardViewTasarimNesneleriniTutucu>() sayesinde viewlere erişyebiliyoruz
    //List daha kapsamlı ArrayList gelenleri de yakalar.
    //context istiyorum ki androide özgü bağlamları çalıştırabiliyim
    //toast , başka activitylere gitme , veritabınında veri çekme vs

    //sınıf içinde sınıf kullanmak için inner class yazarız
    inner class CardViewTasarimNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){

        //view sayesinde görsel nesnelere erişebilirz
        var cardView:CardView
        var textViewRow:TextView
        var noktaResim:ImageView


        //init constuctor demektir yani bu sınıftan nesne olusunca calisir.
        init {
            cardView = view.findViewById(R.id.cardView)
            textViewRow= view.findViewById(R.id.textViewRow)
            noktaResim = view.findViewById(R.id.noktaResim)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewTasarimNesneleriniTutucu {
       //nesne istiyor
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarimi,parent,false)
        //tasarımıma erişmek için
        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun getItemCount(): Int {
       //satır sayısını bilmek istiyor
        return ulkelerGelenListe.size
    }

    override fun onBindViewHolder(holder: CardViewTasarimNesneleriniTutucu, position: Int) {
       //hangi veriyi hangi görsel tasarıma aktardığımız yer burasıdır.
        //postion döngü gibi 0. indexteki veriyi göster 1. indexdeki gibi
        val ulke = ulkelerGelenListe[position]
        holder.textViewRow.text= ulke.ulkeAdi
        holder.cardView.setOnClickListener {
            Toast.makeText(mContext, "Seçtiğiniz Ülke : ${ulke.ulkeAdi}", Toast.LENGTH_SHORT).show()
        }
    }
}