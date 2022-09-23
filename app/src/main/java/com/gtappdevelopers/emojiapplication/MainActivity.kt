package com.gtappdevelopers.emojiapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var msgEdt: TextInputEditText
    lateinit var sendMsgButton: Button
    lateinit var msgTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        msgEdt = findViewById(R.id.idEdtMsg)
        msgTV = findViewById(R.id.idTVMsg)
        sendMsgButton = findViewById(R.id.idBtnSendMsg)
        sendMsgButton.setOnClickListener {
            if (msgEdt.text.toString() != null) {
                msgTV.text = msgEdt.text.toString()
            }
        }

    }
}