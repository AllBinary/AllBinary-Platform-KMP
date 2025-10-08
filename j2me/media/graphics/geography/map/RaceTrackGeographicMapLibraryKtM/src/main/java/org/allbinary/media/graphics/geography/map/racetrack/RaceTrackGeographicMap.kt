
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionBaseFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInterface
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory

open public class RaceTrackGeographicMap : BaseRaceTrackGeographicMap {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val customMapGenerator: CustomMapGeneratorBase
public constructor (raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData, tiledLayerFactoryInterface: AllBinaryTiledLayerFactoryInterface, geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface, geographicMapCellPositionBaseFactory: GeographicMapCellPositionBaseFactory, geographicMapCellTypeFactory: GeographicMapCellTypeFactory, customMapGeneratorBaseFactory: CustomMapGeneratorBaseFactory)                        

                            : super(raceTrackInfo, raceTrackData, tiledLayerFactoryInterface!!.getInstance(raceTrackInfo, raceTrackData), BasicGeographicMapFactory().
                            getInstance(raceTrackInfo, raceTrackData, tiledLayerFactoryInterface, geographicMapCellPositionFactoryInterface, geographicMapCellTypeFactory), geographicMapCellPositionFactoryInterface, geographicMapCellPositionBaseFactory, geographicMapCellTypeFactory){
    //var raceTrackInfo = raceTrackInfo
    //var raceTrackData = raceTrackData
    //var tiledLayerFactoryInterface = tiledLayerFactoryInterface
    //var geographicMapCellPositionFactoryInterface = geographicMapCellPositionFactoryInterface
    //var geographicMapCellPositionBaseFactory = geographicMapCellPositionBaseFactory
    //var geographicMapCellTypeFactory = geographicMapCellTypeFactory
    //var customMapGeneratorBaseFactory = customMapGeneratorBaseFactory


                            //For kotlin this is before the body of the constructor.
                    
this.customMapGenerator= customMapGeneratorBaseFactory!!.getInstance(this)
}

public constructor (raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData, tiledLayerFactoryInterface: AllBinaryTiledLayerFactoryInterface, geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface, geographicMapCellTypeFactory: GeographicMapCellTypeFactory, customMapGeneratorBaseFactory: CustomMapGeneratorBaseFactory)                        

                            : this(raceTrackInfo, raceTrackData, tiledLayerFactoryInterface, geographicMapCellPositionFactoryInterface, GeographicMapCellPositionBaseFactory(), geographicMapCellTypeFactory, customMapGeneratorBaseFactory){
    //var raceTrackInfo = raceTrackInfo
    //var raceTrackData = raceTrackData
    //var tiledLayerFactoryInterface = tiledLayerFactoryInterface
    //var geographicMapCellPositionFactoryInterface = geographicMapCellPositionFactoryInterface
    //var geographicMapCellTypeFactory = geographicMapCellTypeFactory
    //var customMapGeneratorBaseFactory = customMapGeneratorBaseFactory


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getCustomMapGenerator()
        //nullable = true from not(false or (false and true)) = true
: CustomMapGeneratorBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customMapGenerator
}


                @Throws(Exception::class)
            
    open fun isValid(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var geographicMapCellPosition = geographicMapCellPosition

    
                        if(geographicMapCellPosition!!.getColumn() >= this.customMapGenerator!!.getCustomMapArray()[0]!!.length)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Column: ")
stringBuffer!!.append(geographicMapCellPosition!!.getColumn())
stringBuffer!!.append(" not in: ")
stringBuffer!!.append(this.customMapGenerator!!.getCustomMapArray()[0]!!.length)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

    
                        if(geographicMapCellPosition!!.getColumn() == this.customMapGenerator!!.getCustomMapArray()[0]!!.length)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                             else 
    
                        if(geographicMapCellPosition!!.getRow() > this.customMapGenerator!!.getCustomMapArray()!!.length)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Row: ")
stringBuffer!!.append(geographicMapCellPosition!!.getRow())
stringBuffer!!.append(" not in: ")
stringBuffer!!.append(this.customMapGenerator!!.getCustomMapArray()!!.length)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

    
                        if(geographicMapCellPosition!!.getRow() == this.customMapGenerator!!.getCustomMapArray()!!.length)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

