package com.example.u0450254.wheeloftimecompanion


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Angreal.TheRobedWoman
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.GreatSerpentRing
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.RingofTamyrlin
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.ScalesofOffice
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.ColorShiftCloak
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.HalfMoonAxe
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.MoirainesStaff
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Aginor
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Narg
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.*
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Cloud
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Scratch
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Draghkar
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Creatures.Races.Ogier
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.*
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.*
import com.example.u0450254.wheeloftimecompanion.Organizations.*
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.*
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.*
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.*

class IndexActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guides)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val parentView = findViewById<LinearLayout>(R.id.parent)

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val map = findViewById<RelativeLayout>(R.id.WorldMapView)
        parentView.removeView(map)

        val fainViewF = findViewById<RelativeLayout>(R.id.PadanFainFriendView)
        val fainViewE = findViewById<RelativeLayout>(R.id.PadanFainView)
        if (progress.book>1||(progress.book==1&&progress.chapter>10)) {
            parentView.removeView(fainViewF)
        }
        else
        {
            parentView.removeView(fainViewE)
        }
    }
    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedaiLegends(view: View)
    {
        val intent = Intent(view.context, AesSedaiAgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        val intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchChildrenoftheLight(view: View)
    {
        val intent = Intent(view.context, ChildrenoftheLight::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarkfriends(view: View)
    {
        val intent = Intent(view.context, Darkfriends::class.java)
        view.context.startActivity(intent)
    }
    fun launchDreadlords(view: View)
    {
        val intent = Intent(view.context, Dreadlords::class.java)
        view.context.startActivity(intent)
    }
    fun launchForsaken(view: View)
    {
        val intent = Intent(view.context, Forsaken::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredCompanions(view: View)
    {
        val intent = Intent(view.context, HundredCompanions::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        val intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchWomensCircle(view: View)
    {
        val intent = Intent(view.context, WomensCircle::class.java)
        view.context.startActivity(intent)
    }
    fun launchTuathaan(view: View)
    {
        val intent = Intent(view.context, Tuathaan::class.java)
        view.context.startActivity(intent)
    }

    fun launchAesSedaiSymbol(view: View)
    {
        val intent = Intent(view.context, AesSedaiSymbol::class.java)
        view.context.startActivity(intent)
    }
    fun launchBraid(view: View)
    {
        val intent = Intent(view.context, Braid::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        val intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldTongue(view: View)
    {
        val intent = Intent(view.context, OldTongue::class.java)
        view.context.startActivity(intent)
    }
    fun launchStones(view: View)
    {
        val intent = Intent(view.context, Stones::class.java)
        view.context.startActivity(intent)
    }
    fun launchTabac(view: View)
    {
        val intent = Intent(view.context, Tabac::class.java)
        view.context.startActivity(intent)
    }
    fun launchWisdom(view: View)
    {
        val intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }

    fun launchAgeofLegends(view: View)
    {
        val intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheBreakingoftheWorld(view: View)
    {
        val intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchShiningWallsBattle(view: View)
    {
        val intent = Intent(view.context, ShiningWallsBattle::class.java)
        view.context.startActivity(intent)
    }
    fun launchFieldofBekkar(view: View)
    {
        val intent = Intent(view.context, FieldofBekkar::class.java)
        view.context.startActivity(intent)
    }
    fun launchSunday(view: View)
    {
        val intent = Intent(view.context, Sunday::class.java)
        view.context.startActivity(intent)
    }
    fun launchBattleTarendrelle(view: View)
    {
        val intent = Intent(view.context, BattleTarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchThirdAge(view: View)
    {
        val intent = Intent(view.context, ThirdAge::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        val intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredYearsWar(view: View)
    {
        val intent = Intent(view.context, HundredYearsWar::class.java)
        view.context.startActivity(intent)
    }
    fun launchIshamael(view: View)
    {
        val intent = Intent(view.context, Ishamael::class.java)
        view.context.startActivity(intent)
    }
    fun launchAginor(view: View)
    {
        val intent = Intent(view.context, Aginor::class.java)
        view.context.startActivity(intent)
    }
    fun launchNarg(view: View)
    {
        val intent = Intent(view.context, Narg::class.java)
        view.context.startActivity(intent)
    }
    fun launchAielWaste(view: View) {
        val intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchBorderlands(view: View) {
        val intent = Intent(view.context, Borderlands::class.java)
        view.context.startActivity(intent)
    }
    fun launchDhallinForest(view: View) {
        val intent = Intent(view.context, DhallinForest::class.java)
        view.context.startActivity(intent)
    }
    fun launchForestofShadows(view: View) {
        val intent = Intent(view.context, ForestofShadows::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        val intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View) {
        val intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
    fun launchSandHills(view: View) {
        val intent = Intent(view.context, SandHills::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        val intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        val intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        val intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }

    fun launchRand(view: View)
    {
        val intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        val intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchNynaeve(view: View)
    {
        val intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwgene(view: View)
    {
        val intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        val intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheRobedWoman(view: View){
        val intent = Intent(view.context, TheRobedWoman::class.java)
        view.context.startActivity(intent)
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
    fun launchTamAlThor(view: View)
    {
        val intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        val intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoiraine(view: View)
    {
        val intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchThom(view: View)
    {
        val intent = Intent(view.context, Thom::class.java)
        view.context.startActivity(intent)
    }
    fun launchLewsTherin(view: View)
    {
        val intent = Intent(view.context, LewsTherin::class.java)
        view.context.startActivity(intent)
    }
    fun launchArturHawkwing(view: View)
    {
        val intent = Intent(view.context, ArturHawkwing::class.java)
        view.context.startActivity(intent)
    }
    fun launchLamanDamodred(view: View)
    {
        val intent = Intent(view.context, LamanDamodred::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreenMan(view: View)
    {
        val intent = Intent(view.context, GreenMan::class.java)
        view.context.startActivity(intent)
    }
    fun launchAemonalThorin(view: View)
    {
        val intent = Intent(view.context, AemonalThorin::class.java)
        view.context.startActivity(intent)
    }
    fun launchEldreneayCarlan(view: View)
    {
        val intent = Intent(view.context, EldreneayCarlan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIlyenaTherinMoerelle(view: View)
    {
        val intent = Intent(view.context, IlyenaTherinMoerelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        val intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }
    fun launchAngreal(view: View)
    {
        val intent = Intent(view.context, Angreal::class.java)
        view.context.startActivity(intent)
    }
    fun launchAvendesora(view: View)
    {
        val intent = Intent(view.context, Chora::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheCreator(view: View)
    {
        val intent = Intent(view.context, TheCreator::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragon(view: View)
    {
        val intent = Intent(view.context, TheDragon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragonsFang(view: View)
    {
        val intent = Intent(view.context, DragonsFang::class.java)
        view.context.startActivity(intent)
    }
    fun launchHighSeat(view: View)
    {
        val intent = Intent(view.context, HighSeat::class.java)
        view.context.startActivity(intent)
    }
    fun launchNineRods(view: View)
    {
        val intent = Intent(view.context, NineRods::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheOnePower(view: View)
    {
        val intent = Intent(view.context, TheOnePower::class.java)
        view.context.startActivity(intent)
    }
    fun launchSaidin(view: View)
    {
        val intent = Intent(view.context, Saidin::class.java)
        view.context.startActivity(intent)
    }
    fun launchTaint(view: View)
    {
        val intent = Intent(view.context, Taint::class.java)
        view.context.startActivity(intent)
    }
    fun launchVoid(view: View)
    {
        val intent = Intent(view.context, Void::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        val intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }

    fun launchArythOcean(view: View) {
        val intent = Intent(view.context, ArythOcean::class.java)
        view.context.startActivity(intent)
    }
    fun launchManetherendrelle(view: View) {
        val intent = Intent(view.context, Manetherendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchMire(view: View) {
        val intent = Intent(view.context, Mire::class.java)
        view.context.startActivity(intent)
    }
    fun launchSeaofStorms(view: View) {
        val intent = Intent(view.context, SeaofStorms::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarendrelle(view: View) {
        val intent = Intent(view.context, Tarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringWater(view: View) {
        val intent = Intent(view.context, WinespringWater::class.java)
        view.context.startActivity(intent)
    }
    fun launchWorldSea(view: View) {
        val intent = Intent(view.context, WorldSea::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        val intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        val intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        val intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchLugard(view: View) {
        val intent = Intent(view.context, Lugard::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaaranDisen(view: View)
    {
        val intent = Intent(view.context, PaaranDisen::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        val intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        val intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchBela(view: View) {
        val intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
    fun launchCloud(view: View) {
        val intent = Intent(view.context, Cloud::class.java)
        view.context.startActivity(intent)
    }
    fun launchScratch(view: View) {
        val intent = Intent(view.context, Scratch::class.java)
        view.context.startActivity(intent)
    }

    fun launchCairhien(view: View)
    {
        val intent = Intent(view.context, Cairhien::class.java)
        view.context.startActivity(intent)
    }
    fun launchGhealdan(view: View)
    {
        val intent = Intent(view.context, Ghealdan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIllian(view: View)
    {
        val intent = Intent(view.context, Illian::class.java)
        view.context.startActivity(intent)
    }
    fun launchManetheren(view: View)
    {
        val intent = Intent(view.context, Manetheren::class.java)
        view.context.startActivity(intent)
    }
    fun launchShienar(view: View)
    {
        val intent = Intent(view.context, Shienar::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchColorShiftCloak(view: View){
        val intent = Intent(view.context, ColorShiftCloak::class.java)
        view.context.startActivity(intent)
    }
    fun launchHalfMoonAxe(view: View){
        val intent = Intent(view.context, HalfMoonAxe::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoirainesStaff(view: View){
        val intent = Intent(view.context, MoirainesStaff::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamsSword(view: View){
        val intent = Intent(view.context, TamsSword::class.java)
        view.context.startActivity(intent)
    }
    fun launchDraghkar(view: View) {
        val intent = Intent(view.context, Draghkar::class.java)
        view.context.startActivity(intent)
    }
    fun launchMyrddraal(view: View) {
        val intent = Intent(view.context, Myrddraal::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        val intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragonmount(view: View) {
        val intent = Intent(view.context, Dragonmount::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        val intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        val intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchSpineoftheWorld(view: View) {
        val intent = Intent(view.context, SpineoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatSerpentRing(view: View){
        val intent = Intent(view.context, GreatSerpentRing::class.java)
        view.context.startActivity(intent)
    }
    fun launchRingofTamyrlin(view: View){
        val intent = Intent(view.context, RingofTamyrlin::class.java)
        view.context.startActivity(intent)
    }
    fun launchScalesofOffice(view: View){
        val intent = Intent(view.context, ScalesofOffice::class.java)
        view.context.startActivity(intent)
    }
    fun launchNorthRoad(view: View) {
        val intent = Intent(view.context, NorthRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldRoad(view: View) {
        val intent = Intent(view.context, OldRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchQuarryRoad(view: View) {
        val intent = Intent(view.context, QuarryRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        val intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        val intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchOgier(view: View) {
        val intent = Intent(view.context, Ogier::class.java)
        view.context.startActivity(intent)
    }
}
