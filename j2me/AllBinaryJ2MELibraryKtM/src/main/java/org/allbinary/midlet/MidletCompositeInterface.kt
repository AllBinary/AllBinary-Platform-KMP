
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
        package org.allbinary.midlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import javax.microedition.midlet.MIDlet
interface MidletCompositeInterface {
        

open fun setMidlet(midlet: MIDlet)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getMidlet()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryMidlet

        Updates for KMP build        
        

open fun getDisplayable()
        //nullable = true from not(false or (false and true)) = true
: Displayable

        Updates for KMP build        
        

}
                
            

