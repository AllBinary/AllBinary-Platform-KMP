
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
        package org.allbinary.business.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.modules.User
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

open public class NewUserFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return User()
}


                @Throws(Exception::class)
            
open fun getInstance(transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: UserInterface{

                    var transformInfoInterface = transformInfoInterface

    var httpTransformInfoInterface: TransformInfoHttpInterface = transformInfoInterface as TransformInfoHttpInterface


    var httpServletRequest: HttpServletRequest = httpTransformInfoInterface!!.getPageContext()!!.getRequest() as HttpServletRequest


    var hashMap: HashMap<Any, Any> = RequestParams(httpServletRequest).
                            toHashMap()!!
            


    var role: String = httpTransformInfoInterface!!.getPropertiesHashMap()!!.get(UserRoleData.NAME.toString()) as String

hashMap!!.put(UserRoleData.NAME.toString(), role)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CreateUserFactory.getInstance(hashMap)
}


                @Throws(Exception::class)
            
open fun getInstance(httpServletRequest: HttpServletRequest, propertiesHashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: UserInterface{

                    var httpServletRequest = httpServletRequest


                    var propertiesHashMap = propertiesHashMap

    
                        if(propertiesHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var requestHashMap: HashMap<Any, Any> = RequestParams(httpServletRequest).
                            toHashMap()!!
            


    var roleString: String = propertiesHashMap!!.get(UserRoleData.NAME.toString()) as String

requestHashMap!!.put(UserRoleData.NAME.toString(), roleString)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CreateUserFactory.getInstance(requestHashMap)

                                    }
                                
                        else {
                            


                            throw Exception("Null HashMap")

                        }
                            
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

