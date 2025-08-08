
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.mail.internet.MimeMessage
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class AbEmail
            : Object
        
                , EmailInterface {
        

    private var email: Email
public constructor        (server: String, from: String, to: String, subject: String, textBody: String, htmlAttachment: String, contentBase: String)
            : super()
        {

                    var server = server


                    var from = from


                    var to = to


                    var subject = subject


                    var textBody = textBody


                    var htmlAttachment = htmlAttachment


                    var contentBase = contentBase

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    this.email= Email(from, to, subject, server, textBody, htmlAttachment, contentBase, true)

                                    }
                                
                        else {
                            this.email= Email(from, to, subject, server, textBody, htmlAttachment, contentBase)

                        }
                            
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


open fun getEmail()
        //nullable = true from not(false or (false and true)) = true
: Email{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email as Email
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.email.toXmlDoc()
}


}
                
            

