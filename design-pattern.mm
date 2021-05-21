<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="设计模式" FOLDED="false" ID="ID_1499084802" CREATED="1621581776876" MODIFIED="1621582305567" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle">
    <properties edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff" fit_to_viewport="false" show_note_icons="true"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node" STYLE="oval" UNIFORM_SHAPE="true" VGAP_QUANTITY="24.0 pt">
<font SIZE="24"/>
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="default" ICON_SIZE="12.0 pt" COLOR="#000000" STYLE="fork">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.attributes">
<font SIZE="9"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.note" COLOR="#000000" BACKGROUND_COLOR="#ffffff" TEXT_ALIGN="LEFT"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000" STYLE="oval" SHAPE_HORIZONTAL_MARGIN="10.0 pt" SHAPE_VERTICAL_MARGIN="10.0 pt">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,5"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,6"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,7"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,8"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,9"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,10"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,11"/>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="4" RULE="ON_BRANCH_CREATION"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      内容源于《重学Java设计模式》
    </p>
    <p>
      这本书最大的好处是有对比，作者将最直接的实现和经过设计模式重构后的实现都呈现了出来，更容易体会设计模式的优势。
    </p>
  </body>
</html>

</richcontent>
<node TEXT="1 设计原则" POSITION="right" ID="ID_239005337" CREATED="1621581918631" MODIFIED="1621583813085">
<icon BUILTIN="idea"/>
<edge COLOR="#ff0000"/>
</node>
<node TEXT="2 创建型模式" POSITION="right" ID="ID_618255297" CREATED="1621581938214" MODIFIED="1621583822791">
<icon BUILTIN="launch"/>
<edge COLOR="#0000ff"/>
<node TEXT="2.1 工厂方法模式" ID="ID_1475277871" CREATED="1621582136686" MODIFIED="1621582372082">
<node ID="ID_1826740627" CREATED="1621582733843" MODIFIED="1621584207620"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
    <p>
      爱奇艺发放奖品
    </p>
  </body>
</html>

</richcontent>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      奖品分为三类：兑换卡、优惠券、实物奖品。
    </p>
    <p>
      
    </p>
    <p>
      分发规则：根据用户积分分级, 对不同级别用户分别发放不同的奖品。
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_347178730" CREATED="1621582813578" MODIFIED="1621583945840"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
    <p>
      if ... else ... 区分并发放
    </p>
  </body>
</html>

</richcontent>
<node TEXT="工程结构" ID="ID_521547436" CREATED="1621586004986" MODIFIED="1621586017691">
<font BOLD="true"/>
<node TEXT="基础包" ID="ID_1811297370" CREATED="1621586076586" MODIFIED="1621586090223"><richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      └── src
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;└── main
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── org
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── itstack
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── demo
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── design
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── card
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── IQiYiCard.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── IQiYiCardService.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── coupon
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── CouponInfo.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── CouponResult.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── CouponService.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── goods
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── DeliverReq.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── GoodsInfo.java
    </p>
    <p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── GoodsService.java
    </p>
  </body>
</html>

</richcontent>
</node>
<node TEXT="待优化包" ID="ID_1027259510" CREATED="1621586152762" MODIFIED="1621586587494"/>
</node>
<node ID="ID_1521753688" CREATED="1621583312224" MODIFIED="1621583686785"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>缺点</b>：
    </p>
    <p>
      随着奖品种类增多会堆叠if...else..., 且使的当前类变得臃肿,类依赖变得复杂
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_591624497" CREATED="1621583637092" MODIFIED="1621583763564"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>优点</b>：
    </p>
    <p>
      实现简单，如果奖品种类很少且打死都不会拓展新的奖品种类，这样实现或许更好
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
<node ID="ID_1685133196" CREATED="1621583224719" MODIFIED="1621584160059"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>
    </p>
  </body>
</html>

</richcontent>
<node ID="ID_1902281608" CREATED="1621584426319" MODIFIED="1621585913932"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>行为</b>：新定义一个创建对象的接口, 对应物品类新定义工厂子类实现接口，工厂子类自己决定实例化哪一个物品类
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
<node ID="ID_904224045" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>

</richcontent>
<node TEXT="改造前" ID="ID_1033191340" CREATED="1621585761412" MODIFIED="1621585775993"/>
</node>
</node>
<node TEXT="2.2 抽象工厂模式" ID="ID_1662090383" CREATED="1621582141173" MODIFIED="1621582380945">
<node ID="ID_50993056" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_1531305274" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_7007050" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1258883784" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="2.3 建造者模式" ID="ID_980920728" CREATED="1621582150069" MODIFIED="1621582709144">
<node ID="ID_233441247" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1757141457" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_527503582" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_644717996" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="2.4 原型模式" ID="ID_16522580" CREATED="1621582310116" MODIFIED="1621582714559">
<node ID="ID_277348608" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1841391341" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1916933957" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1602459745" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="2.5 单例模式" ID="ID_643118808" CREATED="1621582314556" MODIFIED="1621582726679">
<node ID="ID_1452045885" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1422139544" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_511315549" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1731574074" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="3 结构型模式" POSITION="right" ID="ID_1457078181" CREATED="1621581957086" MODIFIED="1621583826718">
<icon BUILTIN="launch"/>
<edge COLOR="#00ff00"/>
<node TEXT="3.1 适配器模式" ID="ID_1739029985" CREATED="1621582325148" MODIFIED="1621582663273">
<node ID="ID_546565705" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_692455240" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_593692209" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1870892208" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.2 桥接模式" ID="ID_1987817500" CREATED="1621582334700" MODIFIED="1621582668071">
<node ID="ID_1845045788" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_843793809" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1544523361" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_574690009" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.3 组合模式" ID="ID_1716860083" CREATED="1621582341468" MODIFIED="1621582674616">
<node ID="ID_1546322554" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_371949542" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_268040119" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1338903034" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.4 装饰器模式" ID="ID_860690187" CREATED="1621582350637" MODIFIED="1621582679542">
<node ID="ID_307123230" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1265180288" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_57136487" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1023807539" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.5 外观模式" ID="ID_560297108" CREATED="1621582455051" MODIFIED="1621582684519">
<node ID="ID_450512003" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1010832215" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_653400040" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1967910488" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.6 享元模式" ID="ID_1150633853" CREATED="1621582461492" MODIFIED="1621582693920">
<node ID="ID_221759824" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_351518285" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_889043817" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1747287521" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="3.7 代理模式" ID="ID_1557091701" CREATED="1621582479852" MODIFIED="1621582698967">
<node ID="ID_282197086" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1652273514" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_578200562" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1048755191" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="4 行为模式" POSITION="right" ID="ID_753949401" CREATED="1621581995798" MODIFIED="1621583830086">
<icon BUILTIN="launch"/>
<edge COLOR="#ff00ff"/>
<node TEXT="4.1 责任链模式" ID="ID_499869354" CREATED="1621582518835" MODIFIED="1621582535600">
<node ID="ID_940795495" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_573126466" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1566433560" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_161594286" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.2 命令模式" ID="ID_476389492" CREATED="1621582535851" MODIFIED="1621582542720">
<node ID="ID_1696926284" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1599839603" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1498821468" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1437223250" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.3 迭代器模式" ID="ID_567665826" CREATED="1621582542923" MODIFIED="1621582566512">
<node ID="ID_914791170" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1350001995" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1273842977" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1471623386" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.4 中介者模式" ID="ID_1604936064" CREATED="1621582566675" MODIFIED="1621582581344">
<node ID="ID_1130620443" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_674536582" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1032710473" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_120600954" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.5 备忘录模式" ID="ID_1486421912" CREATED="1621582581547" MODIFIED="1621582592775">
<node ID="ID_1166154989" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1278675028" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_157304417" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1153739705" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.6 观察者模式" ID="ID_1632521264" CREATED="1621582593019" MODIFIED="1621582606935">
<node ID="ID_832191566" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1599128410" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1550661102" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_430544981" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.7 状态模式" ID="ID_239416244" CREATED="1621582607283" MODIFIED="1621582619585">
<node ID="ID_1399141631" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_512126911" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1282227814" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_260411054" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.8 策略模式" ID="ID_380595179" CREATED="1621582619962" MODIFIED="1621582627816">
<node ID="ID_1087903426" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_200182311" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1356729547" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_926792186" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.9 模板模式" ID="ID_1140655447" CREATED="1621582628363" MODIFIED="1621582636263">
<node ID="ID_410697197" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1658399776" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1990132838" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1094707628" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="4.10 访问模式" ID="ID_21713187" CREATED="1621582636626" MODIFIED="1621582654559">
<node ID="ID_1571540413" CREATED="1621582733843" MODIFIED="1621583545395"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>案例</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1010743662" CREATED="1621582813578" MODIFIED="1621583527565"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>糟糕实现</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_353194662" CREATED="1621583224719" MODIFIED="1621583485183"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>模式主旨</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_270547030" CREATED="1621582864025" MODIFIED="1621583488486"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <b>改造后</b>：
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
</node>
</map>
