package com.zires.serverhealthchecker.server.all

import com.zires.serverhealthchecker.notification.Notification
import com.zires.serverhealthchecker.notification.SmsNotification
import com.zires.serverhealthchecker.server.ServerHealth

/**
 * Created by ClassicZires on 11/13/2019.
 **/

class DatabaseServerHealth : ServerHealth() {
    override fun check(): ArrayList<Notification> {
        val notifications: ArrayList<Notification> = ArrayList()
        notifications?.add(SmsNotification())
        return notifications!!
    }
}