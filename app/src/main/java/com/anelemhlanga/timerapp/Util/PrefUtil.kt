package com.anelemhlanga.timerapp.Util

import android.content.Context
import android.preference.PreferenceManager
import com.anelemhlanga.timerapp.views.TimerActivity


class PrefUtil {

    companion object {

        private const val TIMER_LENGTH_ID = "com.anelemhlanga.timerapp.timer_length"
        fun getTimerLength(context: Context): Int{
            var preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getInt(TIMER_LENGTH_ID, 10)
        }

        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID = "com.anelemhlanga.timerapp.previous_timer_length"

        fun getPreviousTimerLengthSeconds(context: Context): Long{
            var preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, 0)

        }

        fun setPreviousTimerLengthSeconds(seconds:Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            editor.apply()
        }

        private const val TIMER_STATE_ID = "coma.anelemhlanga.timerapp.timer_state"

        fun getTimerState(context: Context): TimerActivity.TimerState{
            val prefences = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = prefences.getInt(TIMER_STATE_ID, 0)
            return TimerActivity.TimerState.values()[ordinal]
        }

        fun setTimerState(state: TimerActivity.TimerState, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID, ordinal)
            editor.apply()
        }

        private const val SECONDS_REMAINIG_ID = "com.anelemhlanga.timerapp.previous_timer_length"

        fun getSecondsRemaining(context: Context): Long{
            var preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SECONDS_REMAINIG_ID , 0)

        }

        fun setSecondsRemaining(seconds:Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(SECONDS_REMAINIG_ID, seconds)
            editor.apply()
        }

        private const val ALARM_SET_TIME_ID = "com.anelemhlanga.timer.background_timer"

        fun getAlarmSetTime(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(ALARM_SET_TIME_ID, 0)
        }

        fun setAlarmSetTime(time:Long, context: Context){
            val editor =  PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(ALARM_SET_TIME_ID,time)
            editor.apply()
        }



    }
}