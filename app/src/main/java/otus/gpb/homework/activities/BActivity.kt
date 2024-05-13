package otus.gpb.homework.activities

import android.content.Intent

import android.os.Bundle
import android.widget.Button

class BActivity : LogActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val cButton: Button = findViewById(R.id.button_to_C)
        cButton.setOnClickListener {
            startActivity(Intent(this, CActivity::class.java))
        }
    }
}