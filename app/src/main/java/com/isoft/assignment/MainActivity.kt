package com.isoft.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val password = idPassword.text.toString()
            val rpassword = idRpassword.text.toString()
            if (idEmail.text.toString().equals("test@test.com")){
                if (password == rpassword){
                    val intent = Intent(this, Second::class.java)
                    startActivity(intent)
                    idEmail.setText("").toString()
                    idPassword.setText("").toString()
                    idRpassword.setText("").toString()

                }
                else{
                  // Toast.makeText(this, "Insert error text", Toast.LENGTH_SHORT).show()
                    StyleableToast.makeText(this, "Insert error text", Toast.LENGTH_SHORT, R.style.mytoast).show()
                    idEmail.setText("").toString()
                    idPassword.setText("").toString()
                    idRpassword.setText("").toString()
                }
            }
            else{
               // Toast.makeText(this, "Insert error text", Toast.LENGTH_SHORT).show()
                StyleableToast.makeText(this, "Insert error text", Toast.LENGTH_SHORT, R.style.mytoast).show()
                idEmail.setText("").toString()
                idPassword.setText("").toString()
                idRpassword.setText("").toString()

            }
        }


//        button.setOnClickListener{
//            val intent = Intent(this, Second::class.java)
//            startActivity(intent)
//        }
    }
}
