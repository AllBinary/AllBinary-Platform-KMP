
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document

open public class OverrideStoreTransformInfoObjectConfig : GenericStoreTransformInfoObjectConfig {
        
public constructor        (abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)                        

                            : super(abeClientInformation, transformInfoInterface){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, document: Document)                        

                            : super(abeClientInformation, transformInfoInterface, document){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, name: String, type: String)                        

                            : super(abeClientInformation, transformInfoInterface, name, type){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var name = name


                    var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun generate(objectConfigDocument: Document)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var objectConfigDocument = objectConfigDocument

    var newObjectConfigDocument: Document = super.generate(objectConfigDocument)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newObjectConfigDocument
}


}
                
            

