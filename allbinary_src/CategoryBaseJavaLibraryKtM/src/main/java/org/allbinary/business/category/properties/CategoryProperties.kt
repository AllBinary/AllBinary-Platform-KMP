
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
        package org.allbinary.business.category.properties




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.CategoryUtil
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlData
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CategoryProperties
            : Object
        
                , CategoryPropertiesInterface {
        

        companion object {
            
    private val MAXDEPTH: Int = 100

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var category: String
public constructor        (name: String)
            : super()
        {

                    var name = name
this.category= name
}

public constructor        (node: Node)
            : super()
        {

                    var node = node
this.category= CategoryUtil.getNameFromNode(node)
}

public constructor        (categoryPropertiesHashMap: HashMap<Any, Any>)
            : super()
        {

                    var categoryPropertiesHashMap = categoryPropertiesHashMap
this.category= .toCharArray()
}


open fun isRealRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getValue() as Object
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.category
}


                @Throws(Exception::class)
            
open fun getPath(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
: AbPath{

                    var categoryHierarchyInterface = categoryHierarchyInterface

    var abPathData: AbPathData = AbPathData.getInstance()!!


    var pathStringBuffer: StringMaker = StringMaker()


    var list: BasicArrayList = BasicArrayList()


    var nextParentCategoryInterface: CategoryInterface = categoryHierarchyInterface!!.getParent()!!


    
                        if(this != nextParentCategoryInterface!!.getProperties())
                        
                                    {
                                    
    var depthIndex: Int = 0


        while(nextParentCategoryInterface != 
                                    null
                                )
        {
    
                        if(nextParentCategoryInterface!!.getProperties()!!.isRealRoot())
                        
                                    {
                                    break;

                    

                                    }
                                

    
                        if(nextParentCategoryInterface!!.getProperties()!!.isRoot())
                        
                                    {
                                    list.add(0, nextParentCategoryInterface!!.getPath()!!.toString())

                                    }
                                
                        else {
                            pathStringBuffer!!.delete(0, pathStringBuffer!!.length())
list.add(0, pathStringBuffer!!.append(abPathData!!.SEPARATOR)!!.append(nextParentCategoryInterface!!.getProperties()!!.getValue())!!.toString())

                        }
                            

    
                        if(nextParentCategoryInterface == nextParentCategoryInterface!!.getHierarchy()!!.getParent())
                        
                                    {
                                    break;

                    

                                    }
                                
nextParentCategoryInterface= nextParentCategoryInterface!!.getHierarchy()!!.getParent()
depthIndex++

    
                        if(depthIndex > MAXDEPTH)
                        
                                    {
                                    


                            throw Exception("Probably Major Error")

                                    }
                                
}


                                    }
                                
pathStringBuffer!!.delete(0, pathStringBuffer!!.length())
pathStringBuffer!!.append(abPathData!!.SEPARATOR)!!.append(this.getValue())

    var size: Int = list.size()!!





                        for (index in 0 until size)

        {pathStringBuffer!!.append(list.get(index) as String)
}

pathStringBuffer!!.append(abPathData!!.SEPARATOR)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("path = " +pathStringBuffer!!.toString(), this, "getPath")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(pathStringBuffer!!.toString())
}


open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getValue() +AbPathData.getInstance()!!.EXTENSION_SEP +CategoryData.getInstance()!!.UNCRYPTED_EXTENSION
}


                @Throws(Exception::class)
            
open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                            throw Exception("Not Root")
}


open fun setValue(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.category= value
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var returnBoolean: Boolean = Boolean.FALSE


    
                        if(StringValidationUtil.getInstance()!!.isValidRequired(this.category, 1, AbSqlData.MAXSTRING))
                        
                                    {
                                    returnBoolean= Boolean.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnBoolean
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var categoryHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

categoryHashMap!!.put(CategoryData.getInstance()!!.NAME, this.category)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryHashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var categoryVector: Vector = Vector()

categoryVector!!.add(category)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryVector
}


                @Throws(Exception::class)
            
open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

