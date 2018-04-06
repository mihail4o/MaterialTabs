package info.androidhive.materialtabs.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button

import info.androidhive.materialtabs.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var toolbar: Toolbar? = null
    private var btnSimpleTabs: Button? = null
    private var btnScrollableTabs: Button? = null
    private var btnIconTextTabs: Button? = null
    private var btnIconTabs: Button? = null
    private var btnCustomIconTextTabs: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        btnSimpleTabs = findViewById(R.id.btnSimpleTabs) as Button?
        btnScrollableTabs = findViewById(R.id.btnScrollableTabs) as Button?
        btnIconTextTabs = findViewById(R.id.btnIconTextTabs) as Button?
        btnIconTabs = findViewById(R.id.btnIconTabs) as Button?
        btnCustomIconTextTabs = findViewById(R.id.btnCustomIconTabs) as Button?

        btnSimpleTabs!!.setOnClickListener(this)
        btnScrollableTabs!!.setOnClickListener(this)
        btnIconTextTabs!!.setOnClickListener(this)
        btnIconTabs!!.setOnClickListener(this)
        btnCustomIconTextTabs!!.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnSimpleTabs -> startActivity(Intent(this@MainActivity, SimpleTabsActivity::class.java))
            R.id.btnScrollableTabs -> startActivity(Intent(this@MainActivity, ScrollableTabsActivity::class.java))
            R.id.btnIconTextTabs -> startActivity(Intent(this@MainActivity, IconTextTabsActivity::class.java))
            R.id.btnIconTabs -> startActivity(Intent(this@MainActivity, IconTabsActivity::class.java))
            R.id.btnCustomIconTabs -> startActivity(Intent(this@MainActivity, CustomViewIconTextTabsActivity::class.java))
        }
    }
}
