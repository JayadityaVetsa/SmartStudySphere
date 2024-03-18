package com.example.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityNewQuizBinding


class NewQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNewQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for Next button
        binding.nextButton.setOnClickListener {
            // Retrieve text from input fields
            val questionText = binding.questionEditText.text.toString()
            val option1Text = binding.option1EditText.text.toString()
            val option2Text = binding.option2EditText.text.toString()
            val option3Text = binding.option3EditText.text.toString()
            val option4Text = binding.option4EditText.text.toString()
            val correctAnswerText = binding.correctAnswerEditText.text.toString()

            // Check if any input is empty
            if (questionText.isEmpty() || option1Text.isEmpty() || option2Text.isEmpty() ||
                option3Text.isEmpty() || option4Text.isEmpty() || correctAnswerText.isEmpty()) {
                // Show toast message if any input is empty
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Clear input fields
                binding.questionEditText.text = null
                binding.option1EditText.text = null
                binding.option2EditText.text = null
                binding.option3EditText.text = null
                binding.option4EditText.text = null
                binding.correctAnswerEditText.text = null

                // Proceed to next question or perform other actions as needed
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
