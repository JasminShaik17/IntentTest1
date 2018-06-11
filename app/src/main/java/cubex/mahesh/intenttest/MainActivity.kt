package cubex.mahesh.intenttest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun load(v:View)
    {
      if(v.id == R.id.dial){
       /*   val  i = Intent( )
          i.action = Intent.ACTION_DIAL
          var et:EditText = findViewById(R.id.et1)
          i.setData(Uri.parse("tel:"+et.text.toString()))
          startActivity(i) */
     /*     val  i = Intent( )
          i.action = Intent.ACTION_VIEW
          i.data = Uri.parse("http://www.nareshit.com")
          startActivity(i) */
          val i = Intent( )
          i.setAction(Intent.ACTION_GET_CONTENT)
          i.setType("image/*")
          startActivity(i)
      }else if(v.id == R.id.next){

            val i = Intent(this,
                                WelcomeActivity::class.java)
            val  et2:EditText = findViewById(R.id.et2)
            i.putExtra("per_name",
                                        et2.text.toString())
            startActivity(i)
      }else if(v.id == R.id.whatsapp){

          var i = packageManager.getLaunchIntentForPackage(
                   "naukriApp.appModules.login")
          if(i!=null) {
              startActivity(i)
          }else{
              i = Intent( )
              i.action = Intent.ACTION_VIEW
              i.data = Uri.parse("https://play.google.com/store/apps/details?id=naukriApp.appModules.login")
              startActivity(i)
          }
      }
    }
}
