CREATE TABLE Four_Choice(
 ID                 INT          NOT NULL PRIMARY KEY       COMMENT '�l��ID'    ,
 PROBLEM        VARCHAR(100)     NOT NULL                   COMMENT '��蕶'    ,
 CHOICE1		VARCHAR(20)      NOT NULL                   COMMENT '��蕶1'   ,
 CHOICE2		VARCHAR(20)      NOT NULL                   COMMENT '��蕶2'   ,
 CHOICE3		VARCHAR(20)      NOT NULL                   COMMENT '��蕶3'   ,
 CHOICE4		VARCHAR(20)      NOT NULL                   COMMENT '��蕶4'	 
);

DROP TABLE FOUR_CHOICE

INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  1  , 
				  '���E�ɂ͓��{�̑��ʐς�4�{���ւ�S�r�����Ȃǂ�����܂����A�T�n�������́u�T�n���v�͓��{��łǂ������Ӗ��ł��傤���B' ,
				  '����' ,
				  '������' ,
				  '���������������Ȃ�' ,
				  '�c���' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  2  , 
				  '�ӎӂ�Č��ȂǁA����X���ł��悭���钆����ł����A�u�莆�v�͒�����łȂ�Ƃ����Ӗ��ł��傤���B' ,
				  '�g�C���b�g�y�[�p�[' ,
				  '���[��' ,
				  '�e�B�b�V��' ,
				  '���D'  
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  3  , 
				  '���{�ł̓C�J��t�Ő�������A�y���M���₤�������H�Ő������肵�܂����A���͂Ȃ�Ɛ�����ł��傤���B' ,
				  '��' ,
				  '��' ,
				  '�j' ,
				  '�H' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  4  , 
				  '���j���[�A���Řb��ɂȂ����Q�Q�Q�̋S���Y�A���̃A�j���̃��C���L���X�g�ł���˂��ݒj�̏o�g�n�́H' ,
				  '���V�A' ,
				  '�]��' ,
				  '�z��' ,
				  '�F��' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  5  , 
				  '���p���O���̎����̑��ł���0.3�b�A�S���S13�̑��ł���0.13�b�A�ł͂̂ё��̑��ł��́H' ,
				  '0.1' ,
				  '0.2' ,
				  '0.3' ,
				  '0.4' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  6  , 
				  '���̓��ƌ����Α哤�A�X�̃o�^�[�ƌ����΃A�{�J�h�ȂǁA��؂ɂ͖L�x�ȉh�{���܂܂�Ă��܂����A�����Ƃ��J�����[�����Ȃ��ƃM�l�X�F�肳�ꂽ��؂́H' ,
				  '���イ��' ,
				  '�L���x�c' ,
				  '�i�X' ,
				  '���^�X' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  7  , 
				  '�l�̌��t�^�𒲂ׂ�ABO�����t�����A������L���x�c�̏`�ɂ�����ƃL���x�c�͑S�ĉ��^�ɂȂ����H' ,
				  'O�^' ,
				  'AB�^' ,
				  'A�^' ,
				  'B�^'  
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  8  , 
				  '�J�o�͓��Ă��~�߂̌��ʂ̂��銾���������A���̐F�́H' ,
				  '��' ,
				  '���F' ,
				  '��' ,
				  '��' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  9  , 
				  '�������ɂȂ��Ă���n�����g���ł����A���E�Ŕr�o����Ă��鉷�����ʃK�X�ōł��������̂͂Ȃ�ł��傤���B' ,
				  '���̃Q�b�v' ,
				  '�Ԃ̔r�C�K�X' ,
				  '�l�Ԃ̌ċC' ,
				  '�l�Ԃ̊�' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  10 , 
				  '�����قŃT�C�Y�̈قȂ鋛�������ɓW������Ă��邱�Ƃ�����܂����A�Ȃ��T���͋������ׂȂ��̂ł��傤���B' ,
				  '���Ȃ������ς�������' ,
				  '�ꏏ�ɓW������Ă��鑼�̋����܂�������' ,
				  '�������������Ȃ������œW������Ă��邩��' ,
				  '�݂�Ȃ����Ă邩��' 
				  ) ;
				  
				  
				  
SELECT
id,
problem,
choice1,
choice2,
choice3,
choice4 
FROM
Four_Choice
WHERE
id = ?
