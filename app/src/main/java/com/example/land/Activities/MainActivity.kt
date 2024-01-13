package com.example.land.Activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.land.Adapters.UserAdpater
import com.example.land.Model.User
import com.example.land.R
import com.example.land.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    val UserList = arrayListOf<User>(
        User(R.drawable.roop, "신촌룸", "1억5천만원", 8),
        User(R.drawable.instagram, "연희동 원룸", "2억", 11),
        User(R.drawable.roop, "삼산동 원룸", "1억만원",20),
        User(R.drawable.android, "대현동 원룸", "1억6천만원",15),
        User(R.drawable.instagram, "부개동 원룸", "8천만원",10),
        User(R.drawable.android, "십정동 원룸", "1억5천만원",4),
        User(R.drawable.roop, "갈산동 원룸", "5천만원",7),

    )
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = UserAdpater(this, UserList)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val clicked = UserList[position]

            Toast.makeText(this, "${clicked.name}이 클릭됨!", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, clicked.getFormattedFloor(), Toast.LENGTH_SHORT).show()
        }

    }
}