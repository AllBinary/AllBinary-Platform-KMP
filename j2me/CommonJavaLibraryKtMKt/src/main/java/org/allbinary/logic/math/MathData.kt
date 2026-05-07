
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
        
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class MathData
            : Object
         {
        
companion object {
            
    private val instance: MathData = MathData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MathData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MathData.instance
}


        }
            
    val EQUALS: String

    val PLUS: String = "+"

    val GREATER_THAN: String = ">"

    val MINUS: String

    val DIVIDE: String

    val MULTIPLY: String
private constructor ()
            : super()
        {

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

this.EQUALS= commonSeps!!.EQUALS
this.MINUS= commonSeps!!.DASH
this.DIVIDE= commonSeps!!.FORWARD_SLASH
this.MULTIPLY= CommonPhoneStrings.getInstance()!!.STAR
}


}
                
            

