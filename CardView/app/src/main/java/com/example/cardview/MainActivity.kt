package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.cardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  ulkelerList:ArrayList<Ulkeder>
    private lateinit var adapter: RVAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.setHasFixedSize(true)
        //binding.rv.layoutManager = LinearLayoutManager(this) //burada tasarım 1x1 2*1 gibi olacak
        //binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        //vertical ve horizantal ile sağa solo mı kayarak gidecek yoksa aşağıya mı


        val u1  =Ulkeder(1,"Türkiye")
        val u2  =Ulkeder(2,"Çin")
        val u3  =Ulkeder(3,"Brezilya")
        val u4  =Ulkeder(4,"Japonya")
        val u5  =Ulkeder(5,"Fransa")
        val u6  =Ulkeder(6,"Almanya")
        val u7  =Ulkeder(7,"Rusya")
        val u8  =Ulkeder(8,"Türkiye")
        val u9  =Ulkeder(9,"Çin")
        val u10  =Ulkeder(10,"Brezilya")
        val u11  =Ulkeder(11,"Japonya")
        val u12  =Ulkeder(12,"Fransa")
        val u13  =Ulkeder(13,"Almanya")
        val u14  =Ulkeder(14,"Rusya")

        ulkelerList = ArrayList<Ulkeder>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)
        ulkelerList.add(u6)
        ulkelerList.add(u7)
        ulkelerList.add(u8)
        ulkelerList.add(u9)
        ulkelerList.add(u10)
        ulkelerList.add(u11)
        ulkelerList.add(u12)
        ulkelerList.add(u13)
        ulkelerList.add(u14)

        adapter = RVAdapter(this,ulkelerList)
        binding.rv.adapter = adapter
    }
}