
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext

open public class TransformInfoHttpStoreFactory
            : Object
        
                , TransformInfoFactoryInterface {
        

        companion object {
            
    private val instance: TransformInfoHttpStoreFactory = TransformInfoHttpStoreFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoHttpStoreFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun getInstance(databaseHashMap: HashMap<Any, Any>, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoInterface{
var databaseHashMap = databaseHashMap
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoHttpStore(databaseHashMap, propertiesHashMap, pageContext)
}


}
                
            

