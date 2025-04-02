package vcmsa.ci.mealappplan
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {

    var resetbutton: Button? = null
    var showMeal: Button? = null
    var textView2: TextView? = null
    var searchView: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        resetbutton = findViewById<View>(R.id.main) as Button
        showMeal = findViewById<View>(R.id.showMealbutton) as Button
        textView2 = findViewById<View>(R.id.textView2) as TextView
        searchView = findViewById<View>(R.id.searchView) as EditText


        // Show meal suggestions when showMealButton is clicked
        showMeal!!.setOnClickListener {
            val timeOfDayInput =
                searchView!!.text.toString() // Get the input from SearchView

            if (timeOfDayInput == "morning") {
                textView2!!.text = "Break the fast: Whole Grain toast\nOatmeal"
            } else {
                if (timeOfDayInput == "mid-morning") {
                    textView2!!.text = "Snack: Greek Yogurt\nSmoothie"
                } else {
                    if (timeOfDayInput == "afternoon") {
                        textView2!!.text = "Lunch: Buffalo chicken wrap\nChicken salad sandwich"
                    } else {
                        if (timeOfDayInput == "mid-afternoon") {
                            textView2!!.text = "Snack: Berries\nPear cheese"
                        } else {
                            if (timeOfDayInput == "dinner") {
                                textView2!!.text = "Dinner: Spaghetti with Meatballs\nCottage pie"
                            } else {
                                if (timeOfDayInput == "after dinner") {
                                    textView2!!.text = "Dessert: Chocolate Icecream \nVanilla cake"
                                } else {
                                    textView2!!.text =
                                        "Invalid time of day. Please enter a valid time."
                                }
                            }
                        }
                    }
                }

                // Reset the input and suggestions when resetButton is clicked
                resetbutton!!.setOnClickListener {
                    searchView!!.setText("")  // Clear the SearchView input
                    textView2!!.text = ""  // Clear the meal suggestions TextView
                }
                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(
                        systemBars.left,
                        systemBars.top,
                        systemBars.right,
                        systemBars.bottom
                    )
                    insets
                }
            }
        }
    }
}