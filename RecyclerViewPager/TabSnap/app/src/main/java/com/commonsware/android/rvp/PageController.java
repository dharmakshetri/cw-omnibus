/***
 Copyright (c) 2016 CommonsWare, LLC
 Licensed under the Apache License, Version 2.0 (the "License"); you may not
 use this file except in compliance with the License. You may obtain a copy
 of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 by applicable law or agreed to in writing, software distributed under the
 License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 OF ANY KIND, either express or implied. See the License for the specific
 language governing permissions and limitations under the License.

 From _The Busy Coder's Guide to Android Development_
 https://commonsware.com/Android
 */

package com.commonsware.android.rvp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

class PageController extends RecyclerView.ViewHolder {
  private final EditText editor;

  PageController(View itemView) {
    super(itemView);

    editor=(EditText)itemView.findViewById(R.id.editor);
  }

  void setText(String text) {
    editor.setText(text);
    editor.setHint(toString());
  }

  String getText() {
    return(editor.getText().toString());
  }

  @Override
  public String toString() {
    return(getTitle(editor.getContext(), getAdapterPosition()));
  }

  static String getTitle(Context ctxt, int position) {
    return(ctxt.getString(R.string.hint, position+1));
  }
}
