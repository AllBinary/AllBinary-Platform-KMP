
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class LOGGING
            : Object
         {
        

        companion object {


    private var logging: Vector = Vector()

open fun contains(logType: LOGGING)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var logType = logType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return logging!!.contains(logType!!.toString())
}


    val GRAPHICSPAINT: LOGGING = LOGGING(
                            "Graphics Paint")

    val GRAPHICSCREATION: LOGGING = LOGGING(
                            "Graphics Creation")

    val GRAPHICSDELETION: LOGGING = LOGGING(
                            "Graphics Deletion")

    val LOADINGERROR: LOGGING = LOGGING(
                            "Loading Error")

    val MENUEVENT: LOGGING = LOGGING(
                            "Menu Action Event")

    val MOUSEEVENT: LOGGING = LOGGING(
                            "Mouse Action Event")

    val KEYEVENT: LOGGING = LOGGING(
                            "Keyboard Action Event")

    val ACTIONEVENT: LOGGING = LOGGING(
                            "Action Event")

    val ADJUSTMENTEVENT: LOGGING = LOGGING(
                            "Adjustment Action Event")

    val COMPONENTEVENT: LOGGING = LOGGING(
                            "Component Action Event")

    val CONTAINEREVENT: LOGGING = LOGGING(
                            "Container Action Event")

    val FOCUSEVENT: LOGGING = LOGGING(
                            "Focus Action Event")

    val HIERARCHYEVENT: LOGGING = LOGGING(
                            "Hierarchy Action Event")

    val INPUTEVENT: LOGGING = LOGGING(
                            "Input Action Event")

    val INVOCATIONEVENT: LOGGING = LOGGING(
                            "Invocation Action Event")

    val ITEMEVENT: LOGGING = LOGGING(
                            "Item Action Event")

    val PAINTEVENT: LOGGING = LOGGING(
                            "Paint Action Event")

    val TEXTEVENT: LOGGING = LOGGING(
                            "Text Action Event")

    val WINDOWEVENT: LOGGING = LOGGING(
                            "Window Action Event")


        }
            
    private var name: String
private constructor        (value: String)
            : super()
        {

                    var value = value
this.name= value
logging!!.add(value)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

