
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
        
import java.util.Vector
import org.allbinary.business.user.role.BasicUserRole
import org.allbinary.business.user.role.UserRole
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.file.upload.HttpFilePermissions
import org.allbinary.logic.communication.http.request.HttpRequestUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.string.CommonLabels

open public class AuthenticationHelperUtil
            : Object
         {
        

        companion object {


    private val instance: AuthenticationHelperUtil = AuthenticationHelperUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AuthenticationHelperUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun isAuthorized(authenticationHelper: AuthenticationHelper, filePath: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var authenticationHelper = authenticationHelper


                    var filePath = filePath

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(CommonLabels.getInstance()!!.START +filePath, this, 
                            "isAuthorized()")

                                    }
                                

    var endIndex: Int = HttpRequestUtil.getInstance()!!.getLastSeparatorIndex(filePath)!!
            


    var fullPath: AbPath = AbPath(URLGLOBALS.getWebappPath() +filePath!!.substring(0, endIndex))


    var downloadFilePermissions: HttpFilePermissions = HttpFilePermissions(fullPath)


    var userRoles: Vector = downloadFilePermissions!!.getUserRoles()!!
            


    var userRole: UserRole = authenticationHelper!!.getRole()!!
            


    var basicUserRole: BasicUserRole = userRole!!.getBasicUserRole()!!
            


    
                        if(userRoles!!.contains(basicUserRole))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Authorized", this, 
                            "isAuthorized()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Not Authorized: " +basicUserRole!!.toString(), this, 
                            "isAuthorized()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

