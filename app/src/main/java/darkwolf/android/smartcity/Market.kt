package darkwolf.android.smartcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

private lateinit var close:Button

class Market : AppCompatActivity() ,OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market)
        close=findViewById(R.id.id_MClose)
        close.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            close->finish()
        }

    }
}