
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
        package org.allbinary.data.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.util.Vector
import org.allbinary.data.tables.generator.IdGeneratorEntity
import org.allbinary.data.tables.generator.IdGeneratorEntityFactory
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class UniqueIdGenerator
            : Object
        
                , IdGeneratorInterface {
        

        companion object {
            
    val EXT: String = ".unq"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val idGeneratorEntity: IdGeneratorEntity

    private var name: String
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
idGeneratorEntity= IdGeneratorEntityFactory.getInstance() as IdGeneratorEntity
}


open fun initialize(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value

        try {
            
    var vector: Vector = Vector()

vector.add(name)
vector.add(Long.valueOf(value)!!.toString())
idGeneratorEntity!!.insert(vector)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "initialize", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setFile(filePathName: String, name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var filePathName = filePathName
var name = name
this.name= name
}


                @Throws(IOException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getNext()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var idLong: Long = this.idGeneratorEntity!!.get(name)!!


    var newValue: Long = .concatToString()

                                    !!

this.idGeneratorEntity!!.update(name, newValue)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return idLong!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "getNext", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

}


}
                
            

