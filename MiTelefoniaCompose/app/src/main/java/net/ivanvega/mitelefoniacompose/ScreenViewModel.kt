package net.ivanvega.mitelefoniacompose

import android.content.Intent
import android.telephony.SmsManager
import androidx.lifecycle.ViewModel

class ScreenViewModel: ViewModel() {



    fun sendSMS(tel : String, mesg : String){
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(tel,
            null,
            mesg,
            null, null);

    }
}