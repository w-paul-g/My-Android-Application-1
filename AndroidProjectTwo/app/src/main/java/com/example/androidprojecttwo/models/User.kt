package com.example.androidprojecttwo.models

import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.FullNameStyle

class User {
//    var firstName: String = ""
//    var middleName: String = ""
//    var lastName: String = ""
//    var surname: String = ""
//    var fullName: String = firstName + middleName + lastName + surname
//    var phoneNumber: String = ""
    var email: String = ""
    var password: String = ""
    var userid:String = ""
    constructor(
//        firstnameString: String,
//        middleNameString: String,
//        lastnameString: String,
//        surnameString: String,
//        fullNameString: String,
//        phoneNumber: String,
        email: String,
        password: String,
        userid: String
    ){
//        this.firstName = firstnameString
//        this.middleName = middleNameString
//        this.lastName = lastnameString
//        this.surname = surnameString
//        this.fullName = fullNameString
//        this.phoneNumber = phoneNumber
        this.email = email
        this.password = password
        this.userid = userid
    }
    constructor()
}