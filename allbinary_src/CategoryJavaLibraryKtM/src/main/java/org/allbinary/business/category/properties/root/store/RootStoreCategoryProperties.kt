
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
        package org.allbinary.business.category.properties.root.store




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryUtil
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.business.category.properties.root.RootCategoryPropertiesInterface
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.io.path.PathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class RootStoreCategoryProperties
            : Object
        
                , RootCategoryPropertiesInterface
                , CategoryPropertiesInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var fileAbPath: AbPath

    private var abPath: AbPath

    private var category: String

    private var isRealRoot: Boolean

    var webAppAbPath: AbPath

    var transformInfoInterface: TransformInfoInterface
public constructor        (transformInfoInterface: TransformInfoInterface)
            : super()
        

        Updates for KMP build        
        {
    //var transformInfoInterface = transformInfoInterface
this.transformInfoInterface= transformInfoInterface
this.abPath= AbPath()
this.category= CategoryData.getInstance()!!.ROOTCATEGORY
this.isRealRoot= true
this.initPath()
this.log()
}

public constructor        (transformInfoInterface: TransformInfoInterface, categoryAbPath: AbPath)
            : super()
        

        Updates for KMP build        
        {
    //var transformInfoInterface = transformInfoInterface
    //var categoryAbPath = categoryAbPath
this.transformInfoInterface= transformInfoInterface
this.abPath= categoryAbPath
this.category= PathUtil.getInstance()!!.getNameFromPath(categoryAbPath!!.toString())

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.category))
                        
                                    {
                                    this.isRealRoot= true
this.category= CategoryData.getInstance()!!.ROOTCATEGORY

                                    }
                                
this.initPath()
this.log()
}

public constructor        (transformInfoInterface: TransformInfoInterface, node: Node)
            : super()
        

        Updates for KMP build        
        {
    //var transformInfoInterface = transformInfoInterface
    //var node = node
this.transformInfoInterface= transformInfoInterface

    var categoryPath: String = CategoryUtil.getNameFromNode(node)!!

this.abPath= AbPath(categoryPath)
this.category= PathUtil.getInstance()!!.getNameFromPath(categoryPath)

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.category))
                        
                                    {
                                    this.isRealRoot= true
this.category= CategoryData.getInstance()!!.ROOTCATEGORY

                                    }
                                
this.initPath()
this.log()
}

public constructor        (transformInfoInterface: TransformInfoInterface, categoryPropertiesHashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
    //var transformInfoInterface = transformInfoInterface
    //var categoryPropertiesHashMap = categoryPropertiesHashMap
this.transformInfoInterface= transformInfoInterface

    var categoryPath: String = .toCharArray()

this.abPath= AbPath(categoryPath)
this.category= PathUtil.getInstance()!!.getNameFromPath(categoryPath)

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.category))
                        
                                    {
                                    this.isRealRoot= true
this.category= CategoryData.getInstance()!!.ROOTCATEGORY

                                    }
                                
this.initPath()
this.log()
}


                @Throws(Exception::class)
            
open fun initPath()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var transformInfoHttpStoreInterface: TransformInfoHttpInterface = this.transformInfoInterface as TransformInfoHttpInterface


    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(transformInfoHttpStoreInterface!!.getStoreName())!!


    var postPath: String = storeFrontInterface!!.getCurrentHostNamePath() +storeFrontInterface!!.getCategoryPath()


    var httpServletRequest: HttpServletRequest = transformInfoHttpStoreInterface!!.getPageContext()!!.getRequest() as HttpServletRequest

this.webAppAbPath= AbPath(httpServletRequest!!.getContextPath() +postPath)
this.setRootFilePath(AbPath(URLGLOBALS.getMainPath() +postPath))
}


open fun isRealRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRealRoot
}


open fun isRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getValue() as Object
}


open fun setPath(path: AbPath)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var path = path
this.abPath= path
}


open fun setRootFilePath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.fileAbPath= value
}


open fun getRootFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileAbPath
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
            
open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.webAppAbPath
}


open fun getPath(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
: AbPath

        Updates for KMP build        
        {
    //var categoryHierarchyInterface = categoryHierarchyInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.abPath
}


open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getValue() +AbPathData.getInstance()!!.EXTENSION_SEP +CategoryData.getInstance()!!.UNCRYPTED_EXTENSION
}


open fun setValue(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.category= value
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

categoryHashMap!!.put(CategoryData.getInstance()!!.NAME, this.getValue())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryHashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {

    var categoryVector: Vector = Vector()

categoryVector!!.add(this.getValue())



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


open fun log()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("filePath = ")!!.append(this.fileAbPath!!.toString())!!.append("\npath = ")!!.append(this.abPath!!.toString())!!.append("\ncategory = ")!!.append(this.category)!!.toString(), this, "log()")

                                    }
                                
}


}
                
            

