
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
        package org.allbinary.logic.java.bool




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringValidationUtil

open public class BooleanUtil
            : Object
         {
        

        companion object {
            
    private val instance: BooleanUtil = BooleanUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BooleanUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getFromString(booleanString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var booleanString = booleanString

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!
            


    
                        if(stringValidationUtil!!.isEmpty(booleanString))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var booleanStringLowerCase: String = booleanString!!.lowercase()!!
            


    
                        if(booleanStringLowerCase!!.compareTo(booleanFactory!!.TRUE_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(booleanStringLowerCase!!.compareTo(booleanFactory!!.FALSE_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                            throw Exception("Invalid booleanString - Must be true or false")

                        }
                            
}


                @Throws(Exception::class)
            
open fun isStringBoolean(booleanString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var booleanString = booleanString

    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!
            


    var booleanStringLowerCase: String = booleanString!!.lowercase()!!
            


    
                        if(booleanStringLowerCase!!.compareTo(booleanFactory!!.TRUE_STRING) == 0 || booleanStringLowerCase!!.compareTo(booleanFactory!!.FALSE_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

