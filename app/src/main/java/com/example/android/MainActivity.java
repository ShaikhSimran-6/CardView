package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;

import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    api key - 0vw87uLfvsG4Kr2MDuTZpkyiZGmWSMco7IyJ12KA

    private CardStackAdapter stackAdapter;
    private CardStackLayoutManager manager;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardStackView cardStackView = findViewById(R.id.swipe_card);
        manager = new CardStackLayoutManager(this, new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {

                Log.d(TAG, "ON CARD DRAGGING: d = " + direction.name() + " ratio = " + ratio);

            }

            @Override
            public void onCardSwiped(Direction direction) {

                Log.d(TAG, "ON CARD SWIPED : P = " + manager.getTopPosition() + " d = " + direction);
                
                if (direction == Direction.Right){
                    Toast.makeText(MainActivity.this, "Direction Right", Toast.LENGTH_SHORT).show();
                } else if (direction == Direction.Left) {
                    Toast.makeText(MainActivity.this, "Direction Left", Toast.LENGTH_SHORT).show();
                } else if (direction == Direction.Top) {
                    Toast.makeText(MainActivity.this, "Direction Top", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Direction Bottom", Toast.LENGTH_SHORT).show();
                }


                if (manager.getTopPosition() == stackAdapter.getItemCount() - 5){
//                    paginate();
                }
            }

            @Override
            public void onCardRewound() {

                Log.d(TAG, "ON CARD REWOUND: " + manager.getTopPosition());

            }

            @Override
            public void onCardCanceled() {

                Log.d(TAG, "ON CARD CANCELLED: " + manager.getTopPosition());

            }

            @Override
            public void onCardAppeared(View view, int position) {

                Log.d(TAG, "ON CARD APPEARED: " + position);

            }

            @Override
            public void onCardDisappeared(View view, int position) {

                Log.d(TAG, "ON CARD DISAPPEARED: " + position);

            }
        });

        manager.setStackFrom(StackFrom.None);
        manager.setVisibleCount(5);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(20.0f);
        manager.setDirections(Direction.FREEDOM);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());

//        stackAdapter = new CardStackAdapter(addList());

        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(stackAdapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());

    }

//    private void paginate() {
//
//        List<ModalClass> old = stackAdapter.getModalClassList();
//        List<ModalClass> newList = new ArrayList<>(addList());
//        CardStackCallback callback = new CardStackCallback(old, newList);
//        DiffUtil.DiffResult result = DiffUtil.calculateDiff(callback);
//        stackAdapter.setModalClassList(newList);
//        result.dispatchUpdatesTo(stackAdapter);
//
//
//    }

//    private List<ModalClass> addList() {

//        List<ModalClass> items = new ArrayList<>();
//        items.add(new ModalClass("Yes", "No", "Maybe", "No Idea"));
//        items.add(new ModalClass("press Enter two times", ". insert <BLINE>", "insert <BR> tag", "press Shift + Enter"));
//        items.add(new ModalClass("AGENT", "USER", "HTTP_USER_AGENT", "None of the above"));
//        items.add(new ModalClass("HTTPGetAction", "TCPSocketAction", "Maybe", "No Idea"));
//        items.add(new ModalClass("Yes", "No", "Maybe", "No Idea"));
//        items.add(new ModalClass("Yes", "No", "Maybe", "No Idea"));
//        items.add(new ModalClass("Yes", "No", "Maybe", "No Idea"));
//        return items;
//    }


}