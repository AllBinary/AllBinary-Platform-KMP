
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class J2MEGameKey : Input {
        

        companion object {
            
open fun getString(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var keyCode = keyCode

    var input: Input = InputFactory.getInstance()!!.getInstance(keyCode)!!


    
                        if(input != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return input.getName()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


        }
            protected constructor        (key: Int, keyName: String)                        

                            : super(key, keyName){

                    var key = key


                    var keyName = keyName


                            //For kotlin this is before the body of the constructor.
                    

    var id: Int = this.getId()!!


    
                        if(id >= 0)
                        
                                    {
                                    
    var inputFactory: InputFactory = InputFactory.getInstance()!!

inputFactory!!.add(id, this)

                                    }
                                
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append("J2MEGameKey: ")!!.append(super.toString())!!.toString()
}


}
                
            

