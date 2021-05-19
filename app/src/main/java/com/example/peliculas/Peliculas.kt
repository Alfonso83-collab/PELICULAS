package com.example.peliculas

class Peliculas {

    var Title: String? = null
    var Actors: ArrayList<String>? = null
    var Year: String? = null
    var Genre: ArrayList<String>? = null
    var Director: String? = null
    var Writer: ArrayList<String>? = null
    var Ratings: ArrayList<ObjRating>? = null
    var Languages: ArrayList<String>? = null
    var Poster: ObjPoster? = null
    var Plot : String? = null

    init {
        var Title: String? = Title
        var Actors: ArrayList<String>? = Actors
        var Year: String? = Year
        var Genre: ArrayList<String>? = Genre
        var Director: String? = Director
        var Writer: ArrayList<String>? = Writer
        var Ratings: ArrayList<ObjRating>? = Ratings
        var Languages: ArrayList<String>? = Languages
        var Poster: ObjPoster? = Poster
        var Plot : String? = Plot
    }
    class ObjRating(Source:String, Value:String){
        var Source:String = Source
        var Value:String = Value
    }
    class ObjPoster(Uri:String, Extension:String){
        var Uri:String = Uri
        var Extension:String = Extension
    }
}