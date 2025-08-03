
        /* Generated Code Do Not Modify */
        package java.util



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Objects
            : Object
         {
        

        companion object {


open fun <T> requireNonNull(value: T)
        //nullable = true from not(false or (false and false)) = true
: T{

                    var value = value

    
                        if(value == 
                                    null
                                )
                        
                                    {
                                    


                            throw NullPointerException()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                        }
                            
}


open fun <T> requireNonNull(value: T, message: String)
        //nullable = true from not(false or (false and false)) = true
: T{

                    var value = value


                    var message = message

    
                        if(value == 
                                    null
                                )
                        
                                    {
                                    


                            throw NullPointerException(message)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                        }
                            
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

