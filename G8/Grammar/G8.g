grammar G8;

begin	: G8
	;

drawLine:	LINE
	;

drawTriangle:	TRIANGLE
	;

drawRectangle:	RECTANGLE
	;

drawCurve:	CURVE
	;

drawCircle:	CIRCLE
	;

drawEllipse:	ELLIPSE
	;

G8 	:	'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT (LIST)*
    ; 
	
LIST	:	('LINE' LINE | 'TRIANGLE' TRIANGLE | 'RECT' RECTANGLE | 'CURV' CURVE | 'CIRC' CIRCLE | 'ELLIPS' ELLIPSE)
	;

LINE 	:	 'XSTARTL' FLOAT 'YSTARTL' FLOAT 'XENDL' FLOAT 'YENDL' FLOAT ('COLOR' RGB)? ('WIDTH' FLOAT)? 
	;

TRIANGLE 	:	 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ('COLORBORDER' RGB)? ('WIDTHBORDER' FLOAT)? ('COLORBODY' RGB)?
	;

RECTANGLE 	:	 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ('COLORBORDER' RGB)? ('WIDTHBORDER' FLOAT)? ('COLORBODY' RGB)?
	;

CURVE 	:	 'XSTARTC' FLOAT 'YSTARTC' FLOAT 'XENDC' FLOAT 'YENDC' FLOAT ('COLORBORDER' RGB)? ('WIDTHBORDER' FLOAT)? ('COLORBODY' RGB)?
	;

CIRCLE 	:	 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ('COLORBORDER' RGB)? ('WIDTHBORDER' FLOAT)? ('COLORBODY' RGB)?
	;

ELLIPSE 	:	 'XCENTERE' FLOAT 'YCENTERE' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ('COLORBORDER' RGB)? ('WIDTHBORDER' FLOAT)? ('COLORBODY' RGB)?
	;

RGB	:	('0'..'9' | 'A'..'F' )+
	;

TEXT	:	('a'..'z' | 'A'..'Z' | '0'..'9')+
	;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* '.' ('0'..'9')*
    |   ('0'..'9')+ 
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;