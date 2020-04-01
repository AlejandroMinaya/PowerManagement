package com.itesm.powermanagement.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.widget.TextView

class BatteryStatusReceiver(val targetText: TextView) : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val status = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)
        if(status == BatteryManager.BATTERY_PLUGGED_AC) {
            targetText.text = "Plugged to AC"
        } else if (status == BatteryManager.BATTERY_PLUGGED_USB){
            targetText.text = "Plugged to USB"
        } else if (status == BatteryManager.BATTERY_PLUGGED_WIRELESS) {
            targetText.text = "Plugged to Wireless Charger"
        } else {
            targetText.text = "On battery. Not Plugged"
        }

    }
}