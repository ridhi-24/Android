package com.example.myapplicationss.model

import java.io.Serializable

data class Pojo(
    var e_name :String,
    var designation :String,
    var date_of_birth :String,
    var date_of_joining :String,
    var profile_img :String
): Serializable
