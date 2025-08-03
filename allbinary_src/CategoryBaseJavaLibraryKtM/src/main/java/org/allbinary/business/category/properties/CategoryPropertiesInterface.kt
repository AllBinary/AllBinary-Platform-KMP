
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.io.path.AbPath
interface CategoryPropertiesInterface : TableMappingInterface, ValidationInterface {
        

open fun setValue(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

                @Throws(Exception::class)
            
open fun getPath(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true
: AbPath

                @Throws(Exception::class)
            
open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun isRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun isRealRoot()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

