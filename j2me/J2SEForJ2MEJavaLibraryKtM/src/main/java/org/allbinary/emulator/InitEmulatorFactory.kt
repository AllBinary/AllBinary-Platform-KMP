
        /* Generated Code Do Not Modify */
        package org.allbinary.emulator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class InitEmulatorFactory
            : Object
         {
        
companion object {
            
    private val instance: InitEmulatorFactory = InitEmulatorFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InitEmulatorFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun setInitEmulator(initEmulator: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var initEmulator = initEmulator
this.initEmulator= initEmulator
}


    open fun isInitEmulator()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initEmulator
}


    private var initEmulator: Boolean = false

}
                
            

