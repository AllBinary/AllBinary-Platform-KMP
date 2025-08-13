
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
        package org.allbinary.business.user.commerce.inventory.item



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.communication.http.request.RequestParams

open public class ItemFactoryUnused
            : Object
         {
        

        companion object {
            
                @Throws(MoneyException::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: TableMappingInterface{

                    var hashMap = hashMap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Item(hashMap) as TableMappingInterface
}


                @Throws(Exception::class, MoneyException::class)
            
open fun getInstance(request: HttpServletRequest)
        //nullable =  from not(true or (false and false)) = 
: TableMappingInterface{

                    var request = request



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Item(RequestParams(request).
                            toHashMap()) as TableMappingInterface
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

