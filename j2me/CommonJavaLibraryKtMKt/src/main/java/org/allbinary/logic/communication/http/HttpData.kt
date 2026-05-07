
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
        package org.allbinary.logic.communication.http




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonSeps

open public class HttpData
            : Object
         {
        
companion object {
            
    private val instance: HttpData = HttpData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HttpData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HttpData.instance
}


        }
            
    val EQUALS: String

    val PARAM_SEP: String

    val URL_PARAM_SEP: String

    val URL_LABEL: String = "Url: "
private constructor ()
            : super()
        {

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

this.EQUALS= commonSeps!!.EQUALS
this.PARAM_SEP= commonSeps!!.AMPERSAND
this.URL_PARAM_SEP= commonSeps!!.QUESTION
}


}
                
            

