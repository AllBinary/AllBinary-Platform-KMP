
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
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class HighScores
            : Object
        
                , HighScoresInterface {
        

    private var orderedHighScoresList: BasicArrayList = BasicArrayList()

    private val name: String

    private val heading: String

    private val columnOneHeading: String = "Name"

    private val columnTwoHeading: String
public constructor        (name: String, heading: String, columnTwoHeading: String)
            : super()
        {

                    var name = name


                    var heading = heading


                    var columnTwoHeading = columnTwoHeading
this.name= name
this.heading= heading
this.columnTwoHeading= columnTwoHeading
}


open fun setList(orderedHighScoresList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var orderedHighScoresList = orderedHighScoresList
this.orderedHighScoresList= orderedHighScoresList
}

override fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderedHighScoresList
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}

override fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getList()!!.size()
}

override fun addHighScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
{

                    var newHighScore = newHighScore
this.orderedHighScoresList!!.add(newHighScore)
}


open fun getHeading()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return heading
}


open fun getColumnOneHeading()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columnOneHeading
}


open fun getColumnTwoHeading()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columnTwoHeading
}


                @Throws(Exception::class)
            override fun isBestScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var newHighScore = newHighScore



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("HighScores: ")
stringBuffer!!.append(this.heading)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.TOTAL_LABEL)
stringBuffer!!.append(this.orderedHighScoresList!!.size())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

