package com.conamobile.clicktoeffectcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var addAlarmFab: FloatingActionButton
    private lateinit var addPersonFab: FloatingActionButton
    private lateinit var addFab: ExtendedFloatingActionButton
    var isAllFabVisible: Boolean?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFab = findViewById(R.id.add_fab)
        addAlarmFab = findViewById(R.id.add_alarm_fab)
        addPersonFab = findViewById(R.id.add_person_fab)

        isAllFabVisible = false
        addFab.shrink()

        addFab.setOnClickListener {
            isAllFabVisible = if (!isAllFabVisible!!){
                addAlarmFab.show()
                addPersonFab.show()
                addFab.extend()
                true
            }else{
                addAlarmFab.hide()
                addPersonFab.hide()
                addFab.shrink()
                false
            }
        }

        addAlarmFab.setOnClickListener {
            Toast.makeText(this, "Open Alarm", Toast.LENGTH_SHORT).show()
        }
        addPersonFab.setOnClickListener {
            Toast.makeText(this, "Open Person", Toast.LENGTH_SHORT).show()
        }

    }
}