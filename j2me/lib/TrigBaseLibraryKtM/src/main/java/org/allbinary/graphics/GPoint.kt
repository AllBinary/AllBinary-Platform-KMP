
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps

open public class GPoint
            : Object
         {
        

        companion object {


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
stringBuffer!!.append(x)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(y)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(z)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}



        }
            
    private val x: Int

    private val y: Int

    private val z: Int
public constructor        (point: GPoint)
            : super()
        {

                    var point = point
this.x= point!!.getX()
this.y= point!!.getY()
this.z= point!!.getZ()
}

public constructor        (x: Int, y: Int)
            : super()
        {

                    var x = x


                    var y = y
this.x= x
this.y= y
this.z= 3
}

public constructor        (x: Int, y: Int, z: Int)
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
                        return x
}


open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


open fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return z
}


open fun getRawX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


open fun getRawY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


open fun getRawZ()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return z
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return toStringStatic(this.getX(), this.getY(), this.getZ())
}


}
                
            

