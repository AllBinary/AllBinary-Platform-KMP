
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
        package org.allbinary.logic.system




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class SoftwareInformation
            : Object
         {
        

    private val name: String

    private val shortName: String

    private val version: String
public constructor (name: String, version: String, shortName: String)
            : super()
        {
    //var name = name
    //var version = version
    //var shortName = shortName
this.name= name
this.version= version
this.shortName= shortName
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


    open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return version
}


    open fun toShortString()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shortName
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var NAME: String = "Name: "


    var VERSION: String = "Version: "


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(NAME)
stringBuffer!!.append(this.getName())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(VERSION)
stringBuffer!!.append(this.getVersion())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

