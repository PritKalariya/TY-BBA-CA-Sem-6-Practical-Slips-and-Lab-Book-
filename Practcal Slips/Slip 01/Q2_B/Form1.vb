Imports System.Data.OleDb

Public Class Form1

    Dim con As New OleDbConnection
    Dim cmd As New OleDbCommand
    Dim ds As New DataSet
    Dim adp As New OleDbDataAdapter
    Dim str As String
    Dim cin As Integer

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        con = New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=E:\TY-BBA-CA-Sem-6-Practical-Slips-And-Lab-Book-\Practcal Slips\VB Database\Practical Slips.accdb")
        con.Open()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        str = "Insert into Employee values(" & CInt(TextBox1.Text) & " , '" & (TextBox2.Text) & "', " & CInt(TextBox3.Text) & " )"
        cmd = New OleDbCommand(str, con)

        cin = cmd.ExecuteNonQuery()
        MessageBox.Show(cin & " Row inserted.")
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        adp = New OleDbDataAdapter("Select * from Employee", con)
        adp.Fill(ds, "Practical Slips")

        DataGridView1.DataSource = ds
        DataGridView1.DataMember = "Practical Slips"
    End Sub
End Class
