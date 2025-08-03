
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
        package org.allbinary.logic.visual.transform.info



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
interface TransformInfoHttpInterface : TransformInfoInterface {
        

open fun getWeblisketSession()
        //nullable = true from not(false or (false and true)) = true
: WeblisketSessionInterface

open fun getPageContext()
        //nullable = true from not(false or (false and true)) = true
: PageContext

open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

}
                
            

