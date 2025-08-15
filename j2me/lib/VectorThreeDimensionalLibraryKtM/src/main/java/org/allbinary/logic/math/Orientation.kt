
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
SINGLETON.yaw.set(yaw)
SINGLETON.pitch.set(pitch)
SINGLETON.roll.set(roll)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    var yaw: BasicDecimal = BasicDecimal()

    var pitch: BasicDecimal = BasicDecimal()

    var roll: BasicDecimal = BasicDecimal()
private constructor        (yaw: Int, pitch: Int, roll: Int)
            : super()
        {

                    var yaw = yaw


                    var pitch = pitch


                    var roll = roll
this.yaw.set(yaw)
this.pitch.set(pitch)
this.roll.set(roll)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Y: ")
stringBuffer!!.append(yaw.toString())
stringBuffer!!.append(" P: ")
stringBuffer!!.append(pitch.toString())
stringBuffer!!.append(" R: ")
stringBuffer!!.append(roll.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

