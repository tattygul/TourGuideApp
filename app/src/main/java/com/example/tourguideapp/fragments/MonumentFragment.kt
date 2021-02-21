package com.example.tourguideapp.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.tourguideapp.Place
import com.example.tourguideapp.PlaceAdapter
import com.example.tourguideapp.R
import kotlinx.android.synthetic.main.fragment_monument.*
import java.util.zip.Inflater

class MonumentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root: View = inflater.inflate(R.layout.fragment_monument, container, false)
        val places = ArrayList<Place>()

        places.add(
            Place(
                R.drawable.manas,
                "Gumbez of Manas",
                "The Gumbez of Manas is made of brick, " +
                        "has Arabic inscriptions, is decorated in traditional Kyrgyz style, and topped with a dome.  " +
                        "Something you may notice and find odd is that upon inspection of the mausoleum, " +
                        "there’s an inscription on that outside that says the daughter of a wealthy ruler" +
                        " from the Middle Ages is buried there, not Manas.  However, as the legend goes, it was " +
                        "actually commissioned by Kanykei, Manas’s wife, and built by expert craftsmen all the way " +
                        "from Bukhara and Samarkand.  The inscription was merely a ruse to confuse the enemies of" +
                        " Manas at the time so they would not defame his resting place.",
                "42.52686419435135, 72.3817464308239",
                "0557758759"
            )
        )

        val itemAdapter: PlaceAdapter = PlaceAdapter(context!! as Activity?, places)
        val list = root.findViewById<ListView>(R.id.listMonument)
        list.adapter = itemAdapter
        return root
    }

}