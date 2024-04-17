package com.example.androidprojecttwo.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.androidprojecttwo.models.User
import com.example.androidprojecttwo.navigation.ROUTE_HOME
import com.example.androidprojecttwo.navigation.ROUTE_LOGIN
import com.example.androidprojecttwo.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
//
//class AuthViewModel(var navController: NavController, var context: Context){
//    var mAuth:FirebaseAuth
//    val progress:ProgressDialog
//
//    init {
//        mAuth= FirebaseAuth.getInstance()
//        progress=ProgressDialog(context)
//        progress.setTitle("Loading")
//        progress.setMessage("PLease Wait.....")
//    }
//    fun signup(
//        firstName: String,
//        middleName: String,
//        lastName: String,
//        surname: String,
//        phoneNumber: String,
//        email: String,
//        password: String,
//        confirmpassword:String
//    ){
//        // progress.show()
//
//        if (firstName.isBlank() ||
//            lastName.isBlank() ||
//            phoneNumber.isBlank() ||
//            email.isBlank() ||
//            password.isBlank() ||
//            confirmpassword.isBlank()
//            ){
//
//            //progress.dismiss()
//            Toast.makeText(context,"Fields cannot be blank",
//                Toast.LENGTH_LONG).show()
//            return
//        }else if (password != confirmpassword){
//            Toast.makeText(context,"Password do not match",Toast.LENGTH_LONG).show()
//            return
//        }else{
//            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
//                if (it.isSuccessful){
//                    val userdata = User(
//                        firstName,
//                        middleName,
//                        lastName,
//                        surname,
//                        fullNameString = String(),
//                        phoneNumber,
//                        email,
//                        password,mAuth.currentUser!!.uid)
//                    val regRef= FirebaseDatabase.getInstance().getReference()
//                        .child("Users/"+mAuth.currentUser!!.uid)
//                    regRef.setValue(userdata).addOnCompleteListener {
//
//                        if (it.isSuccessful){
//                            Toast.makeText(context,
//                                "Registered Successfully",
//                                Toast.LENGTH_LONG).show()
//                            navController.navigate(ROUTE_HOME)
//
//                        }else{
//                            Toast.makeText(context,
//                                "${it.exception!!.message}",
//                                Toast.LENGTH_LONG).show()
//                            navController.navigate(ROUTE_LOGIN)
//                        }
//                    }
//                }else{
//                    navController.navigate(ROUTE_REGISTER)
//                }
//
//            } }
//    }
//    fun login(email: String,password: String){
//        progress.show()
//
//        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
//            progress.dismiss()
//            if (it.isSuccessful){
//                Toast.makeText(context,
//                    "Successfully Logged in",
//                    Toast.LENGTH_LONG).show()
//                navController.navigate(ROUTE_HOME)
////                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIFFERENT PAGE
//            }else{
//                Toast.makeText(context,"${it.exception!!.message}",
//                    Toast.LENGTH_LONG).show()
//                navController.navigate(ROUTE_LOGIN)
//            }
//        }
//
//    }
//    fun logout(){
//        mAuth.signOut()
//        navController.navigate(ROUTE_LOGIN)
//    }
//    fun isloggedin():Boolean{
//        return mAuth.currentUser !=null
//    }
//
//}



class AuthViewModel(var navController: NavController, var context: Context){

    var mAuth:FirebaseAuth
    val progress:ProgressDialog

    init {
        mAuth= FirebaseAuth.getInstance()
        progress=ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("PLease Wait.....")
    }
    fun signup(email:String,pass:String,confpass:String){
        // progress.show()

        if (email.isBlank() || pass.isBlank() ||confpass.isBlank()){
            //progress.dismiss()
            Toast.makeText(context,"Please email and password cannot be blank",Toast.LENGTH_LONG).show()
            return
        }else if (pass != confpass){
            Toast.makeText(context,"Password do not match",Toast.LENGTH_LONG).show()
            return
        }else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                if (it.isSuccessful){
                    val userdata=User(email,pass,mAuth.currentUser!!.uid)
                    val regRef=FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,
                                "Registered Successfully",
                                Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_HOME)

                        }else{
                            Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_REGISTER)
                }

            } }

    }
    fun login(email: String,pass: String){
        progress.show()

        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context,"Successfully Logged in",Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_HOME)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIFFERENT PAGE
            }else{
                Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }

    }
    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }
    fun isloggedin():Boolean{
        return mAuth.currentUser !=null
    }

}