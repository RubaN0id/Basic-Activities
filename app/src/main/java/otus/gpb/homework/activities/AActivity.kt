package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class AActivity : LogActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val bButton: Button = findViewById(R.id.button_to_B)
        bButton.text = getString(R.string.open_activity_b)
        bButton.setOnClickListener {
            startActivity(Intent(this, BActivity::class.java))
        }

    }
}