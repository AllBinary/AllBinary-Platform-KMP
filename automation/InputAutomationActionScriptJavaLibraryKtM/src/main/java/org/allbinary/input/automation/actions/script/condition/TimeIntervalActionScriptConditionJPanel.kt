
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
        package org.allbinary.input.automation.actions.script.condition



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TimeIntervalActionScriptConditionJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface
public constructor        (timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface){

                    var timeIntervalActionScriptConditionInterface = timeIntervalActionScriptConditionInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.timeIntervalActionScriptConditionInterface= timeIntervalActionScriptConditionInterface
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{this.getTimeIntervalJTextField()!!.setText(delay.toString())
this.timeIntervalActionScriptConditionInterface!!.log()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.timeIntervalActionScriptConditionInterface!!.getTimeDelayHelper()!!.delay= getText.concatToString()

                                
this.timeIntervalActionScriptConditionInterface!!.log()
}


open fun getTimeIntervalJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeIntervalJTextField
}


open fun setTimeIntervalJTextField(timeIntervalJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var timeIntervalJTextField = timeIntervalJTextField
this.timeIntervalJTextField= timeIntervalJTextField
}


open fun getTimeIntervalActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: JDialog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeIntervalActionJDialog
}


open fun setTimeIntervalActionJDialog(timeIntervalActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{

                    var timeIntervalActionJDialog = timeIntervalActionJDialog
this.timeIntervalActionJDialog= timeIntervalActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{timeIntervalActionJDialog= JDialog()
titleJLabel= JLabel()
okJButton= JButton()
jLabel2= JLabel()
timeIntervalJTextField= JTextField()
timeIntervalActionJButton= JButton()
jLabel1= JLabel()
timeIntervalActionJDialog!!.setMinimumSize(Dimension(250, 150))
titleJLabel!!.setText(
                            "Time Interval Condition Options")
okJButton!!.setText(
                            "OK")
okJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText(
                            "Time (ms):")

    var timeIntervalActionJDialogLayout: GroupLayout = GroupLayout(timeIntervalActionJDialog!!.getContentPane())

timeIntervalActionJDialog!!.getContentPane()!!.setLayout(timeIntervalActionJDialogLayout)
timeIntervalActionJDialogLayout!!.setHorizontalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(82, 82, 82)!!.addComponent(okJButton))!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(32, 32, 32)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addGap(16, 16, 16)!!.addComponent(timeIntervalJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))!!.addComponent(titleJLabel))))!!.addContainerGap(36, Short.MAX_VALUE)))
timeIntervalActionJDialogLayout!!.setVerticalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addGap(20, 20, 20)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(timeIntervalJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addGap(15, 15, 15)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(Dimension(100, 0))
timeIntervalActionJButton!!.setText(
                            "Edit")
timeIntervalActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
timeIntervalActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText(
                            "Time Interval:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(timeIntervalActionJButton)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(timeIntervalActionJButton)))
}


open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.update()
this.getTimeIntervalActionJDialog()!!.setVisible(false)
}


open fun timeIntervalActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.getTimeIntervalActionJDialog()!!.setVisible(true)
}


    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var okJButton: JButton

    private var timeIntervalActionJButton: JButton

    private var timeIntervalActionJDialog: JDialog

    private var timeIntervalJTextField: JTextField

    private var titleJLabel: JLabel

}
                
            

