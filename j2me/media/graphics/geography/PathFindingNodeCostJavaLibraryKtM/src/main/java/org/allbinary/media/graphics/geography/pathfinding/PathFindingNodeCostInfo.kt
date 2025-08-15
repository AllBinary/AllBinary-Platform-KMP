
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2006 AllBinary
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels

open public class PathFindingNodeCostInfo
            : Object
        
                , Comparable<PathFindingNodeCostInfo> {
        

    private val pathFindingNodeCostInfoData: PathFindingNodeCostInfoData = PathFindingNodeCostInfoData.getInstance()!!
            

    var costFromStart: Long

    var costToEnd: Long

    var totalCost: Long= 0
public constructor        (costFromStart: Long, costToGoal: Long)
            : super()
        {

                    var costFromStart = costFromStart


                    var costToGoal = costToGoal
this.costFromStart= costFromStart
this.costToEnd= costToGoal
this.setTotalCost()
}


open fun setCostToEnd(costToEnd: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var costToEnd = costToEnd
this.costToEnd= costToEnd
}


open fun setTotalCost(totalCost: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var totalCost = totalCost
this.totalCost= totalCost
}


                @Throws(Exception::class)
            
open fun setTotalCost()
        //nullable = true from not(false or (false and true)) = true
{this.totalCost= costFromStart +costToEnd

    
                        if(this.totalCost > pathFindingNodeCostInfoData!!.MAX_NODE_COST)
                        
                                    {
                                    


                            throw Exception("Max Cost Exceeded")

                                    }
                                
}


open fun setCostFromStart(cost: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var cost = cost
this.costFromStart= cost
}


open fun addCostFromStart(cost: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var cost = cost
this.costFromStart += cost
}

override fun compareTo(pathFindingNodeCostInfo: PathFindingNodeCostInfo)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var pathFindingNodeCostInfo = pathFindingNodeCostInfo



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Long.compare(this.totalCost, pathFindingNodeCostInfo!!.totalCost)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.qualifiedName!!)
stringBuffer!!.append(CommonLabels.getInstance()!!.COLON_SEP)
stringBuffer!!.append("CostFromStart: ")
stringBuffer!!.append(this.costFromStart)
stringBuffer!!.append(" CostToEnd: ")
stringBuffer!!.append(this.costToEnd)
stringBuffer!!.append(" TotalCost: ")
stringBuffer!!.append(this.totalCost)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

