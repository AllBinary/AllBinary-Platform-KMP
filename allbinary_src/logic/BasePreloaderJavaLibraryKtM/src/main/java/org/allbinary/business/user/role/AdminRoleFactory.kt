
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
        package org.allbinary.business.user.role




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class AdminRoleFactory
            : Object
         {
        

        companion object {
            
    private val instance: AdminRoleFactory = AdminRoleFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AdminRoleFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val adminRoles: Vector<Any> = Vector<Any>()

    private val storeAdminRoles: Vector<Any> = Vector<Any>()

    private val storeManagementRoles: Vector<Any> = Vector<Any>()

    private val productManagementRoles: Vector<Any> = Vector<Any>()

    private val reviewManagementRoles: Vector<Any> = Vector<Any>()

    private val customerManagementRoles: Vector<Any> = Vector<Any>()

    private val workflowManagementRoles: Vector<Any> = Vector<Any>()

    private val orderManagementRoles: Vector<Any> = Vector<Any>()

    private val adjusterManagementRoles: Vector<Any> = Vector<Any>()

    private val shippingManagementRoles: Vector<Any> = Vector<Any>()

    private val webManagementRoles: Vector<Any> = Vector<Any>()
private constructor        ()
            : super()
        {

    var basicUserRoleFactory: BasicUserRoleFactory = BasicUserRoleFactory.getInstance()!!

adminRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
storeAdminRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
storeAdminRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
storeManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
storeManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
storeManagementRoles!!.add(basicUserRoleFactory!!.CUSTOMERMANAGER)
storeManagementRoles!!.add(basicUserRoleFactory!!.ADJUSTER)
storeManagementRoles!!.add(basicUserRoleFactory!!.PRODUCTMANAGER)
storeManagementRoles!!.add(basicUserRoleFactory!!.REVIEWER)
storeManagementRoles!!.add(basicUserRoleFactory!!.SHIPPING)
productManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
productManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
productManagementRoles!!.add(basicUserRoleFactory!!.PRODUCTMANAGER)
reviewManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
reviewManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
reviewManagementRoles!!.add(basicUserRoleFactory!!.REVIEWER)
customerManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
customerManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
customerManagementRoles!!.add(basicUserRoleFactory!!.CUSTOMERMANAGER)
workflowManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
workflowManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
workflowManagementRoles!!.add(basicUserRoleFactory!!.WORKFLOWEDITOR)
orderManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
orderManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
adjusterManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
adjusterManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
adjusterManagementRoles!!.add(basicUserRoleFactory!!.ADJUSTER)
shippingManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
shippingManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
shippingManagementRoles!!.add(basicUserRoleFactory!!.SHIPPING)
webManagementRoles!!.add(basicUserRoleFactory!!.ADMINISTRATOR)
webManagementRoles!!.add(basicUserRoleFactory!!.STOREMANAGER)
webManagementRoles!!.add(basicUserRoleFactory!!.WEBMANAGER)
webManagementRoles!!.add(basicUserRoleFactory!!.WORKFLOWEDITOR)
webManagementRoles!!.add(basicUserRoleFactory!!.VIEWEDITOR)
}


open fun getProductManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return productManagementRoles
}


open fun getAdminRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminRoles
}


open fun getStoreAdminRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return storeAdminRoles
}


open fun getStoreManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return storeManagementRoles
}


open fun getReviewManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reviewManagementRoles
}


open fun getCustomerManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customerManagementRoles
}


open fun getWorkflowManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return workflowManagementRoles
}


open fun getWebManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return webManagementRoles
}


open fun getShippingManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shippingManagementRoles
}


open fun getAdjusterManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adjusterManagementRoles
}


open fun getOrderManagementRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderManagementRoles
}


}
                
            

