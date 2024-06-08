package jempasam.pokerbot.card

enum class Color {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS,
}

enum class Value(val value: Int) {
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),

    JACK(10),
    QUEEN(11),
    KING(12),
    ACE(13),
}

data class Card(val value: Value, val color: Color)

infix fun Value.of(color:Color) = Card(this,color)