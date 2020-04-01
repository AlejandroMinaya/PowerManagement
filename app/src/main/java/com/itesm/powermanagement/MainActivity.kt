package com.itesm.powermanagement

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itesm.powermanagement.receivers.BatteryLevelReceiver
import kotlinx.android.synthetic.main.activity_main.*
import com.itesm.powermanagement.receivers.BatteryStatusReceiver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val batteryStatusReceiver = BatteryStatusReceiver(
            batteryStatusText
        )
        val batteryLevelReceiver = BatteryLevelReceiver(
            batteryLevelText
        )

        this.registerReceiver(
            batteryStatusReceiver,
            IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        )
        this.registerReceiver(
            batteryLevelReceiver,
            IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        )
    }
}
