
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
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.AdminEmailInfo
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class BasicTextEmailHelper : TagHelper {
        

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private var hashMap: HashMap<Any, Any>

    private var pageContext: PageContext
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext
this.pageContext= pageContext
this.hashMap= hashMap
}


                @Throws(Exception::class)
            
open fun send()
        //nullable = true from not(false or (false and true)) = true
{
    var adminEmailSubject: String = hashMap!!.get("Subject") as String


    var adminEmailTextBody: String = hashMap!!.get("Body") as String


    var adminBasicEmailInfo: BasicEmailInfo = AdminEmailInfo(adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var adminEmailInfo: EmailInfo = EmailInfo(adminBasicEmailInfo)


    var adminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, UserEmailEventNameData.INSTALLER)!!
            

adminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.INSTALLER, adminEmailInfo)
}


}
                
            

