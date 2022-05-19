Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If RadioButtonList1.Items(0).Selected() = True Then
            Label1.Text = RadioButtonList1.Items(0).Text

        ElseIf RadioButtonList1.Items(1).Selected() = True Then
            Label1.Text = RadioButtonList1.Items(1).Text

        ElseIf RadioButtonList1.Items(2).Selected() = True Then
            Label1.Text = RadioButtonList1.Items(2).Text

        Else
            Label1.Text = "Please select an option"
        End If
    End Sub
End Class