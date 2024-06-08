package jempasam.pokerbot.range

enum Action{
    FOLD,
    CALL(val amount: Int),
    RAISE
}

interface Range{
    fun test(a: Int|Float){a
        
    }
}