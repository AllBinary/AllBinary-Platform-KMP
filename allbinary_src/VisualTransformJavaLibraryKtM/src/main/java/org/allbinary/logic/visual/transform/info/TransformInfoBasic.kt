
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
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.AbContext
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.w3c.dom.Document

open public class TransformInfoBasic : AbContext
                , TransformInfoHttpInterface {
        

    private var storeFrontInterface: StoreFrontInterface
public constructor        (storeFrontInterface: StoreFrontInterface, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext){
var storeFrontInterface = storeFrontInterface
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.storeFrontInterface= storeFrontInterface
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFrontInterface!!.getName()
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.NOT_IMPLEMENTED
}


open fun override(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var hashMap = hashMap
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getObjectFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getObject()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getObjectConfigInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoObjectConfigInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setObjectConfigInterface(transformInfoObjectConfigInterface: Object)
        //nullable = true from not(false or (false and false)) = true
{
var transformInfoObjectConfigInterface = transformInfoObjectConfigInterface
}


open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getTemplateFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getTemplate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getDataFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getDataDocument()
        //nullable = true from not(false or (false and true)) = true
: Document{



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setObjectFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setObject(anyType: Object)
        //nullable = true from not(false or (false and false)) = true
{
var anyType = anyType
}


open fun setObjectConfigFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setTemplateFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setTemplate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setDataFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setData(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun setChild()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun isChild()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getImportUriPath()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setImportUriPath(importUriPath: String)
        //nullable = true from not(false or (false and false)) = true
{
var importUriPath = importUriPath
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

