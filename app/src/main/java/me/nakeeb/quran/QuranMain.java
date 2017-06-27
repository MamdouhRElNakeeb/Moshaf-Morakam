package me.nakeeb.quran;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;

public class QuranMain extends AppCompatActivity implements OnPageChangeListener {

    public static final String QURAN_PDF = "quran.pdf";

    public static final int MOSHAF_PAGES_NO = 834;

    // Quran parts pages no.
    public static final int p1 = 3;
    public static final int p2 = 28;
    public static final int p3 = 54;
    public static final int p4 = 83;
    public static final int p5 = 110;
    public static final int p6 = 133;
    public static final int p7 = 157;
    public static final int p8 = 183;
    public static final int p9 = 207;
    public static final int p10 = 234;

    public static final int p11 = 259;
    public static final int p12 = 286;
    public static final int p13 = 311;
    public static final int p14 = 337;
    public static final int p15 = 363;
    public static final int p16 = 390;
    public static final int p17 = 418;
    public static final int p18 = 445;
    public static final int p19 = 473;
    public static final int p20 = 502;

    public static final int p21 = 528;
    public static final int p22 = 556;
    public static final int p23 = 586;
    public static final int p24 = 615;
    public static final int p25 = 641;
    public static final int p26 = 670;
    public static final int p27 = 700;
    public static final int p28 = 731;
    public static final int p29 = 760;
    public static final int p30 = 794;


    public static final int index = 832;



    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    int lastPage = 834;

    PDFView pdfView;

    Toolbar toolbar;
    NavigationView navigationView;
    private DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran_activity);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.quranDL);

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        initDrawer();


        pdfView = (PDFView) findViewById(R.id.pdfView);

        prefs = getSharedPreferences("userReads", MODE_PRIVATE);
        editor = prefs.edit();

        lastPage = prefs.getInt("lastPage", lastPage);

        pdfView.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        pdfView.fromAsset(QURAN_PDF)
                .defaultPage(lastPage)
                .enableSwipe(true)
                .swipeVertical(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .showPageWithAnimation(true)
                .load();

    }

    private void initDrawer(){


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.index:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - index);
                        navigationView.getMenu().getItem(0).setChecked(true);
                        return true;

                    case R.id.p1:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p1);
                        navigationView.getMenu().getItem(1).setChecked(true);
                        return true;

                    case R.id.p2:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p2);
                        navigationView.getMenu().getItem(2).setChecked(true);
                        return true;

                    case R.id.p3:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p3);
                        navigationView.getMenu().getItem(3).setChecked(true);
                        return true;

                    case R.id.p4:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p4);
                        navigationView.getMenu().getItem(4).setChecked(true);
                        return true;

                    case R.id.p5:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p5);
                        navigationView.getMenu().getItem(5).setChecked(true);
                        return true;

                    case R.id.p6:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p6);
                        navigationView.getMenu().getItem(6).setChecked(true);
                        return true;

                    case R.id.p7:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p7);
                        navigationView.getMenu().getItem(7).setChecked(true);
                        return true;

                    case R.id.p8:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p8);
                        navigationView.getMenu().getItem(8).setChecked(true);
                        return true;

                    case R.id.p9:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p9);
                        navigationView.getMenu().getItem(9).setChecked(true);
                        return true;

                    case R.id.p10:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p10);
                        navigationView.getMenu().getItem(10).setChecked(true);
                        return true;

                        // 2nd 10
                    case R.id.p11:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p11);
                        navigationView.getMenu().getItem(11).setChecked(true);
                        return true;

                    case R.id.p12:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p12);
                        navigationView.getMenu().getItem(12).setChecked(true);
                        return true;

                    case R.id.p13:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p13);
                        navigationView.getMenu().getItem(13).setChecked(true);
                        return true;

                    case R.id.p14:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p14);
                        navigationView.getMenu().getItem(14).setChecked(true);
                        return true;

                    case R.id.p15:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p15);
                        navigationView.getMenu().getItem(15).setChecked(true);
                        return true;

                    case R.id.p16:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p16);
                        navigationView.getMenu().getItem(16).setChecked(true);
                        return true;

                    case R.id.p17:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p17);
                        navigationView.getMenu().getItem(17).setChecked(true);
                        return true;

                    case R.id.p18:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p18);
                        navigationView.getMenu().getItem(18).setChecked(true);
                        return true;

                    case R.id.p19:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p19);
                        navigationView.getMenu().getItem(19).setChecked(true);
                        return true;

                    case R.id.p20:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p20);
                        navigationView.getMenu().getItem(20).setChecked(true);
                        return true;

                        // 3rd 10
                    case R.id.p21:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p21);
                        navigationView.getMenu().getItem(21).setChecked(true);
                        return true;

                    case R.id.p22:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p22);
                        navigationView.getMenu().getItem(22).setChecked(true);
                        return true;

                    case R.id.p23:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p23);
                        navigationView.getMenu().getItem(23).setChecked(true);
                        return true;

                    case R.id.p24:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p24);
                        navigationView.getMenu().getItem(24).setChecked(true);
                        return true;

                    case R.id.p25:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p25);
                        navigationView.getMenu().getItem(25).setChecked(true);
                        return true;

                    case R.id.p26:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p26);
                        navigationView.getMenu().getItem(26).setChecked(true);
                        return true;

                    case R.id.p27:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p27);
                        navigationView.getMenu().getItem(27).setChecked(true);
                        return true;

                    case R.id.p28:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p28);
                        navigationView.getMenu().getItem(28).setChecked(true);
                        return true;

                    case R.id.p29:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p29);
                        navigationView.getMenu().getItem(29).setChecked(true);
                        return true;

                    case R.id.p30:
                        mDrawerLayout.closeDrawer(Gravity.END);
                        pdfView.jumpTo(MOSHAF_PAGES_NO - p30);
                        navigationView.getMenu().getItem(30).setChecked(true);
                        return true;

                    default:
                        return false;
                }
            }
        });
    }


    @Override
    public void onPageChanged(int page, int pageCount) {
        lastPage = page;

    }

    @Override
    protected void onPause() {
        super.onPause();

        editor.putInt("lastPage", lastPage);
        editor.apply();
    }
}
