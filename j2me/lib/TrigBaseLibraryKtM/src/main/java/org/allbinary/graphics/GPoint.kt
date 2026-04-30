
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps

open public class GPoint
            : Object
         {
        
companion object {
            
    open fun getInstance(point: GPoint)
        //nullable =  from not(true or (false and false)) = 
: GPoint{
    //var point = point



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GPoint(point.getX(), point.getY(), point.getZ())
}


    private val POINT_LABEL: String = "Point: "

    open fun toStringStatic(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var x = x
var y = y
var z = z

    var stringBuffer: StringMaker = StringMaker()


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!

stringBuffer!!.append(POINT_LABEL)
stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.appendint(x)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.appendint(y)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.appendint(z)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
    private val x: Int

    private val y: Int

    private val z: Int
public constructor (x: Int, y: Int, z: Int)
            : super()
        {
var x = x
var y = y
var z = z
this.x= x
this.y= y
this.z= z
}


    open fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x
}


    open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y
}


    open fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.z
}


    open fun getRawX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x
}


    open fun getRawY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y
}


    open fun getRawZ()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.z
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GPoint.toStringStatic(this.getX(), this.getY(), this.getZ())
}


}
                
            

