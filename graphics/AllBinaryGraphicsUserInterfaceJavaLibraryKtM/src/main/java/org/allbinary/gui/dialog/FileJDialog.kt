
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
        package org.allbinary.gui.dialog



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import org.allbinary.logic.communication.log.LogUtil

open public class FileJDialog : swing.JDialog {
        

        companion object {


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args
java!!.awt!!.EventQueue.invokeLater(object: Runnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{FileJDialog(JFrame(), true).
                            setVisible(true)
}

                                }
                            )
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var finishedListenerInterface: FileJDialogListenerInterface
public constructor        ()                        

                            : super(){

                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.getJFileChooser1()!!.setMultiSelectionEnabled(true)
}

public constructor        (parent: Frame, modal: Boolean)                        

                            : super(parent, modal){

                    var parent = parent


                    var modal = modal


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.getJFileChooser1()!!.setMultiSelectionEnabled(true)
}


open fun addFinishedListener(finishedListenerInterface: FileJDialogListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var finishedListenerInterface = finishedListenerInterface
this.finishedListenerInterface= finishedListenerInterface
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{jFileChooser1= JFileChooser()
setDefaultCloseOperation(javax!!.swing!!.WindowConstants.DISPOSE_ON_CLOSE)
jFileChooser1!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
jFileChooser1ActionPerformed(evt)
}

                                }
                            )

    var layout: GroupLayout = GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, layout!!.createSequentialGroup()!!.addContainerGap(org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(jFileChooser1, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap()))
layout!!.setVerticalGroup(layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(layout!!.createSequentialGroup()!!.addContainerGap()!!.add(jFileChooser1, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, 357, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
pack()
}


open fun jFileChooser1ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
logUtil!!.put("Starting Action Command: " +evt!!.getActionCommand(), this, 
                            "ActionPerformed")

    var files: Array<File?> = this.getJFileChooser1()!!.getSelectedFiles()!!
            


    
                        if(evt!!.getActionCommand() == this.getJFileChooser1()!!.CANCEL_SELECTION)
                        
                                    {
                                    this.setVisible(false)

                                    }
                                

    
                        if(evt!!.getActionCommand() == this.getJFileChooser1()!!.APPROVE_SELECTION)
                        
                                    {
                                    
    
                        if(files != 
                                    null
                                 && files!!.size > 0)
                        
                                    {
                                    this.finishedListenerInterface!!.onFiles(files)

                                    }
                                

                                    }
                                
}


open fun getJFileChooser1()
        //nullable = true from not(false or (false and true)) = true
: JFileChooser{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jFileChooser1
}


open fun setJFileChooser1(jFileChooser1: JFileChooser)
        //nullable = true from not(false or (false and false)) = true
{

                    var jFileChooser1 = jFileChooser1
this.jFileChooser1= jFileChooser1
}


    private var jFileChooser1: JFileChooser

}
                
            

