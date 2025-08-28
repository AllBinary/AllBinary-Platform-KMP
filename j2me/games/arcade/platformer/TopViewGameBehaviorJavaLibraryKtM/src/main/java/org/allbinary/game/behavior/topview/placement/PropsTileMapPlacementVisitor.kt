
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.behavior.topview.placement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.mapeditor.core.TileLayer
import org.mapeditor.core.TiledMap

open public class PropsTileMapPlacementVisitor : TileMapPlacementVisitor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val randomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!

open fun visit(lastMap: TiledMap, mapData: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var lastMap = lastMap
    //var mapData = mapData

    var layerIndex: Int = 0


    var tileLayer: TileLayer = (lastMap!!.getLayer(layerIndex) as TileLayer)


    var mapArray: Array<IntArray?> = tileLayer!!.getMapArray()!!


    var size: Int = mapData!!.size
                


    var size2: Int = mapData[0]!!.size
                





                        for (index in 0 until size)

        {




                        for (index2 in 0 until size2)

        {

    
                        if(mapArray[index]!![index2] == 14)
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.visit2(mapArray, mapData, index, index2)

                        }
                            

    
                        if(index % 7 == 0)
                        
                                    {
                                    
    
                        if(mapArray[index]!![index2] == 19)
                        
                                    {
                                    
    var randomInt: Int = randomFactory!!.getAbsoluteNextIntAllowZero(3)!!


    
                        if(randomInt == 0)
                        
                                    {
                                    mapData[index]!![index2]= 1

                                    }
                                
                             else 
    
                        if(randomInt == 1)
                        
                                    {
                                    mapData[index]!![index2]= 81

                                    }
                                
                             else 
    
                        if(randomInt == 2)
                        
                                    {
                                    mapData[index]!![index2]= 97

                                    }
                                

                                    }
                                
                             else 
    
                        if(mapArray[index]!![index2] == 17)
                        
                                    {
                                    
    var randomInt: Int = randomFactory!!.getAbsoluteNextIntAllowZero(3)!!


    
                        if(randomInt == 0)
                        
                                    {
                                    mapData[index]!![index2]= 17

                                    }
                                
                             else 
    
                        if(randomInt == 1)
                        
                                    {
                                    mapData[index]!![index2]= 81

                                    }
                                
                             else 
    
                        if(randomInt == 2)
                        
                                    {
                                    mapData[index]!![index2]= 97

                                    }
                                

                                    }
                                

                                    }
                                

    
                        if(index2 % 7 == 0)
                        
                                    {
                                    
    
                        if(mapArray[index]!![index2] == 34)
                        
                                    {
                                    
    var randomInt: Int = randomFactory!!.getAbsoluteNextIntAllowZero(4)!!


    
                        if(randomInt == 0)
                        
                                    {
                                    mapData[index]!![index2]= 33

                                    }
                                
                             else 
    
                        if(randomInt == 1)
                        
                                    {
                                    mapData[index]!![index2]= 65

                                    }
                                
                             else 
    
                        if(randomInt == 2)
                        
                                    {
                                    mapData[index]!![index2]= 81

                                    }
                                
                             else 
    
                        if(randomInt == 3)
                        
                                    {
                                    mapData[index]!![index2]= 97

                                    }
                                

                                    }
                                

                                    }
                                
}

}

}


open fun visit2(mapArray: Array<IntArray?>, mapData: Array<IntArray?>, index: Int, index2: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var mapArray = mapArray
    //var mapData = mapData
    //var index = index
    //var index2 = index2

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var countX: Int = 0


    var countY: Int = 0


    var index3: Int = index -1





                        for (index4 in index2 -1 downTo 0)

        {
index3--

    
                        if(index3 < 0 || index4 < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(mapArray[index3]!![index4] != 14 || mapData[index3]!![index4] != 0)
                        
                                    {
                                    
    
                        if(countX > 10 && countY > 10)
                        
                                    {
                                    



                        for (index5 in index3 +1 until index -1)

        {




                        for (index6 in index4 +1 until index2 -1)

        {

    
                        if(mapArray[index5]!![index6] != 14 || mapData[index5]!![index6] != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
}

}


    var x: Int = index -(countX /2)


    var y: Int = index2 -(countY /2)


    
                        if(x >= 0 && y >= 0 && x < mapData!!.size && y < mapData[0]!!.length)
                        
                                    {
                                    
                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
countY++
countX++
}

}


}
                
            

