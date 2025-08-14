
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
        package org.allbinary.business.installer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.system.security.licensing.LicensingException

open public class InitDb
            : Object
         {
        

    private var anyType: Any

    private val METHOD_CALL_GET_HOST_NAME: String = "getHostName"

    private val METHOD_CALL_ADD_USERS: String = "addUsers"

    private val METHOD_CALL_ADD_DATABASES: String = "addDatabases"

    private val METHOD_CALL_ADD_TABLES: String = "addTables"

    private val METHOD_CALL_TEMP_MAIN_PATH: String = "useTemporaryMainPath"

    private val METHOD_CALL_MAIN_PATH: String = "useNormalMainPath"
public constructor        ()
            : super()
        {}

public constructor        (dbConnectionInfo: DbConnectionInfo)
            : super()
        {

                    var dbConnectionInfo = dbConnectionInfo
}


open fun setHelper(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
this.anyType= anyType
}


open fun getHelper()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.anyType
}


open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_GET_HOST_NAME, 
                            null)!!
            


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun addUsers()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_ADD_USERS, 
                            null)!!
            


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun addDatabases()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_ADD_DATABASES, 
                            null)!!
            


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun addTables()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_ADD_TABLES, 
                            null)!!
            


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun useTemporaryMainPath()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_TEMP_MAIN_PATH, 
                            null)!!
            


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun useNormalMainPath()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var dynamicClass: KClass<*> = anyType!!::class!!
            


    var method: Method = dynamicClass!!.getMethod(METHOD_CALL_MAIN_PATH, 
                            null)!!
            


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

