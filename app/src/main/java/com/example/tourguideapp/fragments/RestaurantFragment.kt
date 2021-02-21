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


class RestaurantFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root: View = inflater.inflate(R.layout.fragment_restaurant, container, false)
        val places = ArrayList<Place>()

        places.add(Place(R.drawable.frunze, "Frunze Restaurant", "Frunze is a restaurant" +
                " for fancy and big occasiona. Seems to cater for local elite gatherings, dinners and " +
                "weddings. We had quiet dinner. Service was polite and waiter spoke good English. Salad " +
                "was tasty, beetroot wrap with cheese inside was very good, yak-meet beef was excellent.", "42.52686419435135, 72.3817464308239",
            "0557758759"))

        places.add(Place(R.drawable.bukhara, "Bukhara Restaurant", "The restaurant moved from the " +
                "old location on Chui Avenue to Toktogula street. Very nice atmosphere and really good Central Asian " +
                "food. Service is good. Definitely recommended.", "42.52686419435135, 72.3817464308239",
            "0557758759"))


        val itemAdapter: PlaceAdapter = PlaceAdapter(context!! as Activity?, places)
        val list = root.findViewById<ListView>(R.id.listRestaurant)
        list.adapter = itemAdapter
        return root
    }


}