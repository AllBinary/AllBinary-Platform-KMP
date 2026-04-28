
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
        package org.allbinary.logic.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class Orientation
            : Object
         {
        
companion object {
            
    var NONE: Orientation = Orientation(0, 0, 0)

    private var SINGLETON: Orientation = Orientation(0, 0, 0)

    open fun getInstance(yaw: Int, pitch: Int, roll: Int)
        //nullable =  from not(true or (false and false)) = 
: Orientation{
var yaw = yaw
var pitch = pitch
var roll = roll
SINGLETON.yaw.setint(yaw)
SINGLETON.pitch.setint(pitch)
SINGLETON.roll.setint(roll)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    var yaw: BasicDecimal = BasicDecimal(0)

    var pitch: BasicDecimal = BasicDecimal(0)

    var roll: BasicDecimal = BasicDecimal(0)
private constructor (yaw: Int, pitch: Int, roll: Int)
            : super()
        {
var yaw = yaw
var pitch = pitch
var roll = roll
this.yaw.setint(yaw)
this.pitch.setint(pitch)
this.roll.setint(roll)
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Y: ")
stringBuffer!!.append(this.yaw.toString())
stringBuffer!!.append(" P: ")
stringBuffer!!.append(this.pitch.toString())
stringBuffer!!.append(" R: ")
stringBuffer!!.append(this.roll.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

