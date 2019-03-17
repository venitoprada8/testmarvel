package vp.com.farmatodo.activities;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.squareup.picasso.Picasso;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;
import vp.com.farmatodo.MyApplication;
import vp.com.farmatodo.R;
import vp.com.farmatodo.data.MarvelApiService;
import vp.com.farmatodo.databinding.ComicDetailLayoutBinding;
import vp.com.farmatodo.model.comics.Thumbnail;


/**
 * Created by rahulrv on 8/9/15.
 */
public class ComicDetailActivity extends AppCompatActivity {

    private static final String ARG_URL = "argUrl";
    private static final String ARG_TITLE = "argTitle";
    private static final String ARG_ID = "argId";
    private static final String ARG_IS_COMIC = "argIsComic";

    public static Intent newInstance(Context context, Thumbnail url, String title, int id, boolean isComic) {
        Intent intent = new Intent(context, ComicDetailActivity.class);
        intent.putExtra(ARG_URL, url);
        intent.putExtra(ARG_TITLE, title);
        intent.putExtra(ARG_ID, id);
        intent.putExtra(ARG_IS_COMIC, isComic);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComicDetailLayoutBinding binding =  DataBindingUtil.setContentView(this, R.layout.comic_detail_layout);
        Thumbnail thumbnail = (Thumbnail) getIntent().getSerializableExtra(ARG_URL);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getIntent().getStringExtra(ARG_TITLE));
        if (thumbnail != null) {
            String url = thumbnail.getPath() + "/landscape_incredible." + thumbnail.getExtension();
            Picasso.with(this).load(url).into(binding.backdrop);
        }

        int id = getIntent().getIntExtra(ARG_ID, 0);
        if (id > 0) {
            MarvelApiService service = MyApplication.getInstance().getRestAdapter().create(MarvelApiService.class);
            boolean isComic = getIntent().getBooleanExtra(ARG_IS_COMIC, false);
          /*  if (isComic) {
                service.getComic(id).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
                    Timber.d("comic");
                    if (comic.getData().getResult() != null) {
                        binding.row1.setText(comic.getData().getResult().get(0).getDescription());
                    }

                },throwable -> {
                    Timber.e("Error fetcing comics");
                });
            } else {
                service.getCharacter(id).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
                    Timber.d("character");
                    if (comic.getData().getResult() != null) {
                        binding.row1.setText(comic.getData().getResult().get(0).getDescription());
                    }

                });
            }*/
        }

    }


}

