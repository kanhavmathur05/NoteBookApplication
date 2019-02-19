package com.example.admin.notebookapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteListAdapterViewHolder> {

    private List<Notes> notesList;
    public NoteListAdapter(List<Notes> notesList)
    {
        this.notesList=notesList;
    }

    @NonNull
    @Override
    public NoteListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new NoteListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteListAdapterViewHolder noteListAdapterViewHolder, int i) {
        String title=notesList.get(i).getTitle();
        String noteDescription=notesList.get(i).getNoteDescription();
        noteListAdapterViewHolder.title.setText(title);
        noteListAdapterViewHolder.noteDescription.setText(noteDescription);
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class NoteListAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView title,noteDescription;

        public NoteListAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            noteDescription=itemView.findViewById(R.id.noteDescription);
        }
    }

}
