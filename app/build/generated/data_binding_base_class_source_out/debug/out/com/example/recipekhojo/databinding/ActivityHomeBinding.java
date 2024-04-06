// Generated by view binder compiler. Do not edit!
package com.example.recipekhojo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recipekhojo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView dessert;

  @NonNull
  public final ImageView drink;

  @NonNull
  public final HorizontalScrollView horizontalScrollView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView mainDish;

  @NonNull
  public final ImageView more;

  @NonNull
  public final RecyclerView rvPopular;

  @NonNull
  public final ImageView salad;

  @NonNull
  public final EditText search;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView dessert,
      @NonNull ImageView drink, @NonNull HorizontalScrollView horizontalScrollView,
      @NonNull ImageView imageView3, @NonNull ImageView mainDish, @NonNull ImageView more,
      @NonNull RecyclerView rvPopular, @NonNull ImageView salad, @NonNull EditText search,
      @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.dessert = dessert;
    this.drink = drink;
    this.horizontalScrollView = horizontalScrollView;
    this.imageView3 = imageView3;
    this.mainDish = mainDish;
    this.more = more;
    this.rvPopular = rvPopular;
    this.salad = salad;
    this.search = search;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dessert;
      ImageView dessert = ViewBindings.findChildViewById(rootView, id);
      if (dessert == null) {
        break missingId;
      }

      id = R.id.drink;
      ImageView drink = ViewBindings.findChildViewById(rootView, id);
      if (drink == null) {
        break missingId;
      }

      id = R.id.horizontalScrollView;
      HorizontalScrollView horizontalScrollView = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.mainDish;
      ImageView mainDish = ViewBindings.findChildViewById(rootView, id);
      if (mainDish == null) {
        break missingId;
      }

      id = R.id.more;
      ImageView more = ViewBindings.findChildViewById(rootView, id);
      if (more == null) {
        break missingId;
      }

      id = R.id.rv_popular;
      RecyclerView rvPopular = ViewBindings.findChildViewById(rootView, id);
      if (rvPopular == null) {
        break missingId;
      }

      id = R.id.salad;
      ImageView salad = ViewBindings.findChildViewById(rootView, id);
      if (salad == null) {
        break missingId;
      }

      id = R.id.search;
      EditText search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, dessert, drink,
          horizontalScrollView, imageView3, mainDish, more, rvPopular, salad, search, textView2,
          textView3, textView4, textView5, textView6, textView7, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}