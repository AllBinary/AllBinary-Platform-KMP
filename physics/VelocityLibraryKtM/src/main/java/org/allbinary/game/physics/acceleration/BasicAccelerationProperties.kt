
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
        package org.allbinary.game.physics.acceleration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicAccelerationProperties
            : Object
         {
        

    private var forward: Int= 0

    private var reverse: Int= 0
public constructor        (forward: Int, reverse: Int)
            : super()
        

        Updates for KMP build        
        {
var forward = forward
var reverse = reverse
this.setForward(forward)
this.setReverse(reverse)
}


open fun setReverse(reverse: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var reverse = reverse
this.reverse= reverse
}


open fun getReverse()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reverse
}


open fun setForward(forward: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var forward = forward
this.forward= forward
}


open fun getForward()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return forward
}


}
                
            

