
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
        package org.allbinary.logic.system.security.crypt.jcehelper




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.security.spec.KeySpec
import javax.crypto.spec.DESKeySpec
import javax.crypto.spec.DESedeKeySpec
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class KeySpecFactory
            : Object
         {
        

        companion object {
            
    private val instance: KeySpecFactory = KeySpecFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: KeySpecFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val DES: String = "DES"

    val DESEDE: String = "DESede"

    val BLOWFISH: String = "Blowfish"
private constructor        ()
            : super()
        {}


open fun getInstance(algorithm: String, keyData: ByteArray)
        //nullable =  from not(true or (false and false)) = 
: KeySpec{

                    var algorithm = algorithm


                    var keyData = keyData

        try {
            
    
                        if(algorithm.compareTo(this.DES) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DESKeySpec(keyData)

                                    }
                                
                             else 
    
                        if(algorithm.compareTo(this.DESEDE) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DESedeKeySpec(keyData)

                                    }
                                
                        else {
                            


                            throw RuntimeException()

                        }
                            
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)



                            throw RuntimeException()
}

}


}
                
            

