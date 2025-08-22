
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
        package org.allbinary.business.user.address




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import javax.servlet.http.HttpServletRequest
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class StreetAddress
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var id: String

    private var name: String

    private var street: String

    private var city: String

    private var state: String

    private var code: String

    private var country: String

    private var isDefault: Boolean = false
public constructor        ()
            : super()
        {}

public constructor        (node: Node)
            : super()
        {

                    var node = node

    var nameNode: Node = DomSearchHelper.getNode(StreetAddressData.NAME, node.getChildNodes())!!

this.name= DomNodeHelper.getTextNodeValue(nameNode)

    var streetNode: Node = DomSearchHelper.getNode(StreetAddressData.STREET, node.getChildNodes())!!

this.street= DomNodeHelper.getTextNodeValue(streetNode)

    var cityNode: Node = DomSearchHelper.getNode(StreetAddressData.CITY, node.getChildNodes())!!

this.city= DomNodeHelper.getTextNodeValue(cityNode)

    var stateNode: Node = DomSearchHelper.getNode(StreetAddressData.STATE, node.getChildNodes())!!

this.state= DomNodeHelper.getTextNodeValue(stateNode)

    var codeNode: Node = DomSearchHelper.getNode(StreetAddressData.CODE, node.getChildNodes())!!

this.code= DomNodeHelper.getTextNodeValue(codeNode)

    var countryNode: Node = DomSearchHelper.getNode(StreetAddressData.COUNTRY, node.getChildNodes())!!

this.country= DomNodeHelper.getTextNodeValue(countryNode)
this.log()
}

public constructor        (streetAddress: StreetAddress)
            : super()
        {

                    var streetAddress = streetAddress
this.id= streetAddress!!.getId()
this.name= streetAddress!!.getName()
this.street= streetAddress!!.getStreet()
this.city= streetAddress!!.getCity()
this.state= streetAddress!!.getState()
this.code= streetAddress!!.getCode()
this.country= streetAddress!!.getCountry()
this.isDefault= streetAddress!!.isDefault()
this.log()
}

public constructor        (request: HttpServletRequest)
            : super()
        {

                    var request = request
this.setId(request.getParameter(StreetAddressData.ID))
this.setName(request.getParameter(StreetAddressData.NAME))
this.setStreet(request.getParameter(StreetAddressData.STREET))
this.setCity(request.getParameter(StreetAddressData.CITY))
this.setState(request.getParameter(StreetAddressData.STATE))
this.setCode(request.getParameter(StreetAddressData.CODE))
this.setCountry(request.getParameter(StreetAddressData.COUNTRY))
this.log()
}

public constructor        (name: String, street: String, city: String, state: String, code: String, country: String)
            : super()
        {

                    var name = name


                    var street = street


                    var city = city


                    var state = state


                    var code = code


                    var country = country
this.name= name
this.street= street
this.city= city
this.state= state
this.code= code
this.country= country
this.log()
}

public constructor        (address: HashMap<Any, Any>)
            : super()
        {

                    var address = address
this.id= address.get(StreetAddressData.ID) as String
this.name= address.get(StreetAddressData.NAME) as String
this.street= address.get(StreetAddressData.STREET) as String
this.city= address.get(StreetAddressData.CITY) as String
this.state= address.get(StreetAddressData.STATE) as String
this.code= address.get(StreetAddressData.CODE) as String
this.country= address.get(StreetAddressData.COUNTRY) as String

    var def: String = address.get(StreetAddressData.DEFAULT) as String


    
                        if(def != 
                                    null
                                 && def.compareTo(StreetAddressData.DEFAULT) == 0)
                        
                                    {
                                    this.isDefault= true

                                    }
                                
                        else {
                            this.isDefault= false

                        }
                            
this.log()
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Created Address: \n" +this.toHashMap(), this, "log")

                                    }
                                
}


open fun setId(id: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id
this.id= id
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun setStreet(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.street= value
}


open fun setCity(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.city= value
}


open fun setState(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.state= value
}


open fun setCode(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.code= value
}


open fun setCountry(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.country= value
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getStreet()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.street
}


open fun getCity()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.city
}


open fun getState()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.state
}


open fun getCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.code
}


open fun getCountry()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.country
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun isDefault()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isDefault
}


open fun isEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(this.getName() == 
                                    null
                                 && this.getName()!!.compareTo(EMPTY_STRING) == 0 && this.getStreet() == 
                                    null
                                 && this.getStreet()!!.compareTo(EMPTY_STRING) == 0 && this.getCity() == 
                                    null
                                 && this.getCity()!!.compareTo(EMPTY_STRING) == 0 && this.getState() == 
                                    null
                                 && this.getState()!!.compareTo(EMPTY_STRING) == 0 && this.getCode() == 
                                    null
                                 && this.getCode()!!.compareTo(EMPTY_STRING) == 0 && this.getCountry() == 
                                    null
                                 && this.getCountry()!!.compareTo(EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(this.getName() == 
                                    null
                                 || this.getName()!!.compareTo(EMPTY_STRING) == 0 || this.getStreet() == 
                                    null
                                 || this.getStreet()!!.compareTo(EMPTY_STRING) == 0 || this.getCity() == 
                                    null
                                 || this.getCity()!!.compareTo(EMPTY_STRING) == 0 || this.getState() == 
                                    null
                                 || this.getState()!!.compareTo(EMPTY_STRING) == 0 || this.getCode() == 
                                    null
                                 || this.getCode()!!.compareTo(EMPTY_STRING) == 0 || this.getCountry() == 
                                    null
                                 || this.getCountry()!!.compareTo(EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringBuilder = StringBuilder()

stringBuffer!!.append("Address Failed To Validate - All fields must contain data.<br></br>")

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(!stringValidationUtil!!.isValidRequired(this.getName(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid name")
stringBuffer!!.append("<br></br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.getStreet(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid street")
stringBuffer!!.append("<br></br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.getCity(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid city")
stringBuffer!!.append("<br></br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.getState(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid state")
stringBuffer!!.append("<br></br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.getCode(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid zipcode")
stringBuffer!!.append("<br></br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.getCountry(), StreetAddressData.MIN, StreetAddressData.MAX))
                        
                                    {
                                    stringBuffer!!.append("Please enter a valid country")
stringBuffer!!.append("<br></br>")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
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

        try {
            
    var node: Node = document.createElement(StreetAddressData.FORM)!!

node.appendChild(this.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "toValidationInfoNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(StreetAddressData.ID, this.id)
hashMap!!.put(StreetAddressData.NAME, this.name)
hashMap!!.put(StreetAddressData.STREET, this.street)
hashMap!!.put(StreetAddressData.CITY, this.city)
hashMap!!.put(StreetAddressData.STATE, this.state)
hashMap!!.put(StreetAddressData.CODE, this.code)
hashMap!!.put(StreetAddressData.COUNTRY, this.country)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var hashMap: HashMap<Any, Any> = this.toHashMap()!!


    var keySet: Set = hashMap!!.keys!!


    var keyArray: Array<Any?> = keySet!!.toArray()!!


    var size: Int = keyArray!!.size
                


    var node: Node = document.createElement(StreetAddressData.ADDRESS)!!





                        for (i in 0 until size)


        {
    var name: String = keyArray[i]!! as String


    var value: String = stringUtil!!.getInstance(hashMap!!.get(name as Object) as String)!!

node.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

