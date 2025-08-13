
        /* Generated Code Do Not Modify */
        package org.allbinary.game



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicGameInfoFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: BasicGameInfoFactory = BasicGameInfoFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicGameInfoFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    var currentReleaseIndex: Int= 0

    var currentDestroyIndex: Int= 0

    var total: Int= 0
private constructor        ()
            : super()
        {}


open fun init(total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var total = total
currentReleaseIndex= 0
currentDestroyIndex= 0
this.total= total
}


open fun isPeaked()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.currentDestroyIndex >= this.total)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun howManyLeft()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.total -this.currentDestroyIndex
}


}
                
            

