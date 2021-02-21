package com.example.tourguideapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tourguideapp.fragments.MonumentFragment
import com.example.tourguideapp.fragments.ParkFragment
import com.example.tourguideapp.fragments.RestaurantFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
//        val places = ArrayList<Place>();
//
//        places.add(Place(R.drawable.manas, "Gumbez of Manas", "The ancient tomb of Kyrgyz hero Manas, watch mountain and museum. Manas is a hero " +
//                "who saved kyrgyz tribes from kalmaks and tribes from China. " +
//                "You could climb the watch mountain and see the vast valley of Talas," +
//                " then visit museum to see artefacts, ancient household and military items.", "location", "9999"))
//
//        places.add(Place(R.drawable.bukhara, "title", "info", "address", "ewdjow"))
//
//        val placeAdapter: PlaceAdapter = PlaceAdapter(this, places)
//
//
//        list.adapter = placeAdapter
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MonumentFragment(), "Monuments")
        adapter.addFragment(ParkFragment(), "Parks")
        adapter.addFragment(RestaurantFragment(), "Restaurants")

        viewPager.adapter = adapter

        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)
    }

}

