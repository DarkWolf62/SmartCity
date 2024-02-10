package darkwolf.android.smartcity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() ,OnClickListener {
    private lateinit var market:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        market=findViewById(R.id.id_market)
        market.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            market->openMarket()

        }
    }

    fun openMarket(){
        val intent=Intent(this,Market::class.java)
        startActivity(intent)
    }
}