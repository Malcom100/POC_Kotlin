package com.test.poc_kotlin.models

/**
 * Created by gtshilombowanticale on 16-01-17.
 */

class InfromationModel public constructor(ref : String){

    public var reference : String?
    public var name : String?
    public var firstName : String?
    public var address : String?

    init{
        reference = ref
        name = ""
        firstName = ""
        address = ""
    }

    constructor(referenceP : String, nameP : String, firstNameP : String, addressP : String) : this(referenceP) {
        name = nameP
        firstName = firstNameP
        address = addressP
    }
}