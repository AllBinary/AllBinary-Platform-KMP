
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        

open public class J2SEMath
            : Object
         {
        
companion object {
            
    private val instance: J2SEMath = J2SEMath()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: J2SEMath{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun round(value: Float)
        //nullable = true from not(false or (false and false)) = true
: Int{
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value.toInt()
}


    open fun abs(value: Float)
        //nullable = true from not(false or (false and false)) = true
: Float{
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value < 0)) {
                            
                             -value
                        
                            } else {
                            value
                            }
    
}


}
                
            

