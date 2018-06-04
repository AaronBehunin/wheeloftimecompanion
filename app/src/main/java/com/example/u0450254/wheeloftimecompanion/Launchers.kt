package com.example.u0450254.wheeloftimecompanion

import android.content.Context
import android.content.Intent
import android.text.style.ClickableSpan
import android.view.View
import com.example.u0450254.wheeloftimecompanion.Characters.Forsworn.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LewsTherin
import com.example.u0450254.wheeloftimecompanion.Terminology.TheDarkOne

/**
 * Created by u0450254 on 5/23/2018.
 */

class Launchers(context: Context)
{
   public val spanTheDarkOne = object: ClickableSpan(){
       override fun onClick(widget: View?) {
           var intent = Intent(context, TheDarkOne::class.java)
           context.startActivity(intent)
       }
   }

    public val spanTheOnePower = object: ClickableSpan(){
        override fun onClick(widget: View?) {


        }
    }

    val spanSaiden = object: ClickableSpan()
    {
        override fun onClick(widget: View?) {


        }

    }


    val spanIshamael = object: ClickableSpan()
    {
        override fun onClick(widget: View?) {
            var intent = Intent(context, Ishamael::class.java)
            context.startActivity(intent)


        }



    }
    val spanLewsTherin = object: ClickableSpan()
    {
        override fun onClick(widget: View?) {
            var intent = Intent(context, LewsTherin::class.java)
            context.startActivity(intent)
        }
    }

    val spanDragonmount = object: ClickableSpan()
    {
        override fun onClick(widget: View?) {
        }
    }

    val spanTarValon = object: ClickableSpan()
    {
        override fun onClick(widget: View?) {

        }
    }




}





