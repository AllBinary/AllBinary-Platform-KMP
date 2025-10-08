
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Control
import org.allbinary.logic.string.StringUtil

open public class NoPlayer : BasicPlayer {
        
companion object {
            
    val NO_PLAYER: NoPlayer = NoPlayer()

        }
            public constructor (){
}


    override fun close()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.NULL_STRING
}


    override fun getControl(controlType: String)
        //nullable = true from not(false or (false and false)) = true
: Control{
var controlType = controlType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullControl()
}


    override fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}


}
                
            

