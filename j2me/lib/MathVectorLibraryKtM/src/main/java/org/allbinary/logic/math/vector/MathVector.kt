
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
        package org.allbinary.logic.math.vector



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.BasicDecimal

open public class MathVector
            : Object
        
                , MathVectorInterface {
        

    private var magnitudeBasicDecimal: BasicDecimal

    private var direction: Int

    var resultBasicDecimal: BasicDecimal
public constructor        (magnitudeBasicDecimal: BasicDecimal, direction: Int)
            : super()
        {

                    var magnitudeBasicDecimal = magnitudeBasicDecimal


                    var direction = direction
this.magnitudeBasicDecimal= magnitudeBasicDecimal
this.direction= direction
}


open fun getMagnitude()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.magnitudeBasicDecimal
}


open fun getDirection()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.direction
}


open fun getResult()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBasicDecimal
}


}
                
            

