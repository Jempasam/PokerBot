package jempasam.pokerbot

import jempasam.pokerbot.card.*
import jempasam.pokerbot.card.Color.*
import jempasam.pokerbot.card.Value.*
import jempasam.pokerbot.windows.Window
import java.awt.image.BufferedImage
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel


fun main() {
    val window=Window.getForeground()
    println("Hello, PokerBot! nom de la fenêtre : "+window.name+"]")


    for(w in Window.getAll()){
        println(w.name)
    }




    val image= BufferedImage(100,100, BufferedImage.TYPE_INT_RGB)
    image.setRGB(50,50,0xFF0000)
    val fenetre=JFrame(window.name)
    fenetre.setSize(200,200)
    val icon=JLabel(ImageIcon(image))
    fenetre.add(icon)
    fenetre.add(icon)
    fenetre.isVisible=true

    val AhKh=Hand(ACE of HEARTS, KING of HEARTS)


}