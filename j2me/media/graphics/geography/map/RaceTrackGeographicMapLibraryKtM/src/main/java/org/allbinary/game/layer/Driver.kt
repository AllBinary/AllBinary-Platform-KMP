
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Driver
            : Object
         {
        

    private var turnSpeed: Integer

    private var trackPathSelectionSkill: Integer

    private var aggression: Aggression
public constructor        (turnSpeed: Integer, trackPathSelectionSkill: Integer, aggression: Aggression)
            : super()
        {

                    var turnSpeed = turnSpeed


                    var trackPathSelectionSkill = trackPathSelectionSkill


                    var aggression = aggression
this.setTurnSpeed(turnSpeed)
this.setTrackPathSelectionSkill(trackPathSelectionSkill)
this.setAggression(aggression)
}


open fun getTurnSpeed()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return turnSpeed
}


open fun setTurnSpeed(turnSpeed: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var turnSpeed = turnSpeed
this.turnSpeed= turnSpeed
}


open fun getTrackPathSelectionSkill()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return trackPathSelectionSkill
}


open fun setTrackPathSelectionSkill(trackPathSelectionSkill: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var trackPathSelectionSkill = trackPathSelectionSkill
this.trackPathSelectionSkill= trackPathSelectionSkill
}


open fun getAggression()
        //nullable = true from not(false or (false and true)) = true
: Aggression{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aggression
}


open fun setAggression(aggression: Aggression)
        //nullable = true from not(false or (false and false)) = true
{

                    var aggression = aggression
this.aggression= aggression
}


}
                
            

