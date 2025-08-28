
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class AndroidGameKey : Input {
        

        companion object {
            
open fun getString(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
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
             constructor        (keyCode: Int, name: String)                        

                            : super(keyCode, name)

        Updates for KMP build        
        {
var keyCode = keyCode
var name = name


                            //For kotlin this is before the body of the constructor.
                    

    var inputFactory: InputFactory = InputFactory.getInstance()!!

inputFactory!!.inputIntegerArray[this.getId()]= this
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "AndroidGameKey: " +super.toString()
}


}
                
            

