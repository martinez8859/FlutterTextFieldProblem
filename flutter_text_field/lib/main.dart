import 'package:flutter/material.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: Material(
          child: Column(children: <Widget>[
        TextField(
          decoration: InputDecoration(hintText: "Text Field"),
        ),
        TextFormField(
          decoration: InputDecoration(hintText: "Text Form Field"),
        )
      ])),
    );
  }
}
