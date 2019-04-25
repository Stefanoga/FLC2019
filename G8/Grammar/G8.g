grammar G8;

begin	:	'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT (list)*
    	; 
	
list	:	('LINE:' line | 'TRIANGLE:' triangle | 'RECT:' rectangle | 'CURV:' curve | 'CIRC:' circle | 'ELLIPS:' ellipse)
	;

line 	:	 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ('COLOR' RGB)? ('WIDTH' FLOAT)? 
	;

triangle 	:	 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ('COLOR' RGB)? ('WIDTH' FLOAT)? ('COLORBODY' RGB)?
	;

rectangle 	:	 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ('COLOR' RGB)? ('WIDTH' FLOAT)? ('COLORBODY' RGB)?
	;

curve 	:	 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ('COLOR' RGB)? ('WIDTH' FLOAT)? ('COLORBODY' RGB)?
	;

circle 	:	 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ('STARTANGLE' FLOAT)? ('ENDANGLE' FLOAT)? ('COLOR' RGB)? ('WIDTH' FLOAT)? ('COLORBODY' RGB)?
	;

ellipse 	:	 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ('STARTANGLE' FLOAT)? ('ENDANGLE' FLOAT)? ('ROTATION' ROTATION)? ('COLOR' RGB)? ('WIDTH' FLOAT)? ('COLORBODY' RGB)?
	;

RGB	
	:	'#' ('0'..'9' | 'A'..'F' )+
	;

TEXT	
	:	('a'..'z' | 'A'..'Z' | '0'..'9')+
	;

FLOAT	
	:   ((('0'..'9')+ ('.' ('0'..'9')*))	|	('0'..'9')+)
    ;

ROTATION	
	:	'-' ('0'..'9')+ '.' ('0'..'9')*
    |	('0'..'9')+ '.' ('0'..'9')*
    |	'-' ('0'..'9')+
    |	('0'..'9')+
	;

COMMENT	
	:   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
WS	:   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;