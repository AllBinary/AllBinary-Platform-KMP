
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
        package org.allbinary.logic.communication.smtp.configuration.user.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil

open public class UserEmailEventConfiguration
            : Object
        
                , UserEmailEventConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var name: String

    private var eventListenerClassPath: String
public constructor        ()
            : super()
        {this.setName(StringUtil.getInstance()!!.EMPTY_STRING)
this.setEventListenerClassPath(StringUtil.getInstance()!!.EMPTY_STRING)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "New", this, 
                            " Constructor")

                                    }
                                
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.setName(hashMap!!.get(UserEmailEventConfigurationData.NAME) as String)
this.setEventListenerClassPath(hashMap!!.get(UserEmailEventConfigurationData.LISTENER_CLASSPATH) as String)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Log: " +this.log(), this, 
                            " Constructor")

                                    }
                                
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun getEventListenerClassPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventListenerClassPath
}


open fun setEventListenerClassPath(eventListenerClassPath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerClassPath = eventListenerClassPath
this.eventListenerClassPath= eventListenerClassPath
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "\nUser Email Event Log Info:" +"\nName: " +this.getName() +"\nEventListenerClassPath: " +this.getEventListenerClassPath()
}


}
                
            

