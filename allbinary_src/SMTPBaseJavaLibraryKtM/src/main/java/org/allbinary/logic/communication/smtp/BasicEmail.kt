
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
        package org.allbinary.logic.communication.smtp




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.mail.internet.MimeMessage
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicEmail
            : Object
        
                , EmailInterface {
        

    private var email: AbEmail
public constructor        (emailInfo: EmailInfo, to: String)
            : super()
        {
var emailInfo = emailInfo
var to = to

    var basicEmailInfo: BasicEmailInfo = emailInfo!!.getBasicEmailInfo()!!

this.email= AbEmail(basicEmailInfo!!.getEmailServerConfigurationInterface()!!.getSmtpServer(), basicEmailInfo!!.getEmailServerConfigurationInterface()!!.getAccountName(), to, basicEmailInfo!!.getSubject(), basicEmailInfo!!.getTextBody(), emailInfo!!.getHtmlAttachment(), emailInfo!!.getContentBase())
}


open fun getEmail()
        //nullable = true from not(false or (false and true)) = true
: Email{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.getEmail() as Email
}


open fun getMimeMessage()
        //nullable = true from not(false or (false and true)) = true
: MimeMessage{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.getMimeMessage()
}


open fun getDebugInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.getDebugInfo()
}


                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.log()
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.toHashMap()
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.toXmlNode(document)
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.toXmlDoc()
}


}
                
            

