
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.user.modules.admin.configuration.AdminConfiguration
import org.allbinary.business.user.modules.admin.configuration.AdminConfigurationInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes

open public class AdminConfigurationRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var request: HttpServletRequest
public constructor (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.request= pageContext!!.getRequest() as HttpServletRequest
}


    open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, "insert()")

                                    }
                                

    var success: String = "Successfully inserted AdminConfiguration"


    var adminConfigurationInterface: AdminConfigurationInterface = AdminConfiguration(this.request) as AdminConfigurationInterface

adminConfigurationInterface!!.write()

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    this.logUtil!!.putF(success, this, "insert()")

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to created AdminConfiguration"


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "insert()", e)

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


    open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Successfully deleted AdminConfiguration"


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    this.logUtil!!.putF(success, this, "delete()")

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to delete"


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "delete()", e)

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Updated AdminConfiguration Successful"


    var adminConfigurationInterface: AdminConfigurationInterface = AdminConfiguration(this.request) as AdminConfigurationInterface


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    this.logUtil!!.putF(success, this, "update()")

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to update"


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

