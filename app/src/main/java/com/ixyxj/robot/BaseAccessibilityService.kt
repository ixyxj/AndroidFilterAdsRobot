package com.ixyxj.robot

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.util.Log
import android.view.accessibility.AccessibilityEvent

/**
 * created by ixyxj on 2019/6/21 10:17
 */
class BaseAccessibilityService: AccessibilityService() {

    override fun onServiceConnected() {
        serviceInfo = AccessibilityServiceInfo().apply {
            eventTypes = AccessibilityEvent.TYPES_ALL_MASK
            feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC
            packageNames = PackageEnum.values().map { it.packageName }.toTypedArray()
            notificationTimeout = 100
        }
        Log.d("==>", "==>onServiceConnected")
    }

    override fun onInterrupt() {

    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        handleAccessibility(event)
    }

    fun handleAccessibility(event: AccessibilityEvent) {
        val eventType = event.eventType
        val className = event.className
        Log.d("==>", className.toString())
        when (eventType) {
            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED -> {

            }
        }
    }

}