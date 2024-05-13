package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class CActivity : LogActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val dButton: Button = findViewById(R.id.button_to_D)
        dButton.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this, DActivity::class.java))
        }

        val aButton: Button = findViewById(R.id.button_to_A)
        aButton.setOnClickListener {
            startActivity(Intent(this, AActivity::class.java))
        }

        val closeCButton: Button = findViewById(R.id.closeC)
        closeCButton.setOnClickListener {
            finish()
        }

        val closeStackButton: Button = findViewById(R.id.close_stack)
        closeStackButton.setOnClickListener {
            finishAffinity()
        }
    }
}