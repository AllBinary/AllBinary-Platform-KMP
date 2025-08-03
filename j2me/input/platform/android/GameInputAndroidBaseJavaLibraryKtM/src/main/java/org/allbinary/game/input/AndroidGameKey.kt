
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class AndroidGameKey : Input {
        

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
                        return input!!.getName()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}



        }
             constructor        (keyCode: Int, name: String)                        

                            : super(keyCode, name){

                    var keyCode = keyCode


                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
this.inputFactory!!.inputIntegerArray[this.getId()]= this
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "AndroidGameKey: " +super.toString()
}


}
                
            

