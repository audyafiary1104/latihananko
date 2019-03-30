package com.example.latihananko

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.*

class sukses: AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginView().setContentView(this)
        var berhasil : TextView = findViewById(R.id.berhasil)
        val data = intent.getStringExtra("kode")
        berhasil.setText(data)
    }
}
class LoginView : AnkoComponent<sukses> {
    override fun createView(ui: AnkoContext<sukses>) = with(ui) {
        verticalLayout {
            lparams {
                width = matchParent
                height = matchParent
                backgroundColor = R.color.colorPrimaryDark
            }
            textView {
                id = R.id.welcome
                text = "WELCOME"
                textSize = 15f
                textColor = Color.WHITE
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                margin = 15
            }
            textView {
                id = R.id.berhasil
                textSize = 15f
                textColor = Color.WHITE
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                margin = 15
            }
        }
    }
}