
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
        package org.allbinary.media.graphics.geography.map.racetrack



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor

open public class RaceTrackInfo
            : Object
         {
        

    private var id: Integer

    private var name: String

    private var raceTrackFrictionProperties: RaceTrackFrictionProperties

    private var foregroundBasicColor: BasicColor

    private var backgroundBasicColor: BasicColor

    private var qualifyTime: Int= 0

    private var worstContinuePosition: Int= 0

    private var totalLaps: Int= 0
public constructor        (id: Integer, name: String, raceTrackFrictionProperties: RaceTrackFrictionProperties, foregroundBasicColor: BasicColor, backgroundBasicColor: BasicColor, qualifyTime: Int, worstContinuePosition: Int, totalLaps: Int)
            : super()
        {

                    var id = id


                    var name = name


                    var raceTrackFrictionProperties = raceTrackFrictionProperties


                    var foregroundBasicColor = foregroundBasicColor


                    var backgroundBasicColor = backgroundBasicColor


                    var qualifyTime = qualifyTime


                    var worstContinuePosition = worstContinuePosition


                    var totalLaps = totalLaps
this.setId(id)
this.setName(name)
this.setRaceTrackFrictionProperties(raceTrackFrictionProperties)
this.setBackgroundBasicColor(backgroundBasicColor)
this.setForegroundBasicColor(foregroundBasicColor)
this.setQualifyTime(qualifyTime)
this.setWorstContinuePosition(worstContinuePosition)
this.setTotalLaps(totalLaps)
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


open fun setId(id: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id
this.id= id
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun getQualifyTime()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return qualifyTime
}


open fun setQualifyTime(qualifyTime: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var qualifyTime = qualifyTime
this.qualifyTime= qualifyTime
}


open fun getWorstContinuePosition()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return worstContinuePosition
}


open fun setWorstContinuePosition(worstContinuePosition: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var worstContinuePosition = worstContinuePosition
this.worstContinuePosition= worstContinuePosition
}


open fun getTotalLaps()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalLaps
}


open fun setTotalLaps(totalLaps: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var totalLaps = totalLaps
this.totalLaps= totalLaps
}


open fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return foregroundBasicColor
}


open fun setForegroundBasicColor(foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var foregroundBasicColor = foregroundBasicColor
this.foregroundBasicColor= foregroundBasicColor
}


open fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return backgroundBasicColor
}


open fun setBackgroundBasicColor(backgroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var backgroundBasicColor = backgroundBasicColor
this.backgroundBasicColor= backgroundBasicColor
}


open fun getRaceTrackFrictionProperties()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackFrictionProperties{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return raceTrackFrictionProperties
}


open fun setRaceTrackFrictionProperties(raceTrackFrictionProperties: RaceTrackFrictionProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var raceTrackFrictionProperties = raceTrackFrictionProperties
this.raceTrackFrictionProperties= raceTrackFrictionProperties
}


}
                
            

