package nl.k0497.appcreaie

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        foodList = ArrayList()
        foodList.add(Food(R.drawable.frikandel, "Broodje frikandel van de frituur"))
        foodList.add(Food(R.drawable.bamihap, "Lekkere bamihap van de frituur"))
        foodList.add(Food(R.drawable.berenklauw, "Lekkere berenklauw van de frituur"))
        foodList.add(Food(R.drawable.eierballen, "Lekkere eierbal van de frituur"))
        foodList.add(Food(R.drawable.hamburger, "Lekkere zelfgemaakte hamburger"))
        foodList.add(Food(R.drawable.kaassouffle, "Lekkere kaassouflé van de frituur"))
        foodList.add(Food(R.drawable.kapsalon, "Lekkere zelfgemaakte kapsalon"))
        foodList.add(Food(R.drawable.kroket "Lekkere kroket van de frituur"))
        foodList.add(Food(R.drawable.mexicano, "Lekkere mexicanovan de frituur"))
        foodList.add(Food(R.drawable.patat, "Lekkere patat van de frituur"))
        foodList.add(Food(R.drawable.turkse_pizza, "Lekkere zelfgemaakte turkse pizza"))
        foodList.add(Food(R.drawable.uien_ringen "Lekkere uien ringen van de frituur"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick={
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("foodName", it.name)
            intent.putExtra("foodImage", it.image)
            startActivity(intent)
        }
    }
}
