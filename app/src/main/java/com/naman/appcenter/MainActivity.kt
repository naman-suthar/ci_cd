package com.naman.appcenter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "47f276ae-833b-4eff-995f-a0af2e595af3",
            Analytics::class.java, Crashes::class.java
        )
        Toast.makeText(this,"tHIS IS NOT WORKING",Toast.LENGTH_SHORT).show()
    }
}