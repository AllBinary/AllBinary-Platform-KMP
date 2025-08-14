
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
        package org.allbinary.game.layer.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class BasicGameResources
            : Object
         {
        

        companion object {
            
    val stringBuffer: StringMaker = StringMaker()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var RESOURCE: String = StringUtil.getInstance()!!.EMPTY_STRING

    var RESOURCE_DESTROY: String = StringUtil.getInstance()!!.EMPTY_STRING
protected constructor        ()
            : super()
        {}


open fun init(ROOT: String, SIZE: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var ROOT = ROOT


                    var SIZE = SIZE

        try {
            
    var scale: Int = GameConfigurationCentral.getInstance()!!.SCALE.getValue()!!.toInt()!!
            


    
                        if(scale > 1 && scale -1 < SIZE.size)
                        
                                    {
                                    this.init(ROOT, SIZE[scale -1]!!)

                                    }
                                
                        else {
                            


                            throw Exception(StringMaker().
                            append(
                            "Invalid Value: ")!!.append(scale)!!.toString())

                        }
                            
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


                @Throws(Exception::class)
            
open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameGraphicsResourceUtil.getInstance()!!.getName()
}


                @Throws(Exception::class)
            
open fun init(ROOT: String, sizeString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var ROOT = ROOT


                    var sizeString = sizeString

    var DESTROY: String = "_destroy"


    var string: String = this.getString()!!
            

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ROOT)
stringBuffer!!.append(string)
stringBuffer!!.append(sizeString)
this.RESOURCE= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ROOT)
stringBuffer!!.append(DESTROY)
stringBuffer!!.append(string)
stringBuffer!!.append(sizeString)
this.RESOURCE_DESTROY= stringBuffer!!.toString()
}


}
                
            

