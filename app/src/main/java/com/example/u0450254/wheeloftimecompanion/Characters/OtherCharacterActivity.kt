package com.example.u0450254.wheeloftimecompanion.Characters

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import kotlinx.android.synthetic.main.guides.view.*

/*
 * Created by u0450254 on 5/30/2018.
 */
class OtherCharacterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.KarialThorView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PaetalCarrView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CorinAyellinView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DavAyellinView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HuBarranView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TadBarranView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwardCandwinView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NattiCauthonView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BiliCongarView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DaiseCongarView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarlCoplinView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwalCoplinView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HariCoplinView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BandryCraweView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OrenDautryView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ElamDowtryView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainFriendView)
        val view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        val view25 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RowanHurnView)
        val view26 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        val view27 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        val view28 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BerinThaneView)
        val view29 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
        charview.addView(view9)
        charview.addView(view10)
        charview.addView(view11)
        charview.addView(view12)
        charview.addView(view13)
        charview.addView(view14)
        charview.addView(view15)
        charview.addView(view16)
        charview.addView(view17)
        charview.addView(view18)
        charview.addView(view19)
        charview.addView(view20)
        charview.addView(view21)
        charview.addView(view22)
        charview.addView(view23)
        charview.addView(view24)
        charview.addView(view25)
        charview.addView(view26)
        charview.addView(view27)
        charview.addView(view28)
        charview.addView(view29)

        if (progress.book==1 && progress.chapter>10)
        {
            charview.removeView(view23)
        }
    }
    fun launchKarialThor(view: View){
        val intent = Intent(view.context, KarialThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        val intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchMarinAlVere(view: View){
        val intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCorinAyellin(view: View){
        val intent = Intent(view.context, CorinAyellin::class.java)
        view.context.startActivity(intent)
    }
    fun launchDavAyellin(view: View){
        val intent = Intent(view.context, DavAyellin::class.java)
        view.context.startActivity(intent)
    }
    fun launchHuBarran(view: View){
        val intent = Intent(view.context, HuBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchTadBarran(view: View){
        val intent = Intent(view.context, TadBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        val intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwardCandwin(view: View){
        val intent = Intent(view.context, EwardCandwin::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaetalCarr(view: View){
        val intent = Intent(view.context, PaetalCarr::class.java)
        view.context.startActivity(intent)
    }
    fun launchAbellCauthon(view: View){
        val intent = Intent(view.context, AbellCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchNattiCauthon(view: View){
        val intent = Intent(view.context, NattiCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchBiliCongar(view: View) {
        val intent = Intent(view.context, BiliCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchDaiseCongar(view: View) {
        val intent = Intent(view.context, DaiseCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchWitCongar(view: View)
    {
        val intent = Intent(view.context, WitCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchDagCoplin(view: View){
        val intent = Intent(view.context, DagCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarlCoplin(view: View){
        val intent = Intent(view.context, DarlCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwalCoplin(view: View)
    {
        val intent = Intent(view.context, EwalCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchHariCoplin(view: View){
        val intent = Intent(view.context, HariCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchBandryCrawe(view: View){
        val intent = Intent(view.context, BandryCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        val intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchOrenDautry(view: View){
        val intent = Intent(view.context, OrenDautry::class.java)
        view.context.startActivity(intent)
    }
    fun launchElamDowtry(view: View){
        val intent = Intent(view.context, ElamDowtry::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        val intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwinFinngar(view: View){
        val intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
    }
    fun launchRowanHurn(view: View){
        val intent = Intent(view.context, RowanHurn::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        val intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        val intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchBerinThane(view: View){
        val intent = Intent(view.context, BerinThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        val intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
}
