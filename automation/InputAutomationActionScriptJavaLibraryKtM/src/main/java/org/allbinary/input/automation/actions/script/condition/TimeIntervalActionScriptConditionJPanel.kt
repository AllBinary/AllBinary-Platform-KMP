
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TimeIntervalActionScriptConditionJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface
public constructor (timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface){
var timeIntervalActionScriptConditionInterface = timeIntervalActionScriptConditionInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.timeIntervalActionScriptConditionInterface= timeIntervalActionScriptConditionInterface
this.set()
}


    open fun set()
        //nullable = true from not(false or (false and true)) = true
{
this.getTimeIntervalJTextField()!!.setText(this.timeIntervalActionScriptConditionInterface!!.getTimeDelayHelper()!!.delay.toString())
this.timeIntervalActionScriptConditionInterface!!.log()
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
this.timeIntervalActionScriptConditionInterface!!.getTimeDelayHelper()!!.delay= Integer(Integer.valueOf(this.getTimeIntervalJTextField()!!.getText()))
this.timeIntervalActionScriptConditionInterface!!.log()
}


    open fun getTimeIntervalJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeIntervalJTextField
}


    open fun setTimeIntervalJTextField(timeIntervalJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var timeIntervalJTextField = timeIntervalJTextField
this.timeIntervalJTextField= timeIntervalJTextField
}


    open fun getTimeIntervalActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JDialog{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeIntervalActionJDialog
}


    open fun setTimeIntervalActionJDialog(timeIntervalActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var timeIntervalActionJDialog = timeIntervalActionJDialog
this.timeIntervalActionJDialog= timeIntervalActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
timeIntervalActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
okJButton= javax.swing.JButton()
jLabel2= javax.swing.JLabel()
timeIntervalJTextField= javax.swing.JTextField()
timeIntervalActionJButton= javax.swing.JButton()
jLabel1= javax.swing.JLabel()
timeIntervalActionJDialog!!.setMinimumSize(java.awt.Dimension(250, 150))
titleJLabel!!.setText("Time Interval Condition Options")
okJButton!!.setText("OK")
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText("Time (ms):")

    var timeIntervalActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(timeIntervalActionJDialog!!.getContentPane())

timeIntervalActionJDialog!!.getContentPane()!!.setLayout(timeIntervalActionJDialogLayout)
timeIntervalActionJDialogLayout!!.setHorizontalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(82, 82, 82)!!.addComponent(okJButton))!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(32, 32, 32)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addGap(16, 16, 16)!!.addComponent(timeIntervalJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))!!.addComponent(titleJLabel))))!!.addContainerGap(36, Short.MAX_VALUE)))
timeIntervalActionJDialogLayout!!.setVerticalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addGap(20, 20, 20)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(timeIntervalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGap(15, 15, 15)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(java.awt.Dimension(100, 0))
timeIntervalActionJButton!!.setText("Edit")
timeIntervalActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
timeIntervalActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText("Time Interval:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(timeIntervalActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(timeIntervalActionJButton)))
}


    open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.update()
this.getTimeIntervalActionJDialog()!!.setVisible(false)
}


    open fun timeIntervalActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getTimeIntervalActionJDialog()!!.setVisible(true)
}


    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var okJButton: javax.swing.JButton

    private var timeIntervalActionJButton: javax.swing.JButton

    private var timeIntervalActionJDialog: javax.swing.JDialog

    private var timeIntervalJTextField: javax.swing.JTextField

    private var titleJLabel: javax.swing.JLabel

}
                
            

