
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
        
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document

open public class OverrideStoreTransformInfoObjectConfig : GenericStoreTransformInfoObjectConfig {
        
public constructor        (abeClientInformation: Object, transformInfoInterface: Object)                        

                            : super(abeClientInformation, transformInfoInterface)

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, document: Object)                        

                            : super(abeClientInformation, transformInfoInterface, document)

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var transformInfoInterface = transformInfoInterface
var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, name: Object, type: Object)                        

                            : super(abeClientInformation, transformInfoInterface, name, type)

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var transformInfoInterface = transformInfoInterface
var name = name
var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun generate(objectConfigDocument: Document)
        //nullable = true from not(false or (false and false)) = true
: Document

        Updates for KMP build        
        {
var objectConfigDocument = objectConfigDocument

    var newObjectConfigDocument: Document = super.generate(objectConfigDocument)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newObjectConfigDocument
}


}
                
            

