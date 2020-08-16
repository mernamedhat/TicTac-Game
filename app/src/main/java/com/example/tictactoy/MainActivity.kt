package com.example.tictactoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
// 3aaaaaa4 (claping) 
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buselect(view: View) {
        val buchoise= view as Button
        var cid=0
        when(buchoise.id){
            R.id.but1-> cid=1
            R.id.but2-> cid=2
            R.id.but3-> cid=3
            R.id.but4-> cid=4
            R.id.but5-> cid=5
            R.id.but6-> cid=6
            R.id.but7-> cid=7
            R.id.but8-> cid=8
            R.id.but9-> cid=9
        }
        playgame(cid,buchoise)

    }
    var player1= ArrayList<Int>()
    var player2= ArrayList<Int>()
    var activeplayer=1
    fun playgame(cid:Int,buchoise:Button){
        if( activeplayer==1){
            buchoise.text="X"
            buchoise.setBackgroundResource(R.color.colorPrimary)
            player1.add(cid)
            activeplayer=2
        }
        else{
            buchoise.text="O"
            buchoise.setBackgroundResource(R.color.colorPrimaryDark)
            player2.add(cid)
            activeplayer=1
        }
        buchoise.isEnabled=false
        chickwinner()
    }
    fun chickwinner(){
        var winner=-1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1}
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2
        }
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1}
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2

        }
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1}
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2

        }
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1}
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2

        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1}
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2

        }
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1}
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner=2

        }
        if (winner!=-1){
            if (winner==1){
                Toast.makeText(this, "player 1", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "player2", Toast.LENGTH_SHORT).show()
            }
        }

    }
}