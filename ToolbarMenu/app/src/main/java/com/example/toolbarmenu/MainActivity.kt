package com.example.toolbarmenu

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbarmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , SearchView.OnQueryTextListener{
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.toolbar.title ="Toolbar Menu"
        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        val item = menu?.findItem(R.id.action_search) // itemin idisini almak için
        val searchView = item?.actionView as SearchView //casting yaptık
        searchView.setOnQueryTextListener(this) //arama işlemini tetikledik.
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_informatin -> {
                Toast.makeText(applicationContext, "Information Clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_add ->{
                Toast.makeText(applicationContext, "Add Clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_settings ->{
                Toast.makeText(applicationContext, "Settings Clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_exit ->{
                Toast.makeText(applicationContext, "Exit Clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            else ->{
                return super.onOptionsItemSelected(item)
            }
        }

    }


    //search için gerekli metotlar
    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            Log.e("Text Query:",query)
        }
        return true
    }
    override fun onQueryTextChange(newText: String?): Boolean {
        //arama sonuçları newText ile bize döndürür.
        if (newText != null) {
            Log.e("Text Text Change:",newText)
        }
        return true
    }
}