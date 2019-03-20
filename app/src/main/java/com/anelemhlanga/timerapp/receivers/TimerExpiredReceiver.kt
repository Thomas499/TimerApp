package com.anelemhlanga.timerapp.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.anelemhlanga.timerapp.Util.Notification
import com.anelemhlanga.timerapp.Util.PrefUtil
import com.anelemhlanga.timerapp.views.TimerActivity


class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Notification.showTimerExpired(context)
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

    }
}
