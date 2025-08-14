
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
        package org.allbinary.business.category.hierarchy




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryInterface
import org.allbinary.logic.string.StringUtil

open public class CategoryHierarchy
            : Object
        
                , CategoryHierarchyInterface {
        

    private var rootCategoryInterface: CategoryInterface

    private var parentCategoryInterface: CategoryInterface

    private var level: Int
public constructor        (rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface)
            : super()
        {

                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface
this.level= 0
this.setRoot(rootCategoryInterface)
this.setParent(parentCategoryInterface)
}

public constructor        (rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, level: Int)
            : super()
        {

                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var level = level
this.level= level
this.setRoot(rootCategoryInterface)
this.setParent(parentCategoryInterface)
}

public constructor        (rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesHashMap: HashMap<Any, Any>)
            : super()
        {

                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var categoryPropertiesHashMap = categoryPropertiesHashMap

    var levelString: String = StringUtil.getInstance()!!.getInstance(categoryPropertiesHashMap!!.get(CategoryData.getInstance()!!.LEVEL) as String)!!
            

this.level= Integer.valueOf(levelString)!!.toInt()
this.setRoot(rootCategoryInterface)
this.setParent(parentCategoryInterface)
}


open fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.level
}


open fun getLevelString()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level.toString()
}


open fun setLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var level = level
this.level= level
}


open fun setParent(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryInterface = categoryInterface
this.parentCategoryInterface= categoryInterface
}


open fun setRoot(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryInterface = categoryInterface
this.rootCategoryInterface= categoryInterface
}


open fun getRoot()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rootCategoryInterface
}


open fun getParent()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.parentCategoryInterface
}


}
                
            

