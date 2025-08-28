
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
        
import java.util.Vector
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
interface TransformInfoObjectConfigInterface : DomDocumentMappingInterface {
        

open fun containsView(transformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

                @Throws(Exception::class)
            
open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getTransformsGroup(group: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
open fun getTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
open fun getParentTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
open fun getGroupTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
open fun getOutputTypeName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setOutputTypeName(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getInputOutputTypeName()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getInputOutputTypeFile()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getImportUriPath()
        //nullable = true from not(false or (false and true)) = true
: String
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

}
                
            

