
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.category.hierarchy.CategoryHierarchyInterface
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.io.path.AbPath
interface CategoryInterface : TableMappingInterface, ValidationInterface {
        

open fun getChildNodes()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        

open fun addChildProperty(categoryPropertiesInterface: CategoryPropertiesInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun addChild(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun removeChild(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun isLeaf()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getProperties()
        //nullable = true from not(false or (false and true)) = true
: CategoryPropertiesInterface

        Updates for KMP build        
        

open fun setProperties(categoryPropertiesInterface: CategoryPropertiesInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getHierarchy()
        //nullable = true from not(false or (false and true)) = true
: CategoryHierarchyInterface

        Updates for KMP build        
        

open fun setHierarchy(categoryHierarchyInterface: CategoryHierarchyInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getRootFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

}
                
            

