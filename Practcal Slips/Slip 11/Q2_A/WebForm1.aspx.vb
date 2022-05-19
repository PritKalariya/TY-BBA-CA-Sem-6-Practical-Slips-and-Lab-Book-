Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text = "" Then
            MsgBox("Please enter a name.")
        ElseIf RadioButtonList1.Items(1).Selected() = True Or RadioButtonList1.Items(2).Selected() = True Then
            MsgBox("Please select a credit card type.")
        ElseIf TextBox3.Text.Length <> 16 Then
            MsgBox("Please enter a valid credit card number.")
        Else
            MsgBox("Thank you for your purchase.")
        End If


    End Sub
End Class