package com.example.u0450254.wheeloftimecompanion.Organizations

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import kotlinx.android.synthetic.main.organization.*

class AesSedai: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        var jump:Int = intent.getIntExtra("Jump", 0)


        var scrollView = findViewById<ScrollView>(R.id.orgScroll)

        var h = Handler();

        h.postDelayed(Runnable() {

            scrollView.scrollTo(0, jump);

        }, 250); // 250 ms delay
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisType = findViewById<TextView>(R.id.type)
        var thisHead = findViewById<TextView>(R.id.Headquarters)
        var thisAllign = findViewById<TextView>(R.id.Allignment)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)

        var thisSymbol = findViewById<ImageView>(R.id.Symbol)

        thisTitle.text = "Aes Sedai"
        thisType.text = "Type: One Power Users"
        thisHead.text = "Headquarters: Tar Valon"
        thisAllign.text = "Allignment: Good"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.aessedaisymbol)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Wielders of the One Power. Since the Time of Madness, all surviving Aes Sedai are women." +
                " Widely distrusted and feared, even hated, they are blamed by many for the Breaking of the World, and are generally thought to meddle in the affairs of nations."+
                " At the same time, few rulers will be without an Aes Sedai adviser, even in lands where the existence of such a connection must be kept secret.\n\n"
        )

        var string2 = SpannableString("White Tower\n     Aes Sedai are organized into what is known as the White Tower. Only those women accepted by the White Tower can be called Aes Sedai, and all other channelers are known as wilders."
        +"Aes Sedai, by and large, are trained not only in the Power, but are taught how to manipulate those around them."+
                "Most Aes Sedai tend to place the White Tower's status, authority, and well-being above all other considerations. As such, they are seen as being very self-interested and self-serving. Many Aes Sedai excuse their behavior with the justification that whatever is best for the Tower is best for the world, but needless to say, this outlook is not shared by others. Additionally, the implementation of the Three Oaths, which make Aes Sedai incapable of telling an outright lie, have backfired with regard to their effectiveness. This is due to the fact that Aes Sedai simply use metaphorical doublespeak to circumvent the Oaths, and people are well aware of it."+
                "Most people in the Third Age trust neither the intentions nor the words of an Aes Sedai, and many others outright hate and fear them. Due to their tendency to meddle in the affairs of others, and their poor reputation, the Aes Sedai have many enemies and few allies. They are still very respected in the Borderlands and a Sister is usually chosen as advisor by the rulers of Andor and Cairhien, due their historical links to the Tower, but in most places especially in the south they are unwelcome but tolerated, and in other places, they are even openly deterred or outright banned.\n\n"
        )

        string2.setSpan(RelativeSizeSpan(2f), 0, 11, 0)


        var string3 = SpannableString("Establishment \n     The White Tower was established in 98 AB, over one hundred years before the building of the same name was completed in 202 AB. Elisane Tishar was raised at this time as the first Amyrlin Seat, the supreme head of the Tower. The city of Tar Valon was likewise established at this time and is presently ruled by a governing body selected by the Hall of the Tower. It is said that the White Tower's reign in Tar Valon is the longest of any kingdom save for the Ogier."+
        "After consolidating their power, they began punishing those \"pretending\" to be Aes Sedai. It is suggested that many of those punished in the beginning may actually have been Aes Sedai who did not submit to the authority of the Tower. Eventually, the current hierarchy and seven Ajahs developed."+
        "Though still \"servants of all,\" the present day Aes Sedai keep their own agenda. They still provide aid to any who ask, but it is said that any gift from an Aes Sedai has a price, and often one you never see coming. The Amyrlin Seat, the woman chosen to govern the Aes Sedai, has become as powerful as any king, queen, or legislative body.\n\n")

        string3.setSpan(RelativeSizeSpan(2f), 0, 13, 0)

        var string4 = SpannableString("Hierarchy\n     Aes Sedai rank themselves according to a strict hierarchy. Holders of certain positions rank at the top.\n\n")

        string4.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        var string5 = SpannableString("     Amyrlin Seat\n\n     The Amyrlin Seat is the leader of the Aes Sedai, along with the Hall of the Tower. She, as the public leader of the White Tower, is considered more powerful than any monarch in the land. The Amyrlin Seat does not always act as ambassador to other nations, but has been known to do so.\n" +
                "\n" +
                "     Tower law does not explicitly state that the Amyrlin Seat needs to be full Aes Sedai before being raised, as revealed when Egwene al'Vere is raised to the Amyrlin Seat.[2] The law does refer to the raised Amyrlin as Aes Sedai, though. This loophole was used to raise Egwene even though she was still Accepted, and her raising was used to grant her the status of Aes Sedai without having taken the test for the shawl.Amyrilyn Seat\n     Aes Sedai rank themselves according to a strict hierarchy. Holders of certain positions rank at the top.\n\n")

        string5.setSpan(RelativeSizeSpan(1.5f), 5, 17, 0)

       var string6 = SpannableString( "     The Keeper of the Chronicles\n\n     Amyrlin's second-in-command, the duties of the Keeper of the Chronicles include being secretary to the Amyrlin and overseeing the official business of the Tower. The Amyrlin chooses her upon being raised. Unlike the Amyrlin, the Keeper does not officially shed her Ajah affiliation; the Keeper wears a stole in the color of the Ajah she was raised from.  Traditionally, the Keeper comes from the same Ajah as the Amyrlin, but there have been exceptions.\n\n")

        string6.setSpan(RelativeSizeSpan(1.5f), 5, 33, 0)

        var string7 = SpannableString("     The Hall of the Tower\n\n      The Hall of the Tower is the deliberative body of the White Tower. It comprises twenty-one Sitters , three from each Ajah. The Amyrlin Seat presides over meetings of the Hall. The Hall authorizes all official policy for Tar Valon and the Aes Sedai, although some actions originate with the Amyrlin Seat. This functions as a system of checks and balances for the White Tower. The Hall is also responsible for selecting a new Amyrlin when the office falls vacant, and can remove an Amyrlin or Keeper.\n" +
                "\n" +
                "     Sitters are highly esteemed sisters who have been chosen by their Ajahs to represent their interests in the Hall of the Tower. Each Ajah has its own method for selecting new Sitters, but the Ajah Heads generally have a significant role. The Sitters also vote to raise a new Amyrlin Seat.\n\n")

        string7.setSpan(RelativeSizeSpan(1.5f), 5, 26, 0)



        var string8 = SpannableString("Ajah\n\n     Currently the Aes Sedai divide themselves into seven Ajahs, each dedicated to a particular task. Each of these sub-societies has representation on the administrative councils, its own ideology and purpose for its members, own ruling head or heads (known only to the members of that Ajah), and most have their own spy network. They also have secret weaves that are only taught to members, and own traditions governing things ranging from conduct in everyday life to what one might wear inside the White Tower."+
        "     Every Accepted requests acceptance into an Ajah when she becomes Aes Sedai. No woman is ever refused entry into the Ajah of her choice. The Amyrlin Seat is the only Aes Sedai who no longer belongs to a particular Ajah - formally she is \"of all Ajahs and of none.\" The Ajah she was raised from is significant however, since that Ajah enjoys the prestige of having a sister of their Ajah as Amyrlin, and key roles such as Keeper of the Chronicles and Mistress of Novices are commonly given to women from the Amyrlin's former Ajah.\n\n")

        string8.setSpan(RelativeSizeSpan(2f), 0, 4, 0)

        var string9 = SpannableString("     Red Ajah\n\n     Focuses on castigating the wrong and dangerous use of the One Power which mostly consists in capturing male channelers and bringing them to the Tower for gentling. Also it means, especially in the past, to search and eradicate any group of female channelers who gathered outside the White Tower law. They are the largest Ajah with approximately 200 sisters, comprising one-fifth of all Aes Sedai.[1] The leader's title is Highest and the sisters bond no Warders.\n\n")

        string9.setSpan(RelativeSizeSpan(1.5f), 5, 13, 0)


        var string10 = SpannableString("     Green Ajah\n\n     Also called the 'Battle Ajah', Greens stand ready for the Last Battle. They are the second largest Ajah, and the leader's title is Captain-General. Green sisters bond as many Warders as they wish, though a Green with only one Warder is typically married to him.\n\n")

        string10.setSpan(RelativeSizeSpan(1.5f), 5, 15, 0)


        var string11 = SpannableString("     Gray Ajah\n\n     Focuses on diplomacy and mediation in politics. They are the third largest Ajah, and the leader's title is Head Clerk.\n\n")

        string11.setSpan(RelativeSizeSpan(1.5f), 5, 14, 0)


        var string12 = SpannableString("     Brown Ajah\n\n     Focuses on gathering and preserving knowledge. They are the fourth largest Ajah, and are governed by a ruling council, the head of which is called First Chair. The librarians of the Tower Library are mostly Brown sisters.\n\n")

        string12.setSpan(RelativeSizeSpan(1.5f), 5, 15, 0)

        var string13 = SpannableString("     Blue Ajah\n\n     Focuses on causes of righteousness and justice. They are the sixth largest Ajah, and the leader's title is First Selector. They have the largest eyes-and-ears network.\n\n")

        string13.setSpan(RelativeSizeSpan(1.5f), 5, 14, 0)

        var string14 = SpannableString("     White Ajah\n\n     Focuses on logic and philosophy. They are the smallest Ajah, and the leader's title is First Reasoner. The current First Reasoner is Ferane Neheran. White sisters rarely bond Warders, and apparently they have no eyes-and-ears network.\n\n")

        string14.setSpan(RelativeSizeSpan(1.5f), 5, 15, 0)

        var string15 = SpannableString("     Black Ajah\n\n     There are rumors, hotly denied and never safely mentioned in front of any Aes Sedai, of a Black Ajah, dedicated to serving the Dark One\n\n")

        string15.setSpan(RelativeSizeSpan(1.5f), 5, 15, 0)

        var string16 = SpannableString("Becoming an Aes Sedai\n\n     Though Aes Sedai do not openly recruit, all women found by Aes Sedai who were born with the spark and all other women of appropriate age who can channel and wish to learn how are entered in the novice book to begin training.\n\n")

        string16.setSpan(RelativeSizeSpan(2f), 0, 21, 0)

        var string17 = SpannableString("     Novices\n\n     Novices attend classes taught by full sisters and by Accepted concerning the One Power. They are treated as children because they could easily harm themselves with the Power and lack the knowledge to protect themselves. They have hardly any time for themselves, because when they are not training they are usually doing chores.\n"+
                "Novices who have little potential in the Power or who are otherwise unsuitable to eventually become Aes Sedai are taught just enough to keep them from hurting themselves. For the others, when the Mistress of Novices determines that a candidate is ready, the novice is summoned to a ceremony to be raised to Accepted. She has the right to refuse the ceremony twice, but on the third time if she refuses she will be put out of the Tower. Once she starts she cannot stop, or she will be put out of the Tower.\n" +
                "\n" +
                "     The ceremony consists of the novice stepping unclothed through a special three-arched ter'angreal that forces her to face her fears to test her dedication to the White Tower.\n\n")


        string17.setSpan(RelativeSizeSpan(1.5f), 5, 12, 0)

        var string18 = SpannableString("     Accepted\n\n     Once Accepted, the women have more privileges and are not usually forced to do chores. They can also wear the Great Serpent ring of the Aes Sedai, but only on the ring finger of their left hand. They train harder and also teach courses to novices. They usually spend several years more as Accepted, and when they are deemed ready to become full Aes Sedai they are summoned for another testing ceremony.\n" +
                "\n" +
                "     The Accepted is brought to a chamber with a specialized ter'angreal. The Accepted steps in, seeks out a symbol on the ground, and weaves one hundred very complex weaves while retaining perfect composure, seeking the symbol after each one. Sisters use the ter'angreal to attempt to distract; some of the distractions can be rather personal.\n" +
                "\n" +
                "     If an Accepted passes the test, she spends one last night in the Accepted quarters in quiet contemplation. The next day, she is brought to another ceremony with the Amyrlin and representatives of all seven Ajahs present. The Accepted then swears the Three Oaths on the Oath Rod. Once she has sworn the oaths, the Accepted is now an Aes Sedai and asks the sisters of a particular Ajah if she may join. Once an Accepted is raised to Aes Sedai, she has generally all but chosen her Ajah already.\n\n")


        string18.setSpan(RelativeSizeSpan(1.5f), 5, 13, 0)
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7,string8,string9,string10,string11,string12,string13,string14,string15,string16,string17,string18)
    }
}