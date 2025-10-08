
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
        
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.info.CompositeTransformInfoInterface

interface TransformInterface : DomDocumentMappingInterface, CompositeTransformInfoInterface {
        

    open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun setTransformDocumentInterface(viewDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true


    open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface

                @Throws(Exception::class)
            
    open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

