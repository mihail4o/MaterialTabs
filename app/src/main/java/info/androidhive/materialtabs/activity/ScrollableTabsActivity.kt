package info.androidhive.materialtabs.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

import java.util.ArrayList

import info.androidhive.materialtabs.R
import info.androidhive.materialtabs.fragments.EightFragment
import info.androidhive.materialtabs.fragments.FiveFragment
import info.androidhive.materialtabs.fragments.FourFragment
import info.androidhive.materialtabs.fragments.NineFragment
import info.androidhive.materialtabs.fragments.OneFragment
import info.androidhive.materialtabs.fragments.SevenFragment
import info.androidhive.materialtabs.fragments.SixFragment
import info.androidhive.materialtabs.fragments.TenFragment
import info.androidhive.materialtabs.fragments.ThreeFragment
import info.androidhive.materialtabs.fragments.TwoFragment

class ScrollableTabsActivity : AppCompatActivity() {

    private var toolbar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrollable_tabs)

        toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById(R.id.viewpager) as ViewPager?
        setupViewPager(viewPager!!)

        tabLayout = findViewById(R.id.tabs) as TabLayout?
        tabLayout!!.setupWithViewPager(viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFrag(OneFragment(), "ONE")
        adapter.addFrag(TwoFragment(), "TWO")
        adapter.addFrag(ThreeFragment(), "THREE")
        adapter.addFrag(FourFragment(), "FOUR")
        adapter.addFrag(FiveFragment(), "FIVE")
        adapter.addFrag(SixFragment(), "SIX")
        adapter.addFrag(SevenFragment(), "SEVEN")
        adapter.addFrag(EightFragment(), "EIGHT")
        adapter.addFrag(NineFragment(), "NINE")
        adapter.addFrag(TenFragment(), "TEN")
        viewPager.adapter = adapter
    }

    internal inner class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFrag(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList[position]
        }
    }
}
