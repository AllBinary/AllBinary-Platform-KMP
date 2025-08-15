
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
        package org.allbinary.business.context.modules.storefronts




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.init.InitSql
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogUtil

open public class BasicStoreFrontsEntity : InitSql {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val tableName: String = "storefronts"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTable(tableName)
}


                @Throws(Exception::class)
            
open fun getStoreFrontInterface(name: String)
        //nullable = true from not(false or (false and false)) = true
: BasicStoreFrontInterface{

                    var name = name

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, name)

    var storeHashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!
            


    
                        if(storeHashMap == 
                                    null
                                )
                        
                                    throw Exception("No Such Store: " +name)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put("StoreFront: " +storeHashMap!!.toString(), this, "getStore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicStoreFront(storeHashMap) as BasicStoreFrontInterface
}


}
                
            

