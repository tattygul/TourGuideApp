package com.example.tourguideapp.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.tourguideapp.Place
import com.example.tourguideapp.PlaceAdapter
import com.example.tourguideapp.R


class ParkFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_park, container, false)
        val places = ArrayList<Place>()

        places.add(Place(R.drawable.dz, "Erkindik Ave", "Just walk down beautiful " +
                "Erkindik itself, which is beautiful with all the greenery and trees. The avenue was" +
                " first planted by the tsarist-ear Russians in the late 1800s and the street was " +
                "called Bulvarnaya (Boulevard). It became Dzerzhinsky during Soviet times after one " +
                "of the secret policemen during Stalin's times (Felix Dzerzhinsky) and then became Erkindik " +
                "(Freedom in Kyrgyz) after the Soviet Union collapsed.", "42.52686419435135, 72.3817464308239", "0557758759")
        )

        places.add(Place(R.drawable.south, "Victory Park","The Victory park is a beautifully maintained area," +
                "with wide lawns and many flower beds. On entering the park, the first monument seen, " +
                "is a beige stone with three stars on it that is dedicated to the 49 Kyrygzstan soldiers" +
                " that died in the Batken Region (Southern Kyrygzstan) between 1999-2000.We had visited the Batken monument in " +
                "Kiev Street, near to Ala Too Square, on the previous day.", "42.52686419435135, 72.3817464308239", "0557758759"))

        val itemAdapter: PlaceAdapter = PlaceAdapter(context!! as Activity?, places)
        val list = root.findViewById<ListView>(R.id.listPark)
        list.adapter = itemAdapter
        return root
    }


}