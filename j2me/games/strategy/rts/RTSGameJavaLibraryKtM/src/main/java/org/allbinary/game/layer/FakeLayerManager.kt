
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class FakeLayerManager : AllBinaryGameLayerManager
                , GeographicMapCompositeInterface {
        

    private var geographicMapInterfaceArray: Array<BasicGeographicMap?>

    private var geographicMapCellTypeArray: Array<GeographicMapCellType?>
public constructor (gameInfo: GameInfo)                        

                            : super(BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE, gameInfo){
var gameInfo = gameInfo


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getGeographicMapInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<BasicGeographicMap?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapInterfaceArray
}


    open fun setGeographicMapInterface(geographicMapInterfaceArray: Array<BasicGeographicMap?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
this.geographicMapInterfaceArray= geographicMapInterfaceArray
this.geographicMapCellTypeArray= arrayOfNulls(this.geographicMapInterfaceArray!!.size)
}


    open fun geographicMapCellTypeArray()
        //nullable = true from not(false or (false and true)) = true
: Array<GeographicMapCellType?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.geographicMapCellTypeArray
}


}
                
            

