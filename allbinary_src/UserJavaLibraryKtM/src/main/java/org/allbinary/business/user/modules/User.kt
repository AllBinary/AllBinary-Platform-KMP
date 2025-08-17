
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
        package org.allbinary.business.user.modules




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.modules.configuration.UserConfigurationDomDocumentMapping
import org.allbinary.business.user.modules.configuration.UserConfigurationInterface
import org.allbinary.business.user.modules.configuration.UserConfigurationInterfaceFactory
import org.allbinary.business.user.password.Password
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleB
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.business.user.username.UserName
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.http.request.session.WeblisketSessionData
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class User
            : Object
        
                , UserInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var userName: String

    private var prefixName: String

    private var firstName: String

    private var lastName: String

    private var middleName: String

    private var suffixName: String

    private var company: String

    private var positionAtCompany: String

    private var mainEmail: String

    private var secondaryEmail: String

    private var homePhone: String

    private var cellPhone: String

    private var workPhone: String

    private var otherContact: String

    private var electronicDevice: String

    private var fax: String

    private var role: UserRole

    private var encryption: String

    private var secret: String

    private var password: Password

    private var enable: String

    private var permissions: String

    private var userConfigurationInterface: UserConfigurationInterface
public constructor        ()
            : super()
        {this.userConfigurationInterface= UserConfigurationInterfaceFactory.getInstance()
this.password= Password(StringUtil.getInstance()!!.EMPTY_STRING)
}

public constructor        (request: HttpServletRequest)
            : super()
        {

                    var request = request
this.getFormData(RequestParams(request).
                            toHashMap())
this.userConfigurationInterface= UserConfigurationInterfaceFactory.getInstance(this.getRole())
}

public constructor        (userHashMap: HashMap<Any, Any>)
            : super()
        {

                    var userHashMap = userHashMap
this.getFormData(userHashMap)
this.userConfigurationInterface= UserConfigurationInterfaceFactory.getInstance(this.getRole())
}


                @Throws(Exception::class)
            
open fun getFormData(userHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var userHashMap = userHashMap
this.userName= UserName(userHashMap).
                            get()

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var passwordString: String = stringUtil!!.getInstance(userHashMap!!.get(UserData.PASSWORD) as String)!!
            


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(stringValidationUtil!!.isEmpty(this.userName) && stringValidationUtil!!.isEmpty(passwordString))
                        
                                    {
                                    this.userName= stringUtil!!.getInstance(userHashMap!!.get(WeblisketSessionData.REMOVABLEUSERNAME) as String)
passwordString= stringUtil!!.getInstance(userHashMap!!.get(WeblisketSessionData.REMOVABLEPASSWORD) as String)

                                    }
                                

    var encryption: String = stringUtil!!.getInstance(userHashMap!!.get(EntryData.getInstance()!!.ENCRYPTION) as String)!!
            


    var secret: String = stringUtil!!.getInstance(userHashMap!!.get(UserData.SECRET) as String)!!
            

this.password= Password(passwordString)
this.prefixName= stringUtil!!.getInstance(userHashMap!!.get(UserData.PREFIXNAME) as String)
this.firstName= stringUtil!!.getInstance(userHashMap!!.get(UserData.FIRSTNAME) as String)
this.lastName= stringUtil!!.getInstance(userHashMap!!.get(UserData.LASTNAME) as String)
this.middleName= stringUtil!!.getInstance(userHashMap!!.get(UserData.MIDDLENAME) as String)
this.suffixName= stringUtil!!.getInstance(userHashMap!!.get(UserData.SUFFIXNAME) as String)
this.company= stringUtil!!.getInstance(userHashMap!!.get(UserData.COMPANY) as String)
this.positionAtCompany= stringUtil!!.getInstance(userHashMap!!.get(UserData.POSITIONATCOMPANY) as String)
this.mainEmail= stringUtil!!.getInstance(userHashMap!!.get(UserData.MAINEMAIL) as String)
this.secondaryEmail= stringUtil!!.getInstance(userHashMap!!.get(UserData.SECONDARYEMAIL) as String)
this.homePhone= stringUtil!!.getInstance(userHashMap!!.get(UserData.HOMEPHONE) as String)
this.cellPhone= stringUtil!!.getInstance(userHashMap!!.get(UserData.CELLPHONE) as String)
this.workPhone= stringUtil!!.getInstance(userHashMap!!.get(UserData.WORKPHONE) as String)
this.otherContact= stringUtil!!.getInstance(userHashMap!!.get(UserData.OTHERCONTACT) as String)
this.electronicDevice= stringUtil!!.getInstance(userHashMap!!.get(UserData.ELECTRONICDEVICE) as String)
this.fax= stringUtil!!.getInstance(userHashMap!!.get(UserData.FAX) as String)
this.role= UserRoleB.getRole(userHashMap!!.get(UserRoleData.NAME.toString()) as String)
this.permissions= stringUtil!!.getInstance(userHashMap!!.get(UserData.PERMISSIONS) as String)

    
                        if(!stringValidationUtil!!.isEmpty(this.permissions) && this.permissions.compareTo(StoreFrontData.getInstance()!!.NAME) == 0)
                        this.permissions= stringUtil!!.getInstance(userHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String)
                             else 
    
                        if(this.permissions == 
                                    null
                                )
                        
                                    {
                                    this.permissions= "No Permissions"

                                    }
                                
this.enable= stringUtil!!.getInstance(userHashMap!!.get(EntryData.getInstance()!!.ENABLE) as String)
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(!UserName.getInstance()!!.isValid(this.userName))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!this.password.isValid())
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isValidRequired(firstName, 1, UserData.MAXLEN))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(lastName, 1, UserData.MAXLEN))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.mainEmail, 1, UserData.MAXLEN) || this.mainEmail!!.indexOf("@") ==  -1)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATIONERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(UserName.getValidationInfo(this.userName))
stringBuffer!!.append(this.password.getValidationInfo())

    
                        if(!stringValidationUtil!!.isValidRequired(firstName, 1, UserData.MAXLEN))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid First Name.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(lastName, 1, UserData.MAXLEN))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid Last Name.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.mainEmail, 1, UserData.MAXLEN) || this.mainEmail!!.indexOf("@") ==  -1)
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid email address.<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
}

}


open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.userName= value
}


open fun setPrefixName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.prefixName= value
}


open fun setFirstName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.firstName= value
}


open fun setLastName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.lastName= value
}


open fun setMiddleName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.middleName= value
}


open fun setSuffixName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.suffixName= value
}


open fun setCompany(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.company= value
}


open fun setPositionAtCompany(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.positionAtCompany= value
}


open fun setMainEmail(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.mainEmail= value
}


open fun setSecondaryEmail(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.secondaryEmail= value
}


open fun setHomePhone(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.homePhone= value
}


open fun setCellPhone(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.cellPhone= value
}


open fun setWorkPhone(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.workPhone= value
}


open fun setOtherContact(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.otherContact= value
}


open fun setElectronicContact(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.electronicDevice= value
}


open fun setFax(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.fax= value
}


open fun setRole(role: UserRole)
        //nullable = true from not(false or (false and false)) = true
{

                    var role = role
this.role= role
}


open fun setPermissions(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.permissions= value
}


open fun setEncryption(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.encryption= value
}


open fun setSecret(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.secret= value
}


open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.password.set(value)
}


open fun enable()
        //nullable = true from not(false or (false and true)) = true
{this.setEnable("Yes")
}


open fun disable()
        //nullable = true from not(false or (false and true)) = true
{this.setEnable("No")
}


open fun setEnable(enable: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var enable = enable
this.enable= enable
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun getPrefixName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.prefixName
}


open fun getFirstName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.firstName
}


open fun getLastName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastName
}


open fun getMiddleName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.middleName
}


open fun getSuffixName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.suffixName
}


open fun getCompany()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.company
}


open fun getPositionAtCompany()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.positionAtCompany
}


open fun getMainEmail()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mainEmail
}


open fun getSecondaryEmail()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.secondaryEmail
}


open fun getHomePhone()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.homePhone
}


open fun getCellPhone()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cellPhone
}


open fun getWorkPhone()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.workPhone
}


open fun getOtherContact()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.otherContact
}


open fun getElectronicContact()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.electronicDevice
}


open fun getFax()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fax
}


open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.role
}


open fun getPermissions()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.permissions
}


open fun getEncryption()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.encryption
}


open fun getSecret()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.secret
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.password.get()
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var values: Vector = Vector()

values.add(userName)
values.add(prefixName)
values.add(firstName)
values.add(lastName)
values.add(middleName)
values.add(suffixName)
values.add(company)
values.add(positionAtCompany)
values.add(mainEmail)
values.add(secondaryEmail)
values.add(homePhone)
values.add(cellPhone)
values.add(workPhone)
values.add(otherContact)
values.add(electronicDevice)
values.add(fax)
values.add(this.getRole()!!.toString())

    var userConfigurationDomDocumentMapping: UserConfigurationDomDocumentMapping = UserConfigurationDomDocumentMapping(this.getUserConfigurationInterface())

values.add(userConfigurationDomDocumentMapping!!.toDomDocumentString())
values.add(this.permissions)
values.addAll(this.password.toVector(this.secret))
values.add(this.enable)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.add(time)
values.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values.put(UserData.USERNAME, userName)
values.put(UserData.PREFIXNAME, prefixName)
values.put(UserData.FIRSTNAME, firstName)
values.put(UserData.LASTNAME, lastName)
values.put(UserData.MIDDLENAME, middleName)
values.put(UserData.SUFFIXNAME, suffixName)
values.put(UserData.COMPANY, company)
values.put(UserData.POSITIONATCOMPANY, positionAtCompany)
values.put(UserData.MAINEMAIL, mainEmail)
values.put(UserData.SECONDARYEMAIL, secondaryEmail)
values.put(UserData.HOMEPHONE, homePhone)
values.put(UserData.CELLPHONE, cellPhone)
values.put(UserData.WORKPHONE, workPhone)
values.put(UserData.OTHERCONTACT, otherContact)
values.put(UserData.ELECTRONICDEVICE, electronicDevice)
values.put(UserData.FAX, fax)

    
                        if(this.getRole() != 
                                    null
                                )
                        
                                    {
                                    values.put(UserRoleData.NAME.toString(), this.getRole()!!.toString())

                                    }
                                

    var userConfigurationDomDocumentMapping: UserConfigurationDomDocumentMapping = UserConfigurationDomDocumentMapping(this.getUserConfigurationInterface())

values.put(UserData.CONFIGURATION, userConfigurationDomDocumentMapping!!.toDomDocumentString())
values.put(UserData.PERMISSIONS, this.permissions)
values.putAll(this.password.toHashMap(this.secret))
values.put(EntryData.getInstance()!!.ENABLE, this.enable)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun toPasswordHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.password.toHashMap(this.secret)
}


open fun validateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var weblisketSession = weblisketSession
weblisketSession!!.setAuthenticated()
weblisketSession!!.setRole(this.getRole())
weblisketSession!!.setUserName(this.getUserName())
}


open fun updateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var weblisketSession = weblisketSession
}


open fun isSessionValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName as Object
}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getUserConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userConfigurationInterface
}


open fun setUserConfigurationInterface(userConfigurationInterface: UserConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userConfigurationInterface = userConfigurationInterface
this.userConfigurationInterface= userConfigurationInterface
}


}
                
            

