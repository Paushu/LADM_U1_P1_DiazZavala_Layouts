package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.button.MaterialButton
import mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts.ui.main.SectionsPagerAdapter
import mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager

        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab
        val pedido : MaterialButton = binding.pedido

        fab.setOnClickListener { view ->
            llamarSettings()
        }

        pedido.setOnClickListener { view ->
            llamarPedidos()
        }

    }




    fun llamarSettings() {
        val settingsV = Intent(this, SettingsActivity::class.java)
        //::Operador de gambito
        startActivity(settingsV)}

    fun llamarPedidos() {
        val PedidosV = Intent(this, Pedidos::class.java)
        //::Operador de gambito
        startActivity(PedidosV)}
}