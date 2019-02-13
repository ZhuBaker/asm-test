字段 
这些指令读或写一个字段的值。 
GETFIELD owner name desc 弹出一个对象引用，并压和其 name 字段中的值。 
PUTFIELD owner name desc 弹出一个值和一个对象引用，并将这个值存储在它的 name 字段中。

在这两种情况下，该对象都必须是 owner 类型，它的字段必须为 desc 类型。 GETSTATIC 和 PUTSTATIC 是类似指令，但用于静态字段。