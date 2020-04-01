package com.itesm.powermanagement.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.widget.TextView

class BatteryLevelReceiver(val targetText: TextView) : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        targetText.text = intent.getIntExtra(
            BatteryManager.EXTRA_LEVEL, -1
        ).toString() + "%"
    }
}