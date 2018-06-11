package cubex.mahesh.intenttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val  tview:TextView = findViewById(R.id.tview)
        val  name = intent.getStringExtra("per_name")
        tview.text = tview.text.toString() + name
    }
}
