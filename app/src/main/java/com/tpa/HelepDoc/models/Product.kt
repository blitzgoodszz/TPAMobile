package com.tpa.HelepDoc.models

class Product(
    id: String?,
    name: String, indicator:String, attention: String, dosage:String, composition:String, price:Double, image:String){
    var name:String = name
    var indicator:String = indicator
    var attention:String = attention
    var dosage:String =dosage
    var composition:String = composition
    var price:Double= price
    var image:String = image

    // read data from firebase must be initialize the constructor
    constructor() : this("","","", "", "" ,"" ,0.0, "")

}
