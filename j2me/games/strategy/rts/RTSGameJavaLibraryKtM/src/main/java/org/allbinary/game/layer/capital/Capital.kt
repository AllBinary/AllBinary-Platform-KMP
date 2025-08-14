
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.game.layer.capital




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Capital
            : Object
         {
        

    private var value: Int= 0
public constructor        ()
            : super()
        {}


open fun getTotalMoney()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


open fun removeMoney(points: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.value -= points
}


open fun addMoney(points: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.value += points
}


}
                
            

