
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
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class TimeIntervalActionScriptConditionJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface
public constructor (timeIntervalActionScriptConditionInterface: TimeIntervalActionScriptConditionInterface){
var timeIntervalActionScriptConditionInterface = timeIntervalActionScriptConditionInterface
this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.initComponents()
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
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeIntervalJTextField
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
                        return this.timeIntervalActionJDialog
}


    open fun setTimeIntervalActionJDialog(timeIntervalActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var timeIntervalActionJDialog = timeIntervalActionJDialog
this.timeIntervalActionJDialog= timeIntervalActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.timeIntervalActionJDialog= JDialog()
this.titleJLabel= JLabel()
this.okJButton= JButton()
this.jLabel2= JLabel()
this.timeIntervalJTextField= JTextField()
this.timeIntervalActionJButton= JButton()
this.jLabel1= JLabel()
this.timeIntervalActionJDialog!!.setMinimumSize(Dimension(250, 150))
this.titleJLabel!!.setText("Time Interval Condition Options")
this.okJButton!!.setText("OK")
this.okJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Time (ms):")

    var timeIntervalActionJDialogLayout: GroupLayout = GroupLayout(this.timeIntervalActionJDialog!!.getContentPane())

this.timeIntervalActionJDialog!!.getContentPane()!!.setLayout(timeIntervalActionJDialogLayout)
timeIntervalActionJDialogLayout!!.setHorizontalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addGroup(GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(82, 82, 82)!!.addComponent(okJButton))!!.addGroup(GroupLayout.Alignment.LEADING, timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addGap(32, 32, 32)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addGap(16, 16, 16)!!.addComponent(timeIntervalJTextField, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))!!.addComponent(titleJLabel))))!!.addContainerGap(36, Short.MAX_VALUE)))
timeIntervalActionJDialogLayout!!.setVerticalGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(timeIntervalActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addGap(20, 20, 20)!!.addGroup(timeIntervalActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(timeIntervalJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addGap(15, 15, 15)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(Dimension(100, 0))
this.timeIntervalActionJButton!!.setText("Edit")
this.timeIntervalActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
timeIntervalActionJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Time Interval:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(timeIntervalActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(timeIntervalActionJButton)))
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
                
            

