package com.example.admin.notebookapplication;

class Notes {

    public Notes(int noteID,String title,String noteDescription)
    {
        this.noteID=noteID;
        this.title=title;
        this.noteDescription=noteDescription;
    }
    private int noteID;
    private String title;
    private String noteDescription;

    public int getNoteID() {
        return noteID;
    }


    public String getTitle() {
        return title;
    }


    public String getNoteDescription() {
        return noteDescription;
    }

}
