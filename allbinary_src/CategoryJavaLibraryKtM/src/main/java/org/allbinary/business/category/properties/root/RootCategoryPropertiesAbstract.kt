
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
        package org.allbinary.business.category.properties.root




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class RootCategoryPropertiesAbstract
            : Object
        
                , RootCategoryPropertiesInterface {
        

    private val category: String = CategoryData.getInstance()!!.ROOTCATEGORY

    private val fileName: String = category +AbPathData.getInstance()!!.EXTENSION_SEP +CategoryData.getInstance()!!.UNCRYPTED_EXTENSION
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getValue() as Object
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.category
}


                @Throws(Exception::class)
            
open fun setValue(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value



                            throw Exception("No Value Allowed")
}


                @Throws(Exception::class)
            
open fun setRootFilePath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun setRootFilePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value



                            throw Exception("No Value Allowed")
}


                @Throws(Exception::class)
            
open fun getRootFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        {



                            throw Exception("No Value Allowed")
}


                @Throws(Exception::class)
            
open fun isRealRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw Exception("No A Real Root")
}


                @Throws(Exception::class)
            
open fun isRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw Exception("Root but not implemented")
}


                @Throws(Exception::class)
            
open fun getWebAppPath(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var categoryHierarchyInterface = categoryHierarchyInterface



                            throw Exception("Not Root")
}


open fun getPath(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
: AbPath

        Updates for KMP build        
        {
var categoryHierarchyInterface = categoryHierarchyInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath()
}


open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileName
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var categoryHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

categoryHashMap!!.put(CategoryData.getInstance()!!.NAME, this.category)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryHashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {

    var categoryVector: Vector = Vector()

categoryVector!!.add(category)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryVector
}


                @Throws(Exception::class)
            
open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

