package com.example.latihananko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.alert
import org.jetbrains.anko.info
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        var btn : Button = findViewById(R.id.btn)
        var uname : EditText = findViewById(R.id.et_username)
        var passwd : EditText = findViewById(R.id.et_password)
        btn.setOnClickListener {
            val password = passwd.text.toString().trim()
            val username = uname.text.toString().trim()
            handlelogin(username,password)
        }
    }
    private fun handlelogin(username : String, password : String){
        info { "data username  : $username , data password : $password" }
        if (username.equals("audy")&& password.equals("Qwerty12#")){
            startActivity(intentFor<sukses>("kode" to username))
        }else{
            alert(title = "warning",message = "username salah"){
                positiveButton(buttonText = "OK"){

                }
                isCancelable = false
            }.show()
        }
    }
}
