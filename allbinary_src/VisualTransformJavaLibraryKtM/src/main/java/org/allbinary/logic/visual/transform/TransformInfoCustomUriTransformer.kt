
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
        package org.allbinary.logic.visual.transform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.xml.transform.URIResolver
import org.allbinary.data.tree.dom.BasicUriResolver
import org.allbinary.data.tree.dom.CustomUriResolver
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigAndManipulatorFactory
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface

open public class TransformInfoCustomUriTransformer : BasicTransformer {
        
public constructor (abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)                        

                            : super(abeClientInformation, transformInfoInterface){
    //var abeClientInformation = abeClientInformation
    //var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = TransformInfoObjectConfigAndManipulatorFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface) as TransformInfoObjectConfigInterface

this.setURIResolver(CustomUriResolver(transformInfoObjectConfigInterface!!.getImportUriPath(), this.getURIResolver() as BasicUriResolver) as URIResolver)
}


}
                
            

