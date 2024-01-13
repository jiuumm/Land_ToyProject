package com.example.land
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.land.Model.User
import com.example.land.databinding.ActivityMainBinding
import com.example.land.databinding.ActivityRoomViewBinding

class RoomViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoomViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val RoomData = intent.getSerializableExtra("room") as User
        binding.priceTxt.text = RoomData.price.toString()
        binding.floor.text = RoomData.floor.toString()
        binding.name.text = RoomData.name.toString()


    }
}