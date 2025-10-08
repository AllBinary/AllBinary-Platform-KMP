
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
        package org.allbinary.logic.communication.smtp.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class BasicEmailInfo
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var subject: String

    private var textBody: String

    var emailServerConfigurationInterface: EmailServerConfigurationInterface
public constructor (subject: String, textBody: String)
            : super()
        {
var subject = subject
var textBody = textBody

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.subject= subject
this.textBody= textBody
}


    open fun getSubject()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.subject
}


    open fun getTextBody()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.textBody
}


    open fun getEmailServerConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: EmailServerConfigurationInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emailServerConfigurationInterface
}


    open fun setEmailServerConfigurationInterface(emailServerConfigurationInterface: EmailServerConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{
var emailServerConfigurationInterface = emailServerConfigurationInterface
this.emailServerConfigurationInterface= emailServerConfigurationInterface
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getEmailServerConfigurationInterface()!!.toString())
stringBuffer!!.append("\n")
stringBuffer!!.append("Subject: \n")
stringBuffer!!.append(this.getSubject())
stringBuffer!!.append("\nText Body: \n")
stringBuffer!!.append(this.getTextBody())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


}
                
            

