
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
        
import java.io.ByteArrayInputStream
import java.io.DataInputStream
import java.io.EOFException
import java.io.IOException
import javax.microedition.rms.RecordComparator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ScoreComparator
            : Object
        
                , RecordComparator {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val isHighestBest: Boolean
public constructor        (isHighestBest: Boolean)
            : super()
        {

                    var isHighestBest = isHighestBest
this.isHighestBest= isHighestBest
}


open fun getBestScore()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if(this.isHighestBest) {
                            
                            Long.MAX_VALUE
                        
                            } else {
                            0
                            }
    
}

override fun compare(recordOne: ByteArray, recordTwo: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var recordOne = recordOne


                    var recordTwo = recordTwo

    var byteArrayInputStreamOne: ByteArrayInputStream = ByteArrayInputStream(recordOne)


    var inputStreamOne: DataInputStream = DataInputStream(byteArrayInputStreamOne)


    var byteArrayInputStreamTwo: ByteArrayInputStream = ByteArrayInputStream(recordTwo)


    var inputStreamTwo: DataInputStream = DataInputStream(byteArrayInputStreamTwo)


    var scoreOne: Long = 0


    var scoreTwo: Long = 0


        try {
            inputStreamOne!!.readUTF()
inputStreamTwo!!.readUTF()
scoreOne= inputStreamOne!!.readLong()
scoreTwo= inputStreamTwo!!.readLong()
} catch(e: EOFException)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "compare", e)
}
 catch(e: IOException)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "compare", e)
}
 catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "compare", e)
}


    
                        if(this.isHighestBest)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getHighTooLow(scoreOne, scoreTwo)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getLowTooHigh(scoreOne, scoreTwo)

                        }
                            
}


open fun getHighTooLow(scoreOne: Long, scoreTwo: Long)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var scoreOne = scoreOne


                    var scoreTwo = scoreTwo

    
                        if(scoreOne > scoreTwo)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.PRECEDES

                                    }
                                
                             else 
    
                        if(scoreOne < scoreTwo)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.FOLLOWS

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.EQUIVALENT

                        }
                            
}


open fun getLowTooHigh(scoreOne: Long, scoreTwo: Long)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var scoreOne = scoreOne


                    var scoreTwo = scoreTwo

    
                        if(scoreOne < scoreTwo)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.PRECEDES

                                    }
                                
                             else 
    
                        if(scoreOne > scoreTwo)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.FOLLOWS

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RecordComparator.EQUIVALENT

                        }
                            
}


}
                
            

