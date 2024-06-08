package jempasam.pokerbot.windows

import com.sun.jna.platform.win32.User32
import com.sun.jna.platform.win32.WinDef
import java.awt.image.BufferedImage

class Window(private val handle: WinDef.HWND) {

    val name: String
        get(){
            val charray=CharArray(100)
            val size=User32.INSTANCE.GetWindowText(handle,charray,100)
            return String(charray,0,size)
        }

    val rect: WinDef.RECT
        get(){
            val rect=WinDef.RECT()
            User32.INSTANCE.GetWindowRect(handle,rect)
            return rect
        }

    val parent: Window
        get() = Window(User32.INSTANCE.GetParent(handle))

    companion object{

        fun getForeground(): Window {
            val active=User32.INSTANCE.GetForegroundWindow()
            return Window(active)
        }

        fun getAll(): Iterable<Window> {
            val windows= mutableListOf<Window>()
            User32.INSTANCE.EnumWindows({handle, _ -> windows.add(Window(handle)); true}, null)
            return windows
        }

    }

}

