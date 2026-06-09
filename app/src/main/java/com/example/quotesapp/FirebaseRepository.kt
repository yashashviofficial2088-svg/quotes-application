package com.example.quotesapp

import com.google.firebase.database.FirebaseDatabase

object FirebaseRepository{
    //this is initialized reference for our database
private val db= FirebaseDatabase.getInstance().getReference("quotes")
    //function for adding data to database
    fun addQuote(quote:Quote){
        //generate unique key to push
        val id=db.push().key!!
        //storing quote data at that specific id location

        db.child(id).setValue(quote.copy(id=id))
    }


}