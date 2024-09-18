package com.trac.serverappnew

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.RemoteException

class BackendService : Service() {
    private val binder = object : IBackendService.Stub() {
        @Throws(RemoteException::class)
        override fun getBackendUrl(): String {
            return "https://example.com/backend-url/walter-is-coding/now/with-fred"
        }
    }

    override fun onBind(intent: Intent?): IBinder {
        return binder
    }
}