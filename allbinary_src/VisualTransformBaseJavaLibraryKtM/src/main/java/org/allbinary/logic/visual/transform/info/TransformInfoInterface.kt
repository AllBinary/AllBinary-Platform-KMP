
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
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.w3c.dom.Document
interface TransformInfoInterface : TableMappingInterface {
        

open fun log()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun override(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getObjectFile()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getObject()
        //nullable = true from not(false or (false and true)) = true
: Any

                @Throws(Exception::class)
            
open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

open fun getTemplateFile()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTemplate()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

open fun getDataFile()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getDataDocument()
        //nullable = true from not(false or (false and true)) = true
: Document

open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setObjectFile(value: Object)
        //nullable = true from not(false or (false and false)) = true


open fun setObject(anyType: Object)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun setObjectConfigInterface(transformInfoObjectConfigInterface: Object)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getObjectConfigInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoObjectConfigInterface

open fun setTemplateFile(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTemplate(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setDataFile(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setData(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setChild()
        //nullable = true from not(false or (false and true)) = true


open fun isChild()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

