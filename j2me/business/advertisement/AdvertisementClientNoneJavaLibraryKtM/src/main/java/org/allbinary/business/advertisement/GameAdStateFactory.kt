
        /* Generated Code Do Not Modify */
        package org.allbinary.business.advertisement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameAdState
import org.allbinary.logic.system.SoftwareInformation

open public class GameAdStateFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameAdStateFactory = GameAdStateFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameAdStateFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val gameAdStateArray: Array<GameAdState?> = arrayOf(GameAdState(AppNameLicensingAdConfiguration()))

    private var gameAdState: GameAdState = gameAdStateArray[0]!!

open fun getCurrentInstance()
        //nullable = true from not(false or (false and true)) = true
: GameAdState

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gameAdState
}


                @Throws(Exception::class)
            
open fun getInstance(softwareInformation: SoftwareInformation)
        //nullable =  from not(true or (false and false)) = 
: GameAdState

        Updates for KMP build        
        {
    //var softwareInformation = softwareInformation
this.gameAdState= gameAdStateArray[0]!!



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameAdStateArray[0]!!
}


open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

