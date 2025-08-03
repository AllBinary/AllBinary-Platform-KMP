
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
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


open fun setPrefixName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setFirstName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setLastName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setMiddleName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setSuffixName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setCompany(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setPositionAtCompany(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setMainEmail(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setSecondaryEmail(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setHomePhone(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setCellPhone(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setWorkPhone(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setOtherContact(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setElectronicContact(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setFax(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setRole(aRole: UserRole)
        //nullable = true from not(false or (false and false)) = true


open fun setEncryption(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setSecret(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setPermissions(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun enable()
        //nullable = true from not(false or (false and true)) = true


open fun setEnable(enable: String)
        //nullable = true from not(false or (false and false)) = true


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPrefixName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getFirstName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getLastName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getMiddleName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSuffixName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCompany()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPositionAtCompany()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getMainEmail()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSecondaryEmail()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getHomePhone()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCellPhone()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getWorkPhone()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getOtherContact()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getElectronicContact()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getFax()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole

open fun getEncryption()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSecret()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPermissions()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getUserConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserConfigurationInterface

open fun setUserConfigurationInterface(userConfigurationInterface: UserConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


open fun toPasswordHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

open fun validateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true


open fun updateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true


open fun isSessionValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

