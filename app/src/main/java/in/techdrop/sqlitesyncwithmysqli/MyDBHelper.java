package in.techdrop.sqlitesyncwithmysqli;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Carl_johnson on 22-06-2017.
 */

public class MyDBHelper extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DB_NAME = "employee.db";
    private static final String TABLE_NAME = "emp_details";
    private static final String COL_ID = "id";
    private static final String COL_FIRSTNAME = "firstname";
    private static final String COL_LASTNAME = "lastname";
    private static final String COL_ADDRESS = "address";
    private static final String COL_MOBILE = "mobile";

    private static final String LOGCAT = "Log";

    public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DB_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query; query = "CREATE TABLE " + TABLE_NAME +" ( " + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_FIRSTNAME + " TEXT , " + COL_LASTNAME + " TEXT , " + COL_ADDRESS + " TEXT ," + COL_MOBILE + " TEXT )";
        db.execSQL(query);
        Log.d(LOGCAT,"Students Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXITS " + TABLE_NAME);
        onCreate(db);
    }

    //Add New Row to Database
    public void add_row(Employee employee)
    {
        ContentValues values = new ContentValues();
        values.put(COL_FIRSTNAME ,employee.getFirstName());
        values.put(COL_LASTNAME ,employee.getLastName());
        values.put(COL_ADDRESS ,employee.getAddress());
        values.put(COL_MOBILE ,employee.getMobile());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NAME, null , values);
        db.close();
    }

    public void delete_emp(String emp)
    {
        SQLiteDatabase db = getWritableDatabase();
        //db.execSQL("DELETE FROM" + TABLE_NAME + "WHERE" + COL_ID = emp ");
    }




}
