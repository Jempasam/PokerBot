package jempasam.pokerbot

import com.sun.jna.platform.win32.User32
import com.sun.jna.platform.win32.WinUser


fun main() {
    val active=User32.INSTANCE.GetForegroundWindow()
    val charray=CharArray(1024)
    Thread.sleep(1000)
    val name=User32.INSTANCE.GetWindowText(active,charray,1024)
    println("Hello, PokerBot!"+String(charray))
}