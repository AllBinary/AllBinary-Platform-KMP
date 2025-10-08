
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
        package org.allbinary.data.tables.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.data.tables.BasicDataTableInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

interface TransformInfoEntityInterface : BasicDataTableInterface {
        

                @Throws(Exception::class)
            
    open fun get(name: String, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable = true from not(false or (false and false)) = true
: TransformInfoInterface

                @Throws(Exception::class)
            
    open fun getObjectConfigs(storeName: Object)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
    open fun getNames(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

    open fun delete(name: String)
        //nullable = true from not(false or (false and false)) = true


    open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


    open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


}
                
            

