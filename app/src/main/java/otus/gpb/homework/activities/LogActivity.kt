package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

open class LogActivity : AppCompatActivity() {

    override fun onStart() {
        Timber.i("on start ${this::class.java}")
        super.onStart()
    }

    override fun onStop() {
        Timber.i("on stop ${this::class.java}")
        super.onStop()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.plant(Timber.DebugTree())
        Timber.i("on create ${this::class.java}")
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        Timber.i("on destroy ${this::class.java}")
        super.onDestroy()
    }

    override fun onResume() {
        Timber.i("on resume ${this::class.java}")
        super.onResume()
    }

    override fun onPause() {
        Timber.i("on pause ${this::class.java}")
        super.onPause()
    }

    override fun onNewIntent(intent: Intent?) {
        Timber.i("on new intent ${this::class.java}")
        super.onNewIntent(intent)
    }
}