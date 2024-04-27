package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7minutesworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // to setup the tool bar as the action bar
        setSupportActionBar(binding.toolbarExercise)
        // to activate the back button
        if (supportActionBar != null) supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // to add navigation functionality to the toolbar
        binding.toolbarExercise.setNavigationOnClickListener{
            // this method is now deprecated but still working , TODO letter I need to figer out the right way to do so
            onBackPressed()
        }
    }
}