
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
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigNoManipulationFactory

open public class TransformInfoHttpStoreNoManipulation : TransformInfoHttpStore {
        
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext)

        Updates for KMP build        
        {
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun setObjectConfigFile(value: Object)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.setObjectConfigFileName(value)
this.setObjectConfigInterface(TransformInfoObjectConfigNoManipulationFactory.getInstance()!!.getInstance(this, this.getObjectConfigFilePath()))
}


                @Throws(Exception::class)
            
open fun setObjectConfig(value: Object)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value



                            throw Exception("Should not set from actual config")
}


}
                
            

