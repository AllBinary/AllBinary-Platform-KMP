
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
        package org.allbinary.business.category




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.hierarchy.CategoryHierarchy
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.business.category.properties.root.RootCategoryPropertiesInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class Category
            : Object
        
                , CategoryInterface {
        

        companion object {
            
    private val NOT_ROOT: String = "This is not the root so it has no file path."

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var categoryHierarchyInterface: CategoryHierarchyInterface

    private var categoryPropertiesInterface: CategoryPropertiesInterface

    private val childCategoryVector: Vector = Vector()

    private val typeVector: Vector = Vector()

    private val PROPERTIES: Integer = Integer(1)

    private val CATEGORY: Integer = Integer(0)
public constructor        (categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface)
            : super()
        {

                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, "Category(CategoryPropertiesFactoryInterface)")

                                    }
                                
this.categoryPropertiesInterface= categoryPropertiesFactoryInterface!!.getInstance()
this.categoryHierarchyInterface= CategoryHierarchy(this, this) as CategoryHierarchyInterface
this.log()
}

public constructor        (categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface, level: Int)
            : super()
        {

                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface


                    var level = level
this.categoryPropertiesInterface= categoryPropertiesFactoryInterface!!.getInstance()
this.categoryHierarchyInterface= CategoryHierarchy(this, this, level) as CategoryHierarchyInterface
this.log()
}

public constructor        (rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface)
            : super()
        {

                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface
this.categoryPropertiesInterface= categoryPropertiesFactoryInterface!!.getInstance() as CategoryPropertiesInterface
this.categoryHierarchyInterface= CategoryHierarchy(rootCategoryInterface, parentCategoryInterface) as CategoryHierarchyInterface
this.log()
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPropertiesInterface!!.getKey()
}


                @Throws(Exception::class)
            
open fun getRootFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{
    var rootAbPath: AbPath = AbPath(NOT_ROOT)


    var categoryInterface: CategoryInterface = this.categoryHierarchyInterface!!.getRoot()!!
            


    
                        if(categoryInterface!!.getProperties()!!.isRoot())
                        
                                    {
                                    
    var rootCategoryPropertiesInterface: RootCategoryPropertiesInterface = categoryInterface!!.getProperties() as RootCategoryPropertiesInterface

rootAbPath= rootCategoryPropertiesInterface!!.getRootFilePath()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rootAbPath
}


                @Throws(Exception::class)
            
open fun getFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getRootFilePath()!!.toString() +this.getProperties()!!.getPath(this.getHierarchy())!!.toString(), this.getProperties()!!.getFileName())
}


                @Throws(Exception::class)
            
open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{
    var categoryInterface: CategoryInterface = this.categoryHierarchyInterface!!.getRoot()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryInterface!!.getProperties()!!.getWebAppPath()
}


                @Throws(Exception::class)
            
open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPropertiesInterface!!.getPath(this.categoryHierarchyInterface)
}


open fun addChildProperty(categoryPropertiesInterface: CategoryPropertiesInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var categoryPropertiesInterface = categoryPropertiesInterface
this.typeVector!!.add(this.PROPERTIES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.childCategoryVector!!.add(categoryPropertiesInterface)
}


open fun addChild(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var categoryInterface = categoryInterface
this.removeDuplicateChild(categoryInterface)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("adding", this, "addChild")

                                    }
                                

    var childCategoryHierarchyInterface: CategoryHierarchyInterface = categoryInterface!!.getHierarchy()!!
            

childCategoryHierarchyInterface!!.setParent(this)
childCategoryHierarchyInterface!!.setRoot(this.getHierarchy()!!.getRoot())
categoryInterface!!.setHierarchy(childCategoryHierarchyInterface)
this.typeVector!!.add(this.CATEGORY)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.childCategoryVector!!.add(categoryInterface)
}


open fun getChildNodes()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.childCategoryVector
}


open fun removeChild(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var categoryInterface = categoryInterface

    var removalVector: Vector = Vector()


    var bool_return: Boolean = false


    var size: Int = this.childCategoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    
                        if(this.CATEGORY == this.typeVector!!.get(index))
                        
                                    {
                                    
    var anyType: Any = this.childCategoryVector!!.get(index)!!
            


    var currentCategoryInterface: CategoryInterface = anyType as CategoryInterface


    
                        if(currentCategoryInterface!!.getProperties()!!.getValue()!!.compareTo(categoryInterface!!.getProperties()!!.getValue()) == 0)
                        
                                    {
                                    removalVector!!.add(currentCategoryInterface)
bool_return= true

                                    }
                                

                                    }
                                
}

this.removal(removalVector)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bool_return
}


open fun removal(removalVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var removalVector = removalVector

    var removalSize: Int = removalVector!!.size!!
            





                        for (index in 0 until removalSize)


        {
    var anyType: Any = removalVector!!.get(index)!!
            


    var objectIndex: Int = this.childCategoryVector!!.indexOf(anyType)!!
            

this.typeVector!!.remove(objectIndex)
this.childCategoryVector!!.remove(objectIndex)
}

}


open fun removeDuplicateChild(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var categoryInterface = categoryInterface

    var removalVector: Vector = Vector()


    var bool_return: Boolean = false


    var size: Int = this.childCategoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var anyType: Any = this.childCategoryVector!!.get(index)!!
            


    
                        if(this.PROPERTIES == this.typeVector!!.get(index))
                        
                                    {
                                    
    var categoryPropertiesInterface: CategoryPropertiesInterface = anyType as CategoryPropertiesInterface


    
                        if(categoryInterface!!.getProperties()!!.getValue()!!.compareTo(categoryPropertiesInterface!!.getValue()) == 0)
                        
                                    {
                                    removalVector!!.add(categoryPropertiesInterface)
bool_return= true
break;

                    

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.CATEGORY == this.typeVector!!.get(index))
                        
                                    {
                                    
    var existingCategoryInterface: CategoryInterface = anyType as CategoryInterface


    var categoryPropertiesInterface: CategoryPropertiesInterface = existingCategoryInterface!!.getProperties()!!
            


    
                        if(categoryInterface!!.getProperties()!!.getValue()!!.compareTo(categoryPropertiesInterface!!.getValue()) == 0)
                        
                                    {
                                    removalVector!!.add(existingCategoryInterface)
bool_return= true
break;

                    

                                    }
                                

                                    }
                                
}

this.removal(removalVector)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bool_return
}


                @Throws(Exception::class)
            
open fun isLeaf()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.childCategoryVector == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Category Error")

                                    }
                                

    
                        if(this.childCategoryVector!!.size == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getProperties()
        //nullable = true from not(false or (false and true)) = true
: CategoryPropertiesInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPropertiesInterface
}


open fun setProperties(categoryPropertiesInterface: CategoryPropertiesInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryPropertiesInterface = categoryPropertiesInterface
this.categoryPropertiesInterface= categoryPropertiesInterface
}


open fun getHierarchy()
        //nullable = true from not(false or (false and true)) = true
: CategoryHierarchyInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryHierarchyInterface
}


open fun setHierarchy(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryHierarchyInterface = categoryHierarchyInterface
this.categoryHierarchyInterface= categoryHierarchyInterface
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(!this.categoryPropertiesInterface!!.isValid()!!)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var size: Int = this.childCategoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var anyType: Any = this.childCategoryVector!!.get(index)!!
            


    
                        if(this.PROPERTIES == this.typeVector!!.get(index))
                        
                                    {
                                    
    var categoryPropertiesInterface: CategoryPropertiesInterface = anyType as CategoryPropertiesInterface


    
                        if(!categoryPropertiesInterface!!.isValid()!!)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.CATEGORY == this.typeVector!!.get(index))
                        
                                    {
                                    
    var categoryInterface: CategoryInterface = anyType as CategoryInterface


    
                        if(!categoryInterface!!.isValid()!!)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
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


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var categoryHashMap: HashMap<Any, Any> = this.categoryPropertiesInterface!!.toHashMap()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryHashMap
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var categoryVector: Vector = this.categoryPropertiesInterface!!.toVector()!!
            

categoryVector!!.add(this.childCategoryVector)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryVector
}


                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Category Name: ")
stringBuffer!!.append(this.categoryPropertiesInterface!!.getValue())
stringBuffer!!.append("\nPath = ")
stringBuffer!!.append(this.getPath()!!.toString())
stringBuffer!!.append("\nFile Path: ")
stringBuffer!!.append(this.getFilePath()!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "log()")

                                    }
                                
}


}
                
            

