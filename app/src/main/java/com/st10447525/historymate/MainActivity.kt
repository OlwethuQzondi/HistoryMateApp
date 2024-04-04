package com.st10447525.historymate
//ST10447525 OLWETHU Q ZONDI
//

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        searchButton= findViewById(R.id.searchButton)
        clearButton= findViewById(R.id.clear_text_button)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        searchButton.setOnClickListener{
            // create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full and age is in range between 20 and 100
            if (age != null && age in 20..100){
                // when age is 30 display ToBeAdded else when is .. and so on
                val Historyfigure = when (age){
                    33 -> "Saint Barbara(33)(0273AD-0306)" +
                            "You are the same age as Saint Barbara when she passed away. Saint Barbara was an early Christian Lebanese and Greek saint and martyr. She is also known as the Great Martyr Barbara in the Eastern Orthodox Church. Not much is known about her life and work as there is no mention of her in the authentic early Christian writings."
                    40 -> "La Malinche(40)(1442-1483)" +
                            "You are the same age as La Malinche when he passed away. Born in Rowen, France, The King of England for several years from 1461 until his death in 1483, Edward IV of England was a central figure in the Wars of the Roses. He died at the age of 40. The cause of his death remains unknown."
                    51 -> "Michael Jackson(51)(1958-2009)" +
                            "You are the same age as Michael Jackson when he passed away. The King Of Pop and an international superstar, Michael Jackson was a musical entertainer whose work with both the Jackson 5 and solo-won accolades and hearts worldwide. Equally popular were his unique dance moves that created sensation and shaped future dance styles."
                    61 -> "Theodore Roosevelt(61)(1858-1919)" +
                            "You are the same age as Theodore Roosevelt when he passed away. The 26th president of the United States, Theodore Roosevelt is generally ranked as one of the five best presidents of the century. A man of many talents, he was a politician, conservationist, naturalist and writer. He supported Progressive Era policies in th early 20th centery and championed his Square Deal domestic policies."
                    70 -> "Nicolaus Corpenicus(70)(1473-1543)" +
                            "You are the same age as Nicolaus Corpernicus when he passed. Nicolaus Corpenicus was a mathematician and astronomer. He is credited with formulating Heliocentrism, which led to the Corpenican Revolution. Although Aristarchus of Samos had formulated Heliocentrism 18 centuries earlier, Corpenicus was responsible for popularizing it."
                    80 -> "John DeLorean(80)(1925-2005)" +
                            "You are the same age as John DeLorean when he passed away. John DeLorean was an American inventor and engineer. Highly regarded for his work at General Motors, John DeLorean was an influencial figure in the US automobile manufacture industry. He is credited with founding the popular American automobile manufacturer, The DeLorean Motor Company."
                    90 -> "Colonel Sanders(90)(1890-1980)" +
                            "You are the same age as Colonel Sanders when he passed away. Colonel Sanders is the man who revolutionised the American fast food industry for founding the restaurant chain Kentucky Fried Chicken (KFC). Establishing a style trademark by wearing a white suit and black string tie, Sanders went on to become a symbol of the KFC brand. Such is the popularity of the brand, the symbol is recognised all over the world."
                    93 -> "Emilie Schindler(93)(1907-2001)" +
                            "You are the same age as Emilie Schindler when she passed away. Emilie Schindler is best remembered as the wife of Oskar Schindler, the German industrialist who saved over a thousand Jews from the Nazis by employing them at his factory and inspired the iconic Steven Spielberg moves Schindler's List. She later fled to Argentina with Oskar but was abandoned by him."
                    100 -> "Lao Tzu (Laozi) (100) (0471BC-0571BC)" +
                            "You are the same age as Lao Tzu when he passed away. Chinese philosopher Lao Tzu or Laozi, who is said to have lived in the 6th-century BC by some and in the 4th-century BC by others, wrote the Tuo Te Ching. He founded Taoism and is a legendary figure or deity. The Tang Dynasty empires claimed he had funded their lineage."
                    else -> null
                }

            val message = if (Historyfigure != null) "The Historicalfigure's name is $Historyfigure."
                else "No historical figure found with the entered age."
                resultTextView.text = message


            }else {
                resultTextView.text = "invalid input. Please enter a valid age between 20 and 100."
            }


        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }

    }
}