package navac.asia.myapplication.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RemoteViews;

import navac.asia.myapplication.R;
import navac.asia.myapplication.ScreenUtility;

public class Main10Activity extends AppCompatActivity {

    private static final String TAG = "Main10Activity";
    public static final int NOTIFICATION_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        ScreenUtility screenUtility = new ScreenUtility(Main10Activity.this);
        Log.d(TAG, "onCreate: getWidth " + screenUtility.getWidth());
        Log.d(TAG, "onCreate: getHeight " + screenUtility.getHeight());

        sendNotification();
    }

    /**
     * Send simple notification using the NotificationCompat API.
     */
    public void sendNotification() {

        // Use NotificationCompat.Builder to set up our notification.
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        //icon appears in device notification bar and right hand corner of notification
        builder.setSmallIcon( android.R.mipmap.sym_def_app_icon);

        builder.setOngoing(true);

        RemoteViews v =new RemoteViews(getPackageName(),R.layout.testui);
        CharSequence charSequence = "hiiiiiiiiiiiiii";
        v.setTextViewText(R.id.text,charSequence);
                //LayoutInflater.from(getApplicationContext()).inflate(R.layout.recycler_item,null,false);
        builder.setContent(v);


        // This intent is fired when notification is clicked
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stacktips.com/"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        // Set the intent that will fire when the user taps the notification.
        builder.setContentIntent(pendingIntent);

        // Large icon appears on the left of the notification
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), android.R.mipmap.sym_def_app_icon));

        // Content title, which appears in large type at the top of the notification
        builder.setContentTitle("Notifications Title");

        // Content text, which appears in smaller text below the title
        builder.setContentText("Your notification content here.");

        // The subtext, which appears under the text on newer devices.
        // This will show-up in the devices with Android 4.2 and above only
        builder.setSubText("Tap to view documentation about notifications.");

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // Will display the notification in the notification bar
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
