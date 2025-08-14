
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document

open public class TransformInfoObjectConfigAndManipulatorFactoryBase
            : Object
        
                , TransformInfoObjectConfigAndManipulatorFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, objectConfigFileAbPath: AbPath)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var objectConfigFileAbPath = objectConfigFileAbPath



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, document: Document)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var document = document



                            throw RuntimeException()
}


}
                
            

