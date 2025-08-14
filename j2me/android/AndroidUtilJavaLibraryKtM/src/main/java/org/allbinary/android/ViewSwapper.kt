
        /* Generated Code Do Not Modify */
        package org.allbinary.android




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.view.View
import android.view.ViewGroup

open public class ViewSwapper
            : Object
         {
        

        companion object {
            
    private val NULL_VIEW_ARRAY: Array<View?> = arrayOfNulls(0)

        }
            
    private val rootViewId: Int

    private val activity: Activity

    private var currentMainViewId: Int =  -1

    private var mainViewArray: Array<View?> = NULL_VIEW_ARRAY

    private var topViewArray: Array<View?> = NULL_VIEW_ARRAY
public constructor        (activity: Activity, rootViewId: Int)
            : super()
        {

                    var activity = activity


                    var rootViewId = rootViewId
this.activity= activity
this.rootViewId= rootViewId
}


open fun setMainViews(viewArray: Array<View?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var viewArray = viewArray
this.mainViewArray= viewArray
}


open fun setTopViewArray(topViewArray: Array<View?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var topViewArray = topViewArray
this.topViewArray= topViewArray
}


open fun setMainView(id: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id

    var viewGroup: ViewGroup = this.activity.findViewById(rootViewId) as ViewGroup


    
                        if(id != this.currentMainViewId)
                        
                                    {
                                    



                        for (index in 0 until this.topViewArray!!.size)


        {viewGroup!!.removeView(this.topViewArray[index]!!)
}





                        for (index in 0 until this.mainViewArray!!.size)


        {
    
                        if(id != this.mainViewArray[index]!!.getId())
                        
                                    {
                                    viewGroup!!.removeView(this.mainViewArray[index]!!)

                                    }
                                
}





                        for (index in 0 until this.mainViewArray!!.size)


        {
    
                        if(id == this.mainViewArray[index]!!.getId())
                        
                                    {
                                    viewGroup!!.addView(this.mainViewArray[index]!!)
this.currentMainViewId= id

                                    }
                                
}





                        for (index in 0 until this.topViewArray!!.size)


        {viewGroup!!.addView(this.topViewArray[index]!!)
}


                                    }
                                
}


}
                
            

