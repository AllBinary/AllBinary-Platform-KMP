
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
        package org.allbinary.business.context.modules.storefront.statistics.users




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.role.UserRole
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.data.tables.user.UserEntityInterface

open public class StoreFrontUsersStatistics
            : Object
        
                , StoreFrontUsersStatisticsInterface {
        

    private var totalNumberOfUsers: Long

    private var totalUsersByRoleHashMap: HashMap<Any, Any>
public constructor        (storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var storeFrontInterface = storeFrontInterface
this.totalUsersByRoleHashMap= HashMap<Any, Any>()

    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!


    var userVector: Vector = userEntityInterface!!.getCustomers()!!

this.totalNumberOfUsers= userVector!!.size as Long

    var size: Int = userVector!!.size!!





                        for (index in 0 until size)

        {
    var userInterface: UserInterface = userVector!!.get(index) as UserInterface


    var nextUserRole: UserRole = userInterface!!.getRole()!!


    var currentNumberOfUsersForRole: Long = this.getNewTotal(nextUserRole)!!

totalUsersByRoleHashMap!!.put(nextUserRole, currentNumberOfUsersForRole)
}

}


open fun getNewTotal(userRole: UserRole)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var userRole = userRole

    var numberOfUsersForRoleLong: Long = totalUsersByRoleHashMap!!.get(userRole as Object) as Long


    
                        if(numberOfUsersForRoleLong == 
                                    null
                                )
                        
                                    {
                                    numberOfUsersForRoleLong= 0 as Long

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return numberOfUsersForRoleLong!!.longValue() +1 as Long
}


open fun getNumberOfUsers()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalNumberOfUsers
}


open fun getNumberOfUsersByRole(role: String)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var role = role

    var totalForRole: Long = this.totalUsersByRoleHashMap!!.get(role as Object) as Long




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalForRole
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(StoreFrontUsersStatisticsData.getInstance()!!.NUMBEROFUSERS, this.getNumberOfUsers()!!.toString())

    var setOfUserRoles: Set = this.totalUsersByRoleHashMap!!.keys!!


    var nextUserRole: UserRole


    var userRoleArray: Array<Any?> = setOfUserRoles!!.toArray()!!


    var size: Int = userRoleArray!!.size
                





                        for (index in 0 until size)

        {nextUserRole= userRoleArray[index]!! as UserRole

    var totalForRole: Long = this.totalUsersByRoleHashMap!!.get(nextUserRole as Object) as Long

hashMap!!.put(nextUserRole!!.toString(), totalForRole!!.toString())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

