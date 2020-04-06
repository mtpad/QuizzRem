CREATE TABLE Four_Choice(
 ID                 INT          NOT NULL PRIMARY KEY       COMMENT '四択ID'    ,
 PROBLEM        VARCHAR(100)     NOT NULL                   COMMENT '問題文'    ,
 CHOICE1		VARCHAR(20)      NOT NULL                   COMMENT '問題文1'   ,
 CHOICE2		VARCHAR(20)      NOT NULL                   COMMENT '問題文2'   ,
 CHOICE3		VARCHAR(20)      NOT NULL                   COMMENT '問題文3'   ,
 CHOICE4		VARCHAR(20)      NOT NULL                   COMMENT '問題文4'	 
);

DROP TABLE FOUR_CHOICE

INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  1  , 
				  '世界には日本の総面積の4倍を誇るゴビ砂漠などがありますが、サハラ砂漠の「サハラ」は日本語でどういう意味でしょうか。' ,
				  '砂漠' ,
				  '小さな' ,
				  '生き物が生きられない' ,
				  '膨大な' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  2  , 
				  '謝謝や再見など、今や街中でもよく見る中国語ですが、「手紙」は中国語でなんという意味でしょうか。' ,
				  'トイレットペーパー' ,
				  'メール' ,
				  'ティッシュ' ,
				  'お札'  
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  3  , 
				  '日本ではイカを杯で数えたり、ペンギンやうさぎを羽で数えたりしますが、蝶はなんと数えるでしょうか。' ,
				  '頭' ,
				  '対' ,
				  '針' ,
				  '羽' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  4  , 
				  'リニューアルで話題になったゲゲゲの鬼太郎、このアニメのメインキャストであるねずみ男の出身地は？' ,
				  'ロシア' ,
				  '江戸' ,
				  '越後' ,
				  '薩摩' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  5  , 
				  'ルパン三世の次元の早打ちは0.3秒、ゴルゴ13の早打ちは0.13秒、ではのび太の早打ちは？' ,
				  '0.1' ,
				  '0.2' ,
				  '0.3' ,
				  '0.4' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  6  , 
				  '畑の肉と言えば大豆、森のバターと言えばアボカドなど、野菜には豊富な栄養が含まれていますが、もっともカロリーが少ないとギネス認定された野菜は？' ,
				  'きゅうり' ,
				  'キャベツ' ,
				  'ナス' ,
				  'レタス' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  7  , 
				  '人の血液型を調べるABO式血液検査、これをキャベツの汁にかけるとキャベツは全て何型になった？' ,
				  'O型' ,
				  'AB型' ,
				  'A型' ,
				  'B型'  
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  8  , 
				  'カバは日焼け止めの効果のある汗をかくが、その色は？' ,
				  '赤' ,
				  '茶色' ,
				  '黒' ,
				  '緑' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  9  , 
				  '昨今問題になっている地球温暖化ですが、世界で排出されている温室効果ガスで最も多いものはなんでしょうか。' ,
				  '牛のゲップ' ,
				  '車の排気ガス' ,
				  '人間の呼気' ,
				  '人間の汗' 
				  ) ;
INSERT INTO Four_Choice ( ID ,  PROBLEM  , CHOICE1 , CHOICE2 , CHOICE3 , CHOICE4  )
                  VALUES  (
				  10 , 
				  '水族館でサイズの異なる魚が同時に展示されていることがありますが、なぜサメは魚をたべないのでしょうか。' ,
				  'おなかいっぱいだから' ,
				  '一緒に展示されている他の魚がまずいから' ,
				  '強い魚しかいない水槽で展示されているから' ,
				  'みんなが見てるから' 
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
