
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
        package org.allbinary.logic.visual.transform.info.objectConfig




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document

interface TransformInfoObjectConfigAndManipulatorFactoryInterface {
        

                @Throws(Exception::class)
            
    open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, objectConfigFileAbPath: AbPath)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface

                @Throws(Exception::class)
            
    open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface

                @Throws(Exception::class)
            
    open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, document: Document)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface

}
                
            

