
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
        package org.allbinary.logic.system.security.licensing



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.registration.RegistrationConfiguration
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class MobileClientInformation : AbeClientInformation {
        

        companion object {


    val DESC: String = "Mobile"

    val ANDROID_DESC: String = "Android" +DESC


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (name: String, version: String, specialName: String, shortName: String)                        

                            : super(name, version, StringMaker().
                            append(specialName)!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(PartnerIdentifierFileUtil.getInstance()!!.get())!!.toString(), shortName){

                    var name = name


                    var version = version


                    var specialName = specialName


                    var shortName = shortName


                            //For kotlin this is before the body of the constructor.
                    

    var number: String = this.getSpecialName()!!.substring(this.getSpecialName()!!.length() -1)!!
            


    
                        if(Integer.getInteger(number) == 
                                    null
                                )
                        
                                    {
                                    this.setHardSale(false)

                                    }
                                

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(this.isHardSale())
                        
                                    {
                                    logUtil!!.put(
                            "Use Hard Coded Selling", this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Don't Use Hard Coded Selling", this, commonStrings!!.CONSTRUCTOR)

                        }
                            
}


open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{
    var hashtable: Hashtable<Any, Any> = super.toHashtable()!!
            


    var registrationConfiguration: RegistrationConfiguration = RegistrationConfiguration.getInstance()!!
            

hashtable.put(registrationConfiguration!!.NAME, registrationConfiguration!!.getRegistrationCode())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

