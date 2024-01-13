package com.example.land.Model

import java.io.Serializable

class User(val profile: Int, val  name: String, val price:String, val floor: Int):Serializable {
    fun getFormattedFloor():String{
        val floor = this.floor
        if (floor>10){
            return "${this.name}은 고층입니다."
        }
        else if(floor>7)
        {
            return "${this.name}은 중간층입니다."
        }
        else{
            return "${this.name}은 저층입니다."
        }

    }

}