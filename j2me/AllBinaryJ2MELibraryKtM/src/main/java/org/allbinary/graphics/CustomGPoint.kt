
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
        

open public class CustomGPoint : GPoint {
        

        companion object {
            
    val NULL_CUSTOM_POINT: CustomGPoint = CustomGPoint(0, 0, 0)

        }
            
    private var x: Int= 0

    private var y: Int= 0

    private var z: Int= 0
private constructor        (point: GPoint)                        

                            : super(point)

        Updates for KMP build        
        {
var point = point


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (x: Int, y: Int)                        

                            : super(x, y)

        Updates for KMP build        
        {
var x = x
var y = y


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (x: Int, y: Int, z: Int)                        

                            : super(x, y, z)

        Updates for KMP build        
        {
var x = x
var y = y
var z = z


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setX(x: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
this.x= x
}

override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


open fun setY(y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var y = y
this.y= y
}

override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


open fun setZ(z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var z = z
this.z= z
}

override fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return z
}


}
                
            

