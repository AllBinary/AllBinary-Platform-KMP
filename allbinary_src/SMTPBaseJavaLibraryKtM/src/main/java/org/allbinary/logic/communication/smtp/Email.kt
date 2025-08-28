
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
        
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.HashMap
import java.util.Properties
import javax.mail.Address
import javax.mail.Authenticator
import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.Session
import javax.mail.internet.InternetAddress
import javax.mail.internet.InternetHeaders
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeMultipart
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class Email
            : Object
        
                , EmailInterface {
        

        companion object {
            
    private val DEBUG: String = "mail.debug"

    private val SMTP_HOST: String = "mail.smtp.host"

    private val SMTP_PORT: String = "mail.smtp.port"

    private val SMTP_USER: String = "mail.smtp.user"

    private val SMTP_RETURN_ADDRESS: String = "mail.from"

    private val SMTP_LOCAL_HOST: String = "mail.smtp.localhost"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var msg: MimeMessage

    private var properties: Properties

    private var bs: ByteArrayOutputStream

    private var isDebug: Boolean
public constructor        (from: String, to: String, subject: String, server: String, textBody: String, htmlAttachment: String, contentBase: String)
            : super()
        {
var from = from
var to = to
var subject = subject
var server = server
var textBody = textBody
var htmlAttachment = htmlAttachment
var contentBase = contentBase
this.isDebug= false
init(from, to, subject, server, textBody, htmlAttachment, contentBase)
}

public constructor        (from: String, to: String, subject: String, server: String, textBody: String, htmlAttachment: String, contentBase: String, isDebug: Boolean)
            : super()
        {
var from = from
var to = to
var subject = subject
var server = server
var textBody = textBody
var htmlAttachment = htmlAttachment
var contentBase = contentBase
var isDebug = isDebug
this.isDebug= isDebug
init(from, to, subject, server, textBody, htmlAttachment, contentBase)
}


                @Throws(Exception::class)
            
open fun init(from: String, to: String, subject: String, server: String, textBody: String, htmlAttachment: String, contentBase: String)
        //nullable = true from not(false or (false and false)) = true
{
var from = from
var to = to
var subject = subject
var server = server
var textBody = textBody
var htmlAttachment = htmlAttachment
var contentBase = contentBase

        try {
            
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    var mimeBodyParts: Array<MimeBodyPart?> = arrayOfNulls(
                            //Otherwise - levels - level - dimension - ConditionalExpr
)

mimeBodyParts[0]= MimeBodyPart()
mimeBodyParts[0]!!.setText(textBody)

    
                        if(!stringValidationUtil!!.isEmpty(htmlAttachment))
                        
                                    {
                                    
    var internetHeaders: InternetHeaders = InternetHeaders()

internetHeaders!!.addHeader("Content-Type", "text/html")

    
                        if(!stringValidationUtil!!.isEmpty(contentBase))
                        
                                    {
                                    internetHeaders!!.addHeader("Content-Base", contentBase)

                                    }
                                
mimeBodyParts[1]= MimeBodyPart(internetHeaders, htmlAttachment!!.encodeToByteArray())

                                    }
                                
init(server, null as Authenticator, arrayOf(InternetAddress(from)), arrayOf(InternetAddress(to)), null as Array<InternetAddress?>, null as Array<InternetAddress?>, subject, mimeBodyParts)
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "emailConstructor", e)

                                    }
                                



                            throw e
}

}


                @Throws(MessagingException::class)
            
open fun init(server: String, authenticator: Authenticator, addresses_from: Array<InternetAddress?>, addresses_to: Array<InternetAddress?>, addresses_cc: Array<InternetAddress?>, addresses_bcc: Array<InternetAddress?>, subject: String, mimeBodyParts: Array<MimeBodyPart?>)
        //nullable = true from not(false or (false and false)) = true
{
var server = server
var authenticator = authenticator
var addresses_from = addresses_from
var addresses_to = addresses_to
var addresses_cc = addresses_cc
var addresses_bcc = addresses_bcc
var subject = subject
var mimeBodyParts = mimeBodyParts
this.properties= Properties()
this.properties.put(SMTP_HOST, server)

        try {
            
    var hostName: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(hostName))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put("Unable to get HostName so using fake", this, "init()")

                                    }
                                
this.properties.put(SMTP_LOCAL_HOST, "FakeHostName")

                                    }
                                
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put("Continuing on Exception: Unable to get HostName", this, "init()", e)

                                    }
                                
this.properties.put(SMTP_LOCAL_HOST, "FakeHostName")
}


    
                        if(isDebug)
                        
                                    {
                                    this.properties.put(DEBUG, "true")

                                    }
                                

    var session: Session = Session.getInstance(properties, authenticator)!!


    
                        if(isDebug)
                        
                                    {
                                    session.setDebug(true)
bs= ByteArrayOutputStream()

    var printStream: PrintStream = PrintStream(bs)

session.setDebugOut(printStream)

                                    }
                                
msg= MimeMessage(session)
msg.addFrom(addresses_from)
msg.setRecipients(Message.RecipientType.TO, addresses_to)
msg.setRecipients(Message.RecipientType.CC, addresses_cc)
msg.setRecipients(Message.RecipientType.BCC, addresses_bcc)
msg.setSubject(subject)

    var mimeMultipart: MimeMultipart = MimeMultipart()





                        for (i in 0 until mimeBodyParts!!.size)

        {
mimeMultipart!!.addBodyPart(mimeBodyParts[i]!!)
}

msg.setContent(mimeMultipart)
}


open fun getMimeMessage()
        //nullable = true from not(false or (false and true)) = true
: MimeMessage{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.msg
}


open fun getDebugInfo()
        //nullable = true from not(false or (false and true)) = true
: String{

    
                        if(isDebug)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "More Logging Before This To Standard Out: " +
                                    //Otherwise - right - ObjectCreationExpr


                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Debugging Is Off"

                        }
                            
}


                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "\nHashMap: " +this.toHashMap()!!.toString()
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

        try {
            
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(EmailData.SERVER, properties.get(SMTP_HOST) as String)

    var addresses: Array<Address?> = msg.getFrom()!!


    
                        if(addresses != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until addresses.size)

        {
hashMap!!.put(EmailData.FROM, addresses[index]!!.toString())
}


                                    }
                                
addresses= msg.getRecipients(Message.RecipientType.TO)

    
                        if(addresses != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until addresses.size)

        {
hashMap!!.put(EmailData.TO, addresses[index]!!.toString())
}


                                    }
                                
addresses= msg.getRecipients(Message.RecipientType.CC)

    
                        if(addresses != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until addresses.size)

        {
hashMap!!.put(EmailData.CC, addresses[index]!!.toString())
}


                                    }
                                
addresses= msg.getRecipients(Message.RecipientType.BCC)

    
                        if(addresses != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until addresses.size)

        {
hashMap!!.put(EmailData.BCC, addresses[index]!!.toString())
}


                                    }
                                
hashMap!!.put(EmailData.SUBJECT, msg.getSubject())

    var mimeMultipart: MimeMultipart = msg.getContent() as MimeMultipart


    
                        if(mimeMultipart != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until mimeMultipart!!.getCount()!!)

        {

    var content: String = mimeMultipart!!.getBodyPart(index)!!.getContent() as String

hashMap!!.put(EmailData.CONTENT, content)
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "toHashMap()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = ModDomHelper.createNameValueNodes(document, EmailData.NAME, this.toHashMap())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


}
                
            

