
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
        package org.allbinary.business.user.modules.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.entry.EntryData
import org.allbinary.business.time.created.TimeCreated
import org.allbinary.business.time.modified.TimeLastModified
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfiguration
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationInterface

open public class UserConfiguration
            : Object
        
                , UserConfigurationInterface {
        

    private var userEmailConfigurationInterface: UserEmailConfigurationInterface

    private var timeCreated: TimeCreated

    private var timeLastModified: TimeLastModified
public constructor        ()
            : super()
        {this.userEmailConfigurationInterface= UserEmailConfiguration() as UserEmailConfigurationInterface
this.timeCreated= TimeCreated(0)
this.timeLastModified= TimeLastModified(0)
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.userEmailConfigurationInterface= UserEmailConfiguration(hashMap) as UserEmailConfigurationInterface
this.timeCreated= TimeCreated(hashMap!!.get(EntryData.getInstance()!!.TIMECREATED) as String)
this.timeLastModified= TimeLastModified(hashMap!!.get(EntryData.getInstance()!!.LASTMODIFIED) as String)
}


open fun getUserEmailConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userEmailConfigurationInterface
}


open fun setUserEmailConfigurationInterface(userEmailConfigurationInterface: UserEmailConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userEmailConfigurationInterface = userEmailConfigurationInterface
this.userEmailConfigurationInterface= userEmailConfigurationInterface
}


open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: TimeCreated{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeCreated
}


open fun getTimeLastModified()
        //nullable = true from not(false or (false and true)) = true
: TimeLastModified{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeLastModified
}


open fun setTimeCreated(timeCreated: TimeCreated)
        //nullable = true from not(false or (false and false)) = true
{

                    var timeCreated = timeCreated
this.timeCreated= timeCreated
}


open fun setTimeLastModified(timeLastModified: TimeLastModified)
        //nullable = true from not(false or (false and false)) = true
{

                    var timeLastModified = timeLastModified
this.timeLastModified= timeLastModified
}


}
                
            

