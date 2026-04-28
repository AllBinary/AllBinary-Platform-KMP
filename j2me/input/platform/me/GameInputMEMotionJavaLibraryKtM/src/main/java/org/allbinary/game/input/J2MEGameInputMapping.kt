
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
        
import org.allbinary.game.configuration.persistance.GamePersistanceStrings
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class J2MEGameInputMapping : PersistentInputMapping {
        
public constructor ()                        

                            : super(GamePersistanceStrings.getInstance()!!.SAVED_INPUT_CONFIGURATION_RECORD_ID){


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
this.logUtil!!.putF(commonStrings!!.START, this, commonStrings!!.INIT)
J2MEKeyFactory.getInstance()!!.init()
super.init(abeClientInformation)

    
                        if(this.getTotalMapped() == 0 || this.isDefaultNew())
                        
                                    {
                                    this.getInputMapping()!!.addMapping(this.getDefault())
this.save(abeClientInformation)

                                    }
                                
}


    override fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == GameKeyFactory.getInstance()!!.GAME_D)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    override fun isSystemInput(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

