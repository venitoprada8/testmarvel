package vp.com.farmatodo.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import vp.com.farmatodo.MyApplication;
import vp.com.farmatodo.R;
import vp.com.farmatodo.adapters.ComicListAdapter;
import vp.com.farmatodo.data.MarvelApiService;
import vp.com.farmatodo.databinding.ComicFragmentLayoutBinding;
import vp.com.farmatodo.model.comics.Comic;

public class StoriesFragment extends Fragment implements ComicListAdapter.OnComicItemClickListener {

    List<Comic> mComicList;
    ComicFragmentLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.comic_fragment_layout,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.comicList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onResume() {
        super.onResume();
        MarvelApiService service = MyApplication.getInstance().getRestAdapter().create(MarvelApiService.class);
        service.getCharacters().subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            mComicList = comic.getData().getComics();
            binding.comicList.setAdapter(new ComicListAdapter(getActivity(), mComicList, this));
        }, Throwable::printStackTrace);
    }

    @Override
    public void OnComicSelected(int position) {

       /* Comic comic = mComicList.get(position);
        Intent intent = ComicDetailActivity.newInstance(getActivity(), comic.getThumbnail(), comic.getTitle(), comic.getId(), true);
        getActivity().startActivity(intent);*/
    }
}
