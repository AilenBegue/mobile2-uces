package mobile2.clase1.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNum1: EditText
    private lateinit var editTextNum2: EditText
    private lateinit var btnMainSuma: Button
    private lateinit var btnMainResta: Button
    private lateinit var btnMainMultiplicacion: Button
    private lateinit var btnMainDivision: Button
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editTextNum1 = findViewById(R.id.editTextNum1)
        editTextNum2 = findViewById(R.id.editTextNum2)
        btnMainSuma = findViewById(R.id.btnMainSuma)
        btnMainResta = findViewById(R.id.btnMainResta)
        btnMainMultiplicacion = findViewById(R.id.btnMainMultiplicacion)
        btnMainDivision = findViewById(R.id.btnMainDivision)
        textViewResultado = findViewById(R.id.textViewResultado)

        btnMainSuma.setOnClickListener {
            funSuma()
        }

        btnMainResta.setOnClickListener {
            funResta()
        }

        btnMainMultiplicacion.setOnClickListener {
            funMultiplicacion()
        }

        btnMainDivision.setOnClickListener {
            funDivision()
        }
    }

    private fun funSuma(){
        val num1 = Integer.parseInt(editTextNum1.text.toString())
        val num2 = Integer.parseInt(editTextNum2.text.toString())
        val result = num1 + num2

        textViewResultado.text = result.toString()
        textViewResultado.visibility = View.VISIBLE
    }

    private fun funResta(){
        val num1 = Integer.parseInt(editTextNum1.text.toString())
        val num2 = Integer.parseInt(editTextNum2.text.toString())
        val result = num1 - num2

        textViewResultado.text = result.toString()
        textViewResultado.visibility = View.VISIBLE
    }

    private fun funMultiplicacion(){
        val num1 = Integer.parseInt(editTextNum1.text.toString())
        val num2 = Integer.parseInt(editTextNum2.text.toString())
        val result = num1 * num2

        textViewResultado.text = result.toString()
        textViewResultado.visibility = View.VISIBLE
    }

    private fun funDivision(){
       // val num1 = Integer.parseInt(editTextNum1.text.toString())
       // val num2 = Integer.parseInt(editTextNum2.text.toString())

        val num1 = editTextNum1.text.toString().toDouble()
        val num2 = editTextNum2.text.toString().toDouble()

        val result = num1 / num2

        textViewResultado.text = result.toString()
        textViewResultado.visibility = View.VISIBLE
    }



}