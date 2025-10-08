
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
        package org.allbinary.logic.communication.http.file.upload




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.role.BasicUserRoleFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.allbinary.string.CommonStrings

open public class HttpFilePermissions
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val file: AbFile

    private val userRoles: Vector = Vector()
public constructor (fullPath: AbPath)
            : super()
        {
var fullPath = fullPath
file= AbFile(AbPath(fullPath!!.toFileSystemString(), FileUploadData.getInstance()!!.FILE))

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Loading Privileges: " +fullPath!!.toFileSystemString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    
                        if(this.isFile())
                        
                                    {
                                    userRoles!!.add(BasicUserRoleFactory.getInstance()!!.ADMINISTRATOR)

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("User Roles: " +userRoles, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


    open fun isFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.isFile()
}


    open fun getUserRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userRoles
}


}
                
            

