Imports System.Data.OleDb

Public Class Form1
    Dim con As OleDbConnection
    Dim cmd As OleDbCommand
    Dim updtQuery As String
    Dim result As Integer

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        con = New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=E:\TY-BBA-CA-Sem-6-Practical-Slips-And-Lab-Book-\Practcal Slips\VB Database\Practical Slips.accdb")
        con.Open()

        updtQuery = "update slip4 set Salary=(Salary+Salary*0.15) where EmpName='" & (TextBox1.Text) & "'"
        cmd = New OleDbCommand(updtQuery, con)
        result = cmd.ExecuteNonQuery()

        MessageBox.Show(result & " Salary Updated")
        con.Close()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        con = New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=E:\TY-BBA-CA-Sem-6-Practical-Slips-And-Lab-Book-\Practcal Slips\VB Database\Practical Slips.accdb")
        con.Open()

        updtQuery = "delete from slip4 where EmpName='" & (TextBox2.Text) & "'"
        cmd = New OleDbCommand(updtQuery, con)
        result = cmd.ExecuteNonQuery()

        MessageBox.Show(result & " Row Deleted")
        con.Close()
    End Sub
End Class
