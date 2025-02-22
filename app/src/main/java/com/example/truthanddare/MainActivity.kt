package com.example.truthanddare

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Use XML layout

        // Reference UI elements
        val truthText: TextView = findViewById(R.id.truthText)
        val dareText: TextView = findViewById(R.id.dareText)
        val generateButton: Button = findViewById(R.id.generateButton)

        // Set button click listener
        generateButton.setOnClickListener {
            truthText.text = "Truth: " + getRandomTruth()
            dareText.text = "Dare: " + getRandomDare()
        }
    }

    fun getRandomTruth(): String {
        val truths = listOf(
            "Describe in detail your wildest sexual experience so far.",
            "What’s the most adventurous place you’ve ever had sex?",
            "Have you ever had a one-night stand? How did it happen?",
            "What’s your biggest sexual fantasy that you haven’t tried yet?",
            "Describe your best orgasm ever.",
            "Have you ever had sex with more than one person in a single day?",
            "What’s the kinkiest thing you’ve ever done?",
            "Have you ever used food in the bedroom? If so, how?",
            "Do you prefer rough or slow, sensual sex?",
            "Have you ever been caught masturbating? What happened?",
            "What’s the sexiest thing someone has ever said to you?",
            "Have you ever had sex in a car? How was it?",
            "Would you rather be in control or be dominated?",
            "Have you ever tried role-playing? What was your favorite scenario?",
            "What’s your favorite way to be touched?",
            "Have you ever hooked up with someone in a public place?",
            "What’s your favorite position and why?",
            "Do you like dirty talk during sex? If so, what’s your go-to line?",
            "What’s the most sensitive part of your body?",
            "Describe what an ideal night of passion looks like for you.",
            "Have you ever had sex in the shower?",
            "What’s your ultimate turn-on?",
            "Have you ever had a forbidden affair?",
            "What’s your secret guilty pleasure in bed?",
            "Have you ever fantasized about someone here?",
            "Would you ever film yourself during sex?",
            "Have you ever tried using toys in bed?",
            "What’s the longest you’ve gone without sex?",
            "What’s one thing you’ve always wanted to try but never had the chance?",
            "Describe your hottest dream.",
            "What’s your opinion on public displays of affection?",
            "Have you ever had a secret friends-with-benefits situation?",
            "What’s the wildest thing you’ve ever done at a party?",
            "Have you ever had a sexual experience that surprised you?",
            "Do you enjoy teasing or being teased more?",
            "Have you ever had a dream about someone in this room?",
            "Would you rather have a quickie or a long passionate night?",
            "Have you ever sexted someone? Read out one of your messages.",
            "What’s the hottest thing a partner has ever done for you?",
            "Do you prefer morning sex or late-night encounters?",
            "Have you ever tried mutual self-pleasure with a partner?"
        )
        return truths.random()
    }

    fun getRandomDare(): String {
        val dares = listOf(
            "Give a slow, teasing kiss to the person on your right anywhere they choose.",
            "Whisper the dirtiest thing you want to do to someone here.",
            "Remove an article of clothing using only your teeth.",
            "Perform a sexy lap dance for someone of your choice for 30 seconds.",
            "Let someone lick whipped cream off your body.",
            "Simulate an orgasm using sounds and movements for 10 seconds.",
            "Let the group choose a body part for you to kiss on someone.",
            "Give a sensual massage to the person across from you for 1 minute.",
            "Do a blindfolded make-out session with someone chosen by the group.",
            "Send a steamy text to the last person you messaged.",
            "Trace your tongue along someone's collarbone.",
            "Perform a strip tease down to your underwear.",
            "Bite the earlobe of the person closest to you.",
            "Let someone draw a naughty message on your body with their finger.",
            "Act out your favorite sexual position (fully clothed).",
            "Give someone a deep, lingering kiss on their inner thigh (clothes on).",
            "Take a body shot off the person of your choice.",
            "Describe in detail your favorite sexual experience so far.",
            "Let the person next to you send a flirty voice note from your phone.",
            "Kiss someone's neck for 15 seconds.",
            "Hold hands intimately with someone for 2 minutes.",
            "Let someone whisper something naughty in your ear.",
            "Do your best impression of a sexy dance.",
            "Exchange a piece of clothing with someone.",
            "Massage someone’s thighs for 30 seconds.",
            "Lick honey or syrup off someone’s finger.",
            "Give a lingering kiss on someone's hand.",
            "Sit on someone’s lap until the next round.",
            "Let someone tie your hands for a round.",
            "Whisper your favorite dirty word to the person beside you.",
            "Spin a bottle and kiss whoever it lands on.",
            "Perform an erotic dance for someone while maintaining eye contact.",
            "Give someone a foot massage while blindfolded.",
            "Play a game of ‘hot and cold’ on someone’s body using only your tongue.",
            "Let someone draw a small heart somewhere intimate on your body.",
            "Kiss someone using only your tongue for 20 seconds.",
            "Whisper in someone’s ear what you want them to do to you tonight."
        )
        return dares.random()
    }
}
