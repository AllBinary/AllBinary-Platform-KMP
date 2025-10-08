
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
        package org.allbinary.logic.communication.smtp.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.EventObject
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.string.StringMaker

open public class EmailEvent : EventObject {
        

    private var emailInfo: EmailInfo

    private var userEmailEventNameData: UserEmailEventNameData

    private var attempts: Int= 0
public constructor (emailEventHandler: Any, userEmailEventNameData: UserEmailEventNameData, emailInfo: EmailInfo, attempts: Int)                        

                            : super(emailEventHandler){
var emailEventHandler = emailEventHandler
var userEmailEventNameData = userEmailEventNameData
var emailInfo = emailInfo
var attempts = attempts


                            //For kotlin this is before the body of the constructor.
                    
this.userEmailEventNameData= userEmailEventNameData
this.emailInfo= emailInfo
}


    open fun getEmailInfo()
        //nullable = true from not(false or (false and true)) = true
: EmailInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.emailInfo
}


    open fun getAttempts()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return attempts
}


    open fun setAttempts(attempts: Int)
        //nullable = true from not(false or (false and false)) = true
{
var attempts = attempts
this.attempts= attempts
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("EmailEvent Log: \n")
stringBuffer!!.append("Event Name: ")
stringBuffer!!.append(this.userEmailEventNameData!!.toString())
stringBuffer!!.append(this.getEmailInfo()!!.toString())
stringBuffer!!.append("\nNumber of Attempts: ")
stringBuffer!!.append(this.getAttempts())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

