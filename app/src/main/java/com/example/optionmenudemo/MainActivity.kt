package com.example.optionmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.itemOne -> {
                Toast.makeText(this, "Item one has been selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.itemTwo -> {
                Toast.makeText(this, "Item one has been selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subMenuOne -> {
                Toast.makeText(this, "Item Sub menu one has been selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subMenuTwo -> {
                Toast.makeText(this, "Item Sub menu two has been selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}