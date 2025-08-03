
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.user.UserData
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.password.Password
import org.allbinary.business.user.role.BasicUserRole
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.data.tables.user.UserEntityInterface
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.http.request.session.WeblisketSessionData
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.email.NewPasswordEmail
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class AuthenticationRequestHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private var weblisketSession: WeblisketSession

    private var request: HttpServletRequest
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext
this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.request= pageContext!!.getRequest() as HttpServletRequest
}

public constructor        (hashMap: HashMap<Any, Any>, httpServletRequest: HttpServletRequest){

                    var hashMap = hashMap


                    var httpServletRequest = httpServletRequest
this.weblisketSession= WeblisketSession(hashMap, httpServletRequest)
this.request= httpServletRequest
}


                @Throws(Exception::class)
            
open fun generateNewPassword()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(this.weblisketSession != 
                                    null
                                 && this.weblisketSession!!.getId() != 
                                    null
                                )
                        
                                    {
                                    
    var startIndex: Int = this.weblisketSession!!.getId()!!.length!!
            


    
                        if(startIndex >= 8)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.weblisketSession!!.getId()!!.substring(startIndex -8)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Error Generating New Password")

                        }
                            

                                    }
                                
                        else {
                            


                            throw Exception(
                            "No Session Available For Generating New Password")

                        }
                            
}


open fun newPassword()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var userName: String = request!!.getParameter(WeblisketSessionData.REMOVABLEUSERNAME)!!
            


    var email: String = request!!.getParameter(UserData.MAINEMAIL)!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Generating New Password For: " +userName, this, 
                            "newPassword()")

                                    }
                                

    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!
            


    var userInterface: UserInterface = userEntityInterface!!.getUser(userName)!!
            


    
                        if(userInterface!!.getMainEmail()!!.compareTo(email) != 0)
                        
                                    {
                                    
    
                        if(userInterface!!.getSecondaryEmail() != 
                                    null
                                 && userInterface!!.getSecondaryEmail()!!.compareTo(email) != 0)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "Requested Email Is Not In User Profile", this, 
                            "newPassword()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                

    var newPassword: String = this.generateNewPassword()!!
            

userInterface!!.setPassword(newPassword)

    var newPasswordHashMap: HashMap<Any, Any> = userInterface!!.toPasswordHashMap()!!
            

UserEntityFactory.getInstance()!!.update(userName, newPasswordHashMap)
NewPasswordEmail(this.abeClientInformation, userInterface, newPassword).
                            process()

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Generated New Password For: " +userName, this, 
                            "newPassword()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "newPassword()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun changePassword()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var userName: String = request!!.getParameter(WeblisketSessionData.REMOVABLEUSERNAME)!!
            


    var passwordString: String = request!!.getParameter(WeblisketSessionData.REMOVABLEPASSWORD)!!
            


    var newPassword: String = request!!.getParameter(WeblisketSessionData.REMOVABLENEWPASSWORD)!!
            


    var newReenteredPassword: String = request!!.getParameter(WeblisketSessionData.REMOVABLEREENTERNEWPASSWORD)!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Changing Password For User: " +userName, this, 
                            "changePassword()")

                                    }
                                

    var password: Password = Password(newPassword)


    
                        if(!password!!.isValid()!!)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "New Password Is Not Valid", this, 
                            "changePassword()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(newPassword!!.compareTo(newReenteredPassword) != 0)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "New Password Fields Do Not Match", this, 
                            "changePassword()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var sessionPassword: String = this.weblisketSession!!.getPassword()!!
            


    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!
            


    var userInterface: UserInterface = userEntityInterface!!.getUser(userName)!!
            


    var login: String = userEntityInterface!!.login(userName, passwordString)!!
            


    
                        if(login!!.compareTo(GLOBALS2.LOGINSUCCESS) == 0)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "Authentication Successful", this, 
                            "changePassword()")

                                    }
                                

    var newPasswordHashMap: HashMap<Any, Any> = password!!.toHashMap(
                            null)!!
            

UserEntityFactory.getInstance()!!.update(userName, newPasswordHashMap)
NewPasswordEmail(this.abeClientInformation, userInterface, newPassword).
                            process()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "Authentication Failed", this, 
                            "changePassword()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Authentication Failed", this, 
                            "changePassword()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun isRoleValid(userName: String, password: String, roles: Vector)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var userName = userName


                    var password = password


                    var roles = roles

        try {
            
    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!
            


    var userInterface: UserInterface = userEntityInterface!!.getUser(userName)!!
            


    
                        if(userInterface!!.getRole() == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Role is null: " +userInterface!!.getRole() +" Valid Roles: " +roles!!.toString(), this, 
                            "isRoleValid()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var basicUserRoleArray: Array<Any?> = roles!!.toArray()!!
            


    var size: Int = basicUserRoleArray!!.size
                





                        for (index in 0 until size)


        {
    var nextRole: BasicUserRole = basicUserRoleArray[index]!! as BasicUserRole


    
                        if(userInterface!!.getRole()!!.getBasicUserRole()!!.equals(nextRole))
                        
                                    {
                                    userInterface!!.validateSession(weblisketSession as WeblisketSessionInterface)
this.request!!.removeAttribute(WeblisketSessionData.REMOVABLEUSERNAME)
this.request!!.removeAttribute(WeblisketSessionData.REMOVABLEPASSWORD)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
}


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Role is not valid: ")
stringBuffer!!.append(userInterface!!.getRole()!!.toString())
stringBuffer!!.append(
                            " Valid Roles: ")
stringBuffer!!.append(roles!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "isRoleValid()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "isRoleValid()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

