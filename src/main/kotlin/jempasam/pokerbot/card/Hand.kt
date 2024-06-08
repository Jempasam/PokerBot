package jempasam.pokerbot.card

class Hand(low: Card, high: Card){

    val low: Card
    val high: Card

    init{
        if(low.value.value>high.value.value){
            this.low=high
            this.high=low
        }else{
            this.low=low
            this.high=high
        }
    }

    override fun toString(): String {
        return "${low.value}+${high.value}"
    }
}
