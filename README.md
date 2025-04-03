# Assignment-1
Meal App plan
The Meals App 

Katlego Ditlhake 

Assignment 1 

Varsity College 

 

The purpose of the app 

A meal plan app is an app that helps you to store your meals from anywhere, they might come from your magazine, internet, or even cookbook. It gives you access to plan your meal in your own way, you may use your smart phone, tablet, iPad and your computer. 

The Meal app plan helps everyone stick to their specific health goals it also helps them to save time and manage their grocery shopping more successfully so. It allows users to create meal plans, track their process of consuming and utilizing nutrients from what they eat and drink, and get recipe suggestions adjusted to suit their preferences. 

 

DESIGN CONSIDERATIONS: 

1.Simplicity 

My layout is straightforward, simple, clear and easy to get access to so that everyone who is going to use it cannot run out of patience and get to it quickly.it is designed to be understandable and easy to get to it without having to get overwhelmed. 

2.Consistency  

The app is consistent visual identity for users. It has a cohesive look that shows missions and values. Logo, colour scheme, imagery and the layout will be my key elements of design. This will help users to not get confused meanwhile using the app. 

3.Readability 

Everything that a person who needs to read is all clear. This includes all texts, all the ingredients and everything that is readable. I used bold letters, colourful fonts and front size letters to make it easier for all users to see and be able to read them. 

4.Feedback 

I made sure that the users of the app can comment on the app so they can give feedback about the app whether there are some foods that are success, or I should add more food, add some ingredients to their meals. It is important to know what others think about the food they had. 

5.Placement 

I am going to some templates, receipt suggestion, calendar that demonstrates upcoming meals, types of meals I have as well as customizable menu to lead the user of the app. A click button where a user can click to find menus. 

YouTube link 

https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2FCtoEhFvgFpE%3Fsi%3DqlQWSrUHypcUrps_&data=05%7C02%7CST10498079%40vcconnect.edu.za%7C71700d5189eb46026b4e08dd729bedf9%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638792736263159757%7CUnknown%7CTWFpbGZsb3d8eyJFbXB0eU1hcGkiOnRydWUsIlYiOiIwLjAuMDAwMCIsIlAiOiJXaW4zMiIsIkFOIjoiTWFpbCIsIldUIjoyfQ%3D%3D%7C0%7C%7C%7C&sdata=12aSi9mvhV2pwWiVsw3WwdDO%2FYgRvdNFqXH91Uu6piI%3D&reserved=0 

Git hub link 

https://github.com/ST10498079/Assignment-1.git 

I chose this name because i wanted to be acknowledged by people because the work I have done to create an app for them to get access to their daily meals easily. Big letters and bold font to attract people to visit my app. The picture I used is to represent the the purpose of the app. When you enter the app, you will see a text written” time of the day” that is where you will enter the time of the day like” morning” and press the button that says show meals. After pressing the button meal options will appear according to the time of the day you entered on the text view. The reset button will clear everything out.  

 

 

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

 

 

 

 

 

 

 

 

 

Reference  

Appleton, K.M., Bray, J., Price, S., Liebchen, G., Jiang, N., Mavridis, I., Saulais, L., Giboreau, A., Perez-Cueto, F.J., Coolen, R. and Ronge, M., 2019. A mobile phone app for the provision of personalized food-based information in an eating-out situation: development and initial evaluation. JMIR formative research, 3(4), p.e12966. 

Blaas, R.M., 2019. Recipe and Meal management mobile application for Willieanne. nl (Bachelor's thesis, University of Twente). 

Carter, M.C., Burley, V.J., Nykjaer, C. and Cade, J.E., 2013. ‘My Meal Mate’(MMM): validation of the diet measures captured on a smartphone application to facilitate weight loss. British Journal of Nutrition, 109(3), pp.539-546 

Chiva, M., 1997. Cultural aspects of meals and meal frequency. British Journal of Nutrition, 77(S1), pp.S21-S28. 

Fitriyah, H., Apriani, N.F., Riyanto, S., Wijaya, C., Octavia, L., Fitrianingsih, Siagian, A.H.A.M., Kushadiani, S.K.K., Hakim, S.A., Lestari, D.A. and Telaumbanua, K.D., 2023, October. SobatGizi App for Suggesting Adequate Meal Portions. In Proceedings of the 8th International Conference on Sustainable Information Engineering and Technology (pp. 498-505). 

Sato, H., Sudo, N., Nagao-Sato, S. and Tsuboyama-Kasaoka, N., 2025. Foods provided at shelters during a heavy rain disaster: comparison of weighed food records between different numbers of days. British Journal of Nutrition, 133(2), pp.253-261. 

 

 

 

 

 

  

 

 

 

  
