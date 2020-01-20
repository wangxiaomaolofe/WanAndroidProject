package com.example.wanandroid;

import java.util.ArrayList;

import com.example.wanandroid.entity.TabEntity;
import com.example.wanandroid.module.find.View.FindFragment;
import com.example.wanandroid.module.follow.View.FollowFragment;
import com.example.wanandroid.module.home.view.HomeFragment;
import com.example.wanandroid.module.mine.View.MineFragment;
import com.example.wanandroid.utils.ViewFindUtils;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import me.jessyan.autosize.AutoSize;

public class MainActivity extends AppCompatActivity {

	private View mDecorView;
	private CommonTabLayout mTabLayout;
	private ArrayList<Fragment> mFragments = new ArrayList<>();
	private String[] mTitles = {"首页", "", "", ""};
	private int[] mIconUnSelectIds = {
		R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
		R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
	private int[] mIconSelectIds = {
		R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
		R.mipmap.tab_contact_select, R.mipmap.tab_more_select};
	private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//====== 适配所有的进程 ======
		AutoSize.initCompatMultiProcess(this);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		for (int i = 0; i < mTitles.length; i++) {
			mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnSelectIds[i]));
		}
		mFragments.add(new HomeFragment());
		mFragments.add(new MineFragment());
		mFragments.add(new FindFragment());
		mFragments.add(new FollowFragment());
		mDecorView = getWindow().getDecorView();
		mTabLayout = ViewFindUtils.find(mDecorView, R.id.tl_main);
		mTabLayout.setTabData(mTabEntities, this, R.id.fl_main, mFragments);
		mTabLayout.showDot(2);
	}

}
