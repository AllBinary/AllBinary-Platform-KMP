
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
        package org.allbinary.logic.system.security.licensing



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import java.util.Vector
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.util.BasicArrayList

open public class AbeClientLicense
            : Object
        
                , AbeLicenseInterface {
        

        companion object {
            
open fun hasRequiredKeys(resultHashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var resultHashtable = resultHashtable

    var abeClientInformationData: AbeClientInformationData = AbeClientInformationData.getInstance()!!
            


    
                        if(resultHashtable!!.containsKey(abeClientInformationData!!.LICENSEID) && resultHashtable!!.containsKey(abeClientInformationData!!.LICENSESERVERS) && resultHashtable!!.containsKey(abeClientInformationData!!.KEY) && resultHashtable!!.containsKey(abeClientInformationData!!.LICENSE_TYPE))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


        }
            
    private var hashtable: Hashtable<Any, Any>

    private var id: String

    private var servers: BasicArrayList

    private var special: String

    private var licenseType: LicenseType
public constructor        (hashtable: Hashtable<Any, Any>)
            : super()
        {

                    var hashtable = hashtable
this.hashtable= Hashtable<Any, Any>()

    var abeClientInformationData: AbeClientInformationData = AbeClientInformationData.getInstance()!!
            


    var keyValue: Any = hashtable.get(abeClientInformationData!!.KEY)!!
            


    
                        if(keyValue != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(keyValue is String)
                        
                                    {
                                    this.hashtable.put(abeClientInformationData!!.KEY, keyValue)

                                    }
                                

                                    }
                                
this.id= hashtable.get(abeClientInformationData!!.LICENSEID) as String

    var vector: Vector = hashtable.get(abeClientInformationData!!.LICENSESERVERS) as Vector

this.servers= BasicArrayList()

    var size: Int = vector.size!!
            





                        for (index in 0 until size)


        {this.servers.add(vector.get(index))
}


    var stringUtil: StringUtil = StringUtil.getInstance()!!
            

this.setSpecial(stringUtil!!.getInstance(hashtable.get(abeClientInformationData!!.SPECIAL) as String))

    var licenseTypeString: String = stringUtil!!.getInstance(hashtable.get(abeClientInformationData!!.LICENSE_TYPE) as String)!!
            

this.licenseType= LicenseTypeFactory.getInstance()!!.getInstance(licenseTypeString)
}


open fun hasKey()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isValid()
}


open fun getKey(keyName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var keyName = keyName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable.get(keyName as Object?) as String
}


open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun getServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.servers
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isEmpty(this.getKey(AbeClientInformationData.getInstance()!!.KEY)))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()


    var BREAK: String = "<br/>"

stringBuffer!!.append(
                            "License Id: ")
stringBuffer!!.append(this.getLicenseId())
stringBuffer!!.append(BREAK)
stringBuffer!!.append(
                            "Is Valid: ")
stringBuffer!!.append(this.isValid())
stringBuffer!!.append(BREAK)
stringBuffer!!.append(
                            "Keys: ")
stringBuffer!!.append(this.hashtable.toString())
stringBuffer!!.append(BREAK)

    var serverVector: BasicArrayList = this.getServers()!!
            


    var size: Int = serverVector!!.size()!!
            





                        for (index in 0 until size)


        {
    var nextServerString: String = serverVector!!.get(index) as String

stringBuffer!!.append(
                            "Server: ")
stringBuffer!!.append(nextServerString)
stringBuffer!!.append(BREAK)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun setSpecial(special: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var special = special
this.special= special
}


open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return special
}


open fun getLicenseType()
        //nullable = true from not(false or (false and true)) = true
: LicenseType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseType
}


}
                
            

