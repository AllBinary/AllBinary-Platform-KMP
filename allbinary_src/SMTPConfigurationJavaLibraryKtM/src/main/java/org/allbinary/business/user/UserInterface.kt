
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
import org.allbinary.business.user.modules.configuration.UserConfigurationInterface
import org.allbinary.business.user.role.UserRole
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
import org.allbinary.logic.control.validate.ValidationInterface
interface UserInterface : TableMappingInterface, ValidationInterface {
        

open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPrefixName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setFirstName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setLastName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setMiddleName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setSuffixName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setCompany(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPositionAtCompany(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setMainEmail(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setSecondaryEmail(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setHomePhone(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setCellPhone(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setWorkPhone(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setOtherContact(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setElectronicContact(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setFax(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setRole(aRole: UserRole)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setEncryption(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setSecret(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPermissions(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun enable()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun setEnable(enable: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPrefixName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getFirstName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLastName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getMiddleName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getSuffixName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCompany()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPositionAtCompany()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getMainEmail()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getSecondaryEmail()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHomePhone()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCellPhone()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getWorkPhone()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getOtherContact()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getElectronicContact()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getFax()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole

        Updates for KMP build        
        

open fun getEncryption()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getSecret()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPermissions()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getUserConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserConfigurationInterface

        Updates for KMP build        
        

open fun setUserConfigurationInterface(userConfigurationInterface: UserConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun toPasswordHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        

open fun validateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun updateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun isSessionValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

}
                
            

