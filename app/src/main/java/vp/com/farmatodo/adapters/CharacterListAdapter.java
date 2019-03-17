package vp.com.farmatodo.adapters;

import android.content.Context;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;
import vp.com.farmatodo.PaletteTransformation;
import vp.com.farmatodo.R;
import vp.com.farmatodo.model.character.Character;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterViewHolder>{

    Context mContext;
    List<Character> mCharacterList;
    ComicListAdapter.OnComicItemClickListener mListener;

    public CharacterListAdapter(Context context, List<Character> characters, ComicListAdapter.OnComicItemClickListener listener) {
        mContext = context;
        mCharacterList = characters;
        mListener = listener;
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.characters_adapter_layout,null);
        CharacterViewHolder viewHolder = new CharacterViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, int position) {
        Character character = mCharacterList.get(position);
        holder.characterName.setText(character.getName());
        if(character.getThumbnail()!=null) {
            String url = character.getThumbnail().getPath() + "/standard_amazing." + character.getThumbnail().getExtension();
            PaletteTransformation paletteTransformation = new PaletteTransformation();
            Picasso.with(mContext).load(url).
                    transform(paletteTransformation).
                    into(holder.characterImage, new Callback.EmptyCallback() {
                        @Override
                        public void onSuccess() {
                            super.onSuccess();
                            Palette palette = paletteTransformation.getPalette();
                            if (palette != null) {
                                Palette.Swatch swatch = palette.getVibrantSwatch();
                                holder.characterName.setBackgroundColor(palette.getVibrantColor(0));
                                if (swatch != null)
                                    holder.characterName.setTextColor(swatch.getTitleTextColor());
                            }
                        }
                    });

        ((ViewGroup)holder.characterImage.getParent()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.OnComicSelected(position);
            }
        });
        }
    }

    @Override
    public int getItemCount() {
        return mCharacterList.size();
    }
}
