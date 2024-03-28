package com.example.worldcupapp
//template
class CountryModel {
    var name:String=""
    var cupWins:String=""
    var flag_image:Int=0

    constructor(name: String, cupWins: String, flag_image: Int) {
        this.name = name
        this.cupWins = cupWins
        this.flag_image = flag_image
    }
}