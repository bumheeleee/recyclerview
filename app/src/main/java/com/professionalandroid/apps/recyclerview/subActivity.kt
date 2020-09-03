package com.professionalandroid.apps.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.item.*

class subActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val no = intent.getStringExtra("no")
        val title =intent.getStringExtra("title")
        val date = intent.getStringExtra("date")

        textNo.text = no
        textTitle.text = title
        textDate.text = date

    }
}