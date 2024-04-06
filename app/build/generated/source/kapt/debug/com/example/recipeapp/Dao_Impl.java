package com.example.recipeapp;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  public Dao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<Recipe> getAll() {
    final String _sql = "SELECT * FROM recipe";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
      final int _cursorIndexOfTittle = CursorUtil.getColumnIndexOrThrow(_cursor, "tittle");
      final int _cursorIndexOfDes = CursorUtil.getColumnIndexOrThrow(_cursor, "des");
      final int _cursorIndexOfIng = CursorUtil.getColumnIndexOrThrow(_cursor, "ing");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final List<Recipe> _result = new ArrayList<Recipe>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Recipe _item;
        final String _tmpImg;
        if (_cursor.isNull(_cursorIndexOfImg)) {
          _tmpImg = null;
        } else {
          _tmpImg = _cursor.getString(_cursorIndexOfImg);
        }
        final String _tmpTittle;
        if (_cursor.isNull(_cursorIndexOfTittle)) {
          _tmpTittle = null;
        } else {
          _tmpTittle = _cursor.getString(_cursorIndexOfTittle);
        }
        final String _tmpDes;
        if (_cursor.isNull(_cursorIndexOfDes)) {
          _tmpDes = null;
        } else {
          _tmpDes = _cursor.getString(_cursorIndexOfDes);
        }
        final String _tmpIng;
        if (_cursor.isNull(_cursorIndexOfIng)) {
          _tmpIng = null;
        } else {
          _tmpIng = _cursor.getString(_cursorIndexOfIng);
        }
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        _item = new Recipe(_tmpImg,_tmpTittle,_tmpDes,_tmpIng,_tmpCategory);
        _item.uid = _cursor.getInt(_cursorIndexOfUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
