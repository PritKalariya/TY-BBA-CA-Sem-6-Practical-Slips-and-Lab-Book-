Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Timer1.Start()
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        If Label1.Left > Me.Width Then
            Label1.Left = -100
        Else
            Label1.Left = Label1.Left + 10
        End If
    End Sub
End Class
