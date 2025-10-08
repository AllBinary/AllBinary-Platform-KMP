
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
        package org.allbinary.logic.communication.log.config.type




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList

open public class LogConfigType
            : Object
         {
        
companion object {
            
    var availableLogConfigTypes: BasicArrayList = BasicArrayList()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var name: String

    private var description: String
public constructor (name: String, description: String)
            : super()
        {
var name = name
var description = description
this.name= name
this.description= description
availableLogConfigTypes!!.add(this)
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.name= value
}


    open fun setDescription(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.description= value
}


}
                
            

