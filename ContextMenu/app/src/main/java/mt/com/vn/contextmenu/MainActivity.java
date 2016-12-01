package mt.com.vn.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvContextMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        registerForContextMenu(tvContextMenu);
    }

    private void initViews() {
        tvContextMenu = (TextView) findViewById(R.id.tvContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.item_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int choose = item.getItemId();
        switch (choose){
            case R.id.itBlue:
                tvContextMenu.setTextColor(getResources().getColor(R.color.colorBlue));
                break;
            case R.id.itGreen:
                tvContextMenu.setTextColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.itRed:
                tvContextMenu.setTextColor(getResources().getColor(R.color.colorRed));
                break;
        }
        return super.onContextItemSelected(item);
    }
}
