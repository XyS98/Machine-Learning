-- 创建数据库
create database helping default character set utf8 collate utf8_bin;

-- 切换库
use helping;

-- 如果存在着先删除
drop table if exists adminInfo;

--  登录部分的
-- 如果不存在则创建
create table if not exists adminInfo
(
  aid   int primary key auto_increment, -- 管理员账号
  aname varchar(100) not null unique,   --  管理员呢陈
  pwd   varchar(100) not null,          -- 管理员密码
  tel   varchar(15)  not null unique    -- 手机号
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 会员表 雇主表 雇员表
create table if not exists memberInfo
(
  mno      int primary key auto_increment,
  nickName varchar(100),                 -- 呢陈
  realName varchar(100),                 -- 真实姓名
  pwd      varchar(100) not null,        -- 密码
  tel      varchar(15)  not null unique, -- 手机号码
  email    varchar(100) not null unique, -- 邮箱
  money    DECIMAL(10, 2) default 0,-- 账号余额
  photo    varchar(100),                 -- 图像
  zfb      varchar(100),                 -- 支付宝账号
  wx       varchar(100),                 -- 微信账号
  bankcard varchar(100),-- 银行卡
  regDate  datetime,                     -- 注册日期
  status   int                           -- 账号状态
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 任务权重 / 会员账单表/金额字段
-- 行业类型表
create table if not exists industry
(
  indno   int primary key auto_increment,
  indname varchar(100)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 工作类型表
create table if not exists works
(
  wno   int primary key auto_increment,
  indno int,
  wname varchar(100),
  constraint FK_works_industry foreign key works (indno) references industry (indno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 细分工作表
create table if not exists worksItem
(
  wino   int primary key auto_increment,
  winame varchar(100), -- 细分工作名字
  wno    int,-- 工作id
  constraint FK_worksItem_works foreign key worksItem (wno) references works (wno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 会员技能表
create table if not exists skill
(
  skno int primary key auto_increment,
  mno  int, -- 会员编号
  wino int,-- 细分工作编号
  constraint FK_skill_memberInfo foreign key skill (mno) references memberInfo (mno),
  constraint FK_skill_worksItem foreign key skill (wino) references worksItem (wino)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 任务表
create table if not exists task
(
  tno        varchar(100) primary key,
  mno        int,           -- 雇主编号
  empno      int,-- 雇员编号 只针对投标类任务
  picloc     varchar(400),  -- 图片路径
  docloc     varchar(400),  -- 文档路径
  wino       int,           -- 细分工作编号
  title      varchar(400),  -- 简介
  descr      text,          -- 任务详情
  tasktype   int,-- 0投标, 1 悬赏
  price      DECIMAL(10, 2),-- 成交酬金额
  taskweight int,           -- 任务权重
  ischecked  int,           -- 0 没,> 0 有,如果有一审二审,则用1,2,3来代替 一审是敏感词的那个 数据库里有但是为0则是保存起来了
  constraint FK_task_memberInfo foreign key task (mno) references memberInfo (mno),
  constraint FK_task_worksItem foreign key task (wino) references worksItem (wino)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 悬赏表
create table if not exists pound
(
  pno       varchar(100) primary key,
  tno       varchar(100),-- 任务编号
  hunternum int,-- 入围人数,即分赏金的人数check
  bounty    DECIMAL(10, 2), -- 赏金
  shareplan varchar(100),-- 赏金分配方式
  constraint FK_pound_task foreign key pound (tno) references task (tno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 任务时间链表
create table if not exists timeList
(
  tlno        int primary key auto_increment,
  tno         varchar(100),
  releaseTime date,-- 发布需求
  bidTime     date, -- 威客投标
  selectTime  date, -- 雇主选标
  paingTime   date, -- 托管赏金
  workTime    date,-- 威客工作
  checkTime   date,-- 验收付款
  constraint FK_timeList_task foreign key timeList (tno) references task (tno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 投标表
create table if not exists selected
(
  sbno       int primary key auto_increment,
  tno        varchar(100), -- 投标任务表 no
  mno        int,          -- -- 雇员表 no
  isselected int,          -- 投标方式的0 未选中, 1 选中  悬赏方式的0 未选中, 1,2,3,4选中,并代表第几名
  descr      text,         -- 提交任务详情
  picloc     varchar(100), -- 图片路径
  uploadfile varchar(100), -- 附件路径
  constraint FK_selected_task foreign key selected (tno) references task (tno),
  constraint FK_selected_memberInfo foreign key selected (mno) references memberInfo (mno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 任务收藏,用户收藏,服务收藏放一起
create table if not exists collections
(
  cono        int primary key auto_increment,
  collectType int, -- 1 任务收藏 2 用户收藏  3 服务收藏   只有对应的数值才会存放值
  tlno        int,-- 任务时间链
  mno         int,-- 收藏的会员编号
  sbno        int,-- 投标编号
  constraint FK_collections_timeList foreign key collections (tlno) references timeList (tlno),
  constraint FK_collections_memberInfo foreign key collections (mno) references memberInfo (mno),
  constraint FK_collections_selected foreign key collections (sbno) references selected (sbno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 账单类型表
create table if not exists billtype
(
  btno      int(10) primary key,-- 财务类型编号
  btname    varchar(100),       -- 财务类型名字
  moneyflow int(10)             -- 金钱流向 0 代表支出 1 收入
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 账单表
create table if not exists bill
(
  bno    varchar(100) primary key, -- 时间戳+三位随机数+
  mno    int,                      -- 会员编号
  descr  varchar(100),             -- 摘要
  amount DECIMAL(10, 2),           -- 金额数量
  btno   int(10),-- 财务类型编号
  bdate  timestamp,                -- 交易时间
  constraint FK_bill_memberInfo foreign key bill (mno) references memberInfo (mno),
  constraint FK_bill_billtype foreign key bill (btno) references billtype (btno)
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;

-- 消息记录
create table if not exists messages
(
  mesno     bigint primary key,
  sessionId bigint, -- 消息会话id
  content   text,-- 消息内容
  chatterA  int,    -- 聊天者A的 memberId
  chatterB  int     -- 聊天者B的 memberId
) ENGINE = InnoDB
  default charset = utf8
  collate = utf8_bin;